package sistema;

public abstract class Consumidor {
    private String endereco;
    private int idade;

    public Consumidor(String endereco, int idade) {
        this.endereco = endereco;
        this.idade = idade;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public abstract boolean podeComprar(Bebidas bebida, int quantidade);
}
