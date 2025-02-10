import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BancoDeDados {
    private List<Livro> books;
    private List<Funcionario> employees;
    private List<Usuario> users;

    private String pesquisaDeLocacao = "error";
    private String pesquisaDeDelecao;
    private String pesquisaDeAtualizacao;
    String atualizacao;

    private int bookIdCounter = 1;
    private int employeeCounter = 1;
    private int usersCounter = 1;

    Scanner scan = new Scanner(System.in);


    public BancoDeDados(){
        books = new ArrayList<>();
        employees = new ArrayList<>();
        users = new ArrayList<>();
    }


    public void postBook(Livro livro){
        livro.setId(bookIdCounter);
        books.add(livro);
        bookIdCounter ++;
    }


    public void getBook(){
        for (Livro livro : books){
            System.out.println(livro);
        }
    }


    public void showAvailableBooks() {
        for (Livro livro : books){
            if (livro.isEstadoLocacao()){
                System.out.println(livro);
            }
            System.out.println();
        }
    }


    public void postEmployee(Funcionario funcionario) {
        funcionario.setId(employeeCounter);
        employees.add(funcionario);
        employeeCounter ++;
    }


    public void getEmployee() {
        for (Funcionario funcionario: employees) {
            System.out.println(funcionario);
        }
    }


    public void postUsers(Usuario usuario){
        usuario.setId(usersCounter);
        users.add(usuario);
        usersCounter++;
    }


    public void getUsers(){
        for (Usuario usuario : users){
            System.out.println(usuario);
        }
    }

    public void deleteBook() {
        System.out.println("Digite o titulo do livro que deseja deletar: ");
        pesquisaDeDelecao = scan.nextLine();
        for (Livro livro : books) {
            if (livro.getTitulo().equals(pesquisaDeDelecao)) {
                books.remove(livro);
                System.out.println("Livro '"+livro.getTitulo()+"' excluido com sucesso");

            } else {
                System.out.println("O livro não foi encontrado");
            }
            break;
        }

    }

    public void putBook() {
        System.out.println("Digite o titulo do livro que sera alterado");
        pesquisaDeAtualizacao = scan.nextLine();
        for (Livro livro : books) {
            if (livro.getTitulo().equals(pesquisaDeAtualizacao)) {
                byte op = 0;
                do {
                    System.out.println("Escolha uma opção abaixo\n" +
                            "[0] - Voltar\n" +
                            "[1] - Atualizar titulo\n" +
                            "[2] - Atualizar genero\n" +
                            "[3] - Atualizar autor\n");
                    op = scan.nextByte();

                    switch (op) {
                        case 0:
                            System.out.println("Voltando");
                            break;

                        case 1:    // Testar em producao
                            System.out.println("Digite o novo titulo do livro '" + livro.getTitulo() + "'");
                            scan.nextLine();
                            atualizacao = scan.nextLine();
                            livro.setTitulo(atualizacao);
                            break;

                        case 2:
                            System.out.println("Digite o novo genero do livro '" + livro.getTitulo() + "'");
                            scan.nextLine();
                            atualizacao = scan.nextLine();
                            livro.setGenero(scan.nextLine());
                            break;

                        case 3:
                            System.out.println("Digite o novo autor do livro '" + livro.getTitulo() + "'");
                            scan.nextLine();
                            atualizacao = scan.nextLine();
                            livro.setAutor(scan.nextLine());
                            break;

                        default:
                            System.out.println("Opcao invalida");
                    }

                } while (op != 0);

            } else {
                System.out.println("O livro nao foi encontrado");
            }
            break;

        }
    }

    public void rentBook() {
        System.out.println("Digite o titulo do livro que sera locado");
        pesquisaDeLocacao = scan.nextLine();
        for (Livro livro : books){
            if(livro.getTitulo().equals(pesquisaDeLocacao)){
                System.out.println(livro);

                if (livro.isEstadoLocacao()){
                    System.out.println("Livro disponivel");
                    livro.setEstadoLocacao(false);
                    System.out.println("locado com sucesso!");
                }else {
                    System.out.println("O livro já foi locado");
                }

            }else {

                System.out.println("Livro nao encontrado");
                break;
            }
        }

    }


    public void returnBook() {
        System.out.println("Digite o titulo do livro para fazer a devolucao");
        pesquisaDeLocacao = scan.nextLine();
        for (Livro livro : books){
            if (pesquisaDeLocacao.equals(livro.getTitulo())){
                System.out.println(livro);

                if (!livro.isEstadoLocacao()){
                    System.out.println("Livro devolvido com sucesso!");
                    livro.setEstadoLocacao(true);

                }else {
                    System.out.println("Este livro não foi locado");
                }


            }else{
                System.out.println("O livro não foi encontrado!");
            }
        }
    }


    @Override
    public String toString() {
        return "BancoDeDados{" +
                "pesquisaDeLocacao='" + pesquisaDeLocacao + '\'' +
                "pesquisaDeDelecao='" + pesquisaDeDelecao + '\'' +
                "pesquisaDeAtualizacao='" + pesquisaDeAtualizacao + '\'' +
                "atualizacao='" + atualizacao + '\'' +
                '}';
    }


    public String getPesquisaDeLocacao() {
        return pesquisaDeLocacao;
    }

    public void setPesquisaDeLocacao(String pesquisaDeLocacao) {
        this.pesquisaDeLocacao = pesquisaDeLocacao;
    }


}
