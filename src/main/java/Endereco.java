import java.util.Scanner;

public class Endereco {
    private String rua;
    private String numero;
    private String bairro;

    Scanner scanner = new Scanner(System.in);

    public void local() {
        System.out.println("-_ Digite seu Endereco _-");
        System.out.print("Digite o nome da rua: ");
        setRua(scanner.nextLine());

        System.out.print("Digite o numero da sua casa: ");
        setNumero(scanner.nextLine());
        System.out.print("Digite o seu Bairro: ");
        setBairro(scanner.nextLine());
    }

    @Override
    public String toString() {
        return "Endereco{" +
                "rua='" + rua + '\'' +
                ", numero='" + numero + '\'' +
                ", bairro='" + bairro + '\'' +
                '}';
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
}