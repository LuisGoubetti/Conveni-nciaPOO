package sistema;
import java.util.Scanner;
public class PessoaFisica extends Consumidor {

    private String CPF;

    public PessoaFisica(String endereco, int idade) {
        super(endereco, idade);
        System.out.println("Digite o seu CPF: ");
        Scanner scanner = new Scanner(System.in);
        this.CPF = scanner.nextLine();
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    
    public boolean podeComprar(Bebidas bebida, int quantidade) {
        if (bebida instanceof Cerveja) {
            return getIdade() >= 18;
        }
        return quantidade <= 10; 
    }
}
