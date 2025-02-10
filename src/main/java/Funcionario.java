import java.util.Scanner;

public class Funcionario {
    private int id;
    private String nome;
    private Long cpf;
    private String cargo;
    private double salario;
    private Endereco endereco;


    Scanner scan = new Scanner(System.in);

    public void cadastrarFuncionario () {
        System.out.println("Digite o nome do funcionario");
        nome = scan.nextLine();
        System.out.println("Digite o cpf do funcionario");
        cpf = scan.nextLong();
        System.out.println("Digite o cargo do funcionario");
        cargo = scan.next();
        System.out.println("Digite o salario do funcionario");
        salario = scan.nextDouble();
        System.out.println("Digite o endereco do funcionario");

        var endereco = new Endereco();
        endereco.local();
    }

    @Override
    public String toString() {
        return "Id: " + getId() +
                "\n Nome do funcionário: " + getNome() +
                "\n CPF: " + getCpf() +
                "Cargo: " + getCargo() +
                "\n Salário: R$ " + getSalario() +
                "\n Endereço: " + getEndereco();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCpf(Long cpf) {
        this.cpf = cpf;
    }
}

