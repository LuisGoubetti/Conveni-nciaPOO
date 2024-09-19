package sistema;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Venda {
    private Consumidor cliente;
    private Bebidas bebida;
    private int quantidade;
    private float total;
    private String data = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));    
    private String hora = LocalDateTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss"));

    public Venda(Consumidor cliente, Bebidas bebida, int quantidade) {
        this.cliente = cliente;
        this.bebida = bebida;
        this.quantidade = quantidade;
    }

    public void realizarVenda() {
        if (cliente != null) {
            if (cliente.podeComprar(bebida, quantidade)) {
                if (bebida.getEstoque() >= quantidade) {
                    bebida.setEstoque(bebida.getEstoque() - quantidade);
                    calcularTotal();
                    System.out.println("Venda autorizada. Total: R$ " + total);
                } else {
                    System.out.println("Estoque insuficiente.");
                }
            } else {
                System.out.println("Venda não autorizada. Verifique os requisitos.");
            }
        } else {
            System.out.println("Cliente não definido.");
        }
    }

    private void calcularTotal() {
        float precoVenda = bebida.getPrecoCusto() * 0.5f; // Preço de venda é 50% do custo
        total = precoVenda * quantidade;
    }

    // Getters e Setters
    public Consumidor getCliente() {
        return cliente;
    }

    public void setCliente(Consumidor cliente) {
        this.cliente = cliente;
    }

    public Bebidas getBebida() {
        return bebida;
    }

    public void setBebida(Bebidas bebida) {
        this.bebida = bebida;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public float getTotal() {
        return total;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }
}
