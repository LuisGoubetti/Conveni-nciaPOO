package sistema;

public class Cerveja extends Bebidas {
	
	public Cerveja(String codBarras, String marca, String dataValidade, float precoCusto, float precoVenda, int estoque) {
        super(codBarras, marca, dataValidade, precoCusto, precoVenda, estoque);
    }

    public boolean verificarIdade(int idade) {
        return idade >= 18;
    }
	
}
