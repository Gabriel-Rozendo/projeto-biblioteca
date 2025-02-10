import java.util.Scanner;

public class Livro {
    private int id;
    private String titulo;
    private String genero;
    private String autor;
    private boolean estadoLocacao;
    // true = o livro está disponive
    // false = o livro foi locado

    Scanner scanner = new Scanner(System.in);


    public void cadastrarLivro() {
        System.out.println("Cadastrando o livro...");

        System.out.println("Digite o titulo do livro");
        titulo = scanner.nextLine();

        System.out.println("Gênero do livro: ");
        genero = scanner.nextLine();

        System.out.println("Autor do livro: ");
        autor = scanner.nextLine();

        setEstadoLocacao(true);
    }

    @Override
    public String toString() {
        return "Livro{" +
                "Id= '" + id + '\'' +
                ", Titulo='" + titulo + '\'' +
                ", Gênero='" + genero + '\'' +
                ", Autor='" + autor + '\'' +
                ", Disponibilidade='" + estadoLocacao + '\'' +
                '}';
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getGenero() {
        return genero;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }

    public boolean isEstadoLocacao() {
        return estadoLocacao;
    }

    public void setEstadoLocacao(boolean estadoLocacao) {
        this.estadoLocacao = estadoLocacao;
    }
}
