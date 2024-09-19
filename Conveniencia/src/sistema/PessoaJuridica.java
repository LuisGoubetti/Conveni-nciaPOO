package sistema;
import java.util.Scanner;
public class PessoaJuridica extends Consumidor {

    private String CNPJ;

    public PessoaJuridica(String endereco, int idade) {
        super(endereco, idade);
        System.out.println("Digite o seu CNPJ: ");
        Scanner scanner = new Scanner(System.in);
        this.CNPJ = scanner.nextLine();
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    
    public boolean podeComprar(Bebidas bebida, int quantidade) {
        if (bebida instanceof Cerveja) {
            return getIdade() >= 18;
        }
        return true;
    }
}
