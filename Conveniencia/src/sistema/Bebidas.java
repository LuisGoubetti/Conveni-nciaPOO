package sistema;

public abstract class Bebidas {
	
	private String codBarras;
    private String marca;
    private String dataValidade;
    private float precoCusto;
    private float precoVenda;
    private int estoque;

    public Bebidas(String codBarras, String marca, String dataValidade, float precoCusto, float precoVenda, int estoque) {
        this.codBarras = codBarras;
        this.marca = marca;
        this.dataValidade = dataValidade;
        this.precoCusto = precoCusto;
        this.precoVenda = precoVenda;
        this.estoque = estoque;
    }

    public String getCodBarras() {
        return codBarras;
    }

    public void setCodBarras(String codBarras) {
        this.codBarras = codBarras;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }

    public float getPrecoCusto() {
        return precoCusto;
    }

    public void setPrecoCusto(float precoCusto) {
        this.precoCusto = precoCusto;
    }

    public float getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(float precoVenda) {
        this.precoVenda = precoVenda;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public abstract boolean verificarIdade(int idade);

	
	
}
