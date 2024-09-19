package sistema;

public class Refrigerante extends Bebidas {

	public Refrigerante(String codBarras, String marca, String dataValidade, float precoCusto, float precoVenda, int estoque) {
        super(codBarras, marca, dataValidade, precoCusto, precoVenda, estoque);
    }

    public boolean verificarIdade(int idade) {
        return true;
     }
}
