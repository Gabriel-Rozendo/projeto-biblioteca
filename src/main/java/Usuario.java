import java.util.Scanner;

public class Usuario {
    private int id;
    private String nome;
    private long codigo;
    private long cpf;
    private Endereco endereco;
    private String email;
    private UserType tipoDeUsuario;
    private boolean tipoValido = false;

    Scanner scan = new Scanner(System.in);




    public void cadastrarUsuario() {
        System.out.println("Digite o nome do usuario");
        setNome(scan.nextLine());
        System.out.println("Digite o codigo do usuario");
        setCodigo(scan.nextLong());
        System.out.println("Digite o cpf do usuario");
        setCpf(scan.nextLong());
        System.out.println("Digite o email do usuario");
        setEmail(scan.next());

        while (!tipoValido) {
            System.out.println("Digite o tipo do usuario (ADMIN, BASIC, STUDENT)");
            String tipoInput = scan.nextLine().toUpperCase();

            try {
                setTipoDeUsuario(UserType.valueOf(tipoInput));
                tipoValido = true;
            } catch (IllegalArgumentException e) {
                System.out.println("Tipo inválido. Por favor, tente novamente.");
            }
        }
        System.out.println("Digite o endereco do usuario");
        var endereco = new Endereco();
        endereco.local();


    }

    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", codigo=" + codigo +
                ", cpf=" + cpf +
                ", email='" + email + '\'' +
                ", tipoDeUsuario=" + tipoDeUsuario + '\'' +
                ", Endereço: " + getEndereco()+
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public UserType getTipoDeUsuario() {
        return tipoDeUsuario;
    }

    public void setTipoDeUsuario(UserType tipoDeUsuario) {
        this.tipoDeUsuario = tipoDeUsuario;
    }
}
