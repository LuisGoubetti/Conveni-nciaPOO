package sistema;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String endereco;
        int idade;
        String tipoPessoa;
        int quantidade;
        
        Scanner scanner = new Scanner(System.in);
        
        Refrigerante coca = new Refrigerante("001", "coca", "12/12/2012", 5.0f, 7.0f, 52);
        Cerveja bhrama = new Cerveja("002", "brhama", "12/12/2012", 3.0f, 6.0f, 50);
        
        System.out.println("Digite o endereco do cliente: ");
        endereco = scanner.nextLine();
        System.out.println("Digite a idade do cliente: ");
        idade = scanner.nextInt();
        
        scanner.nextLine(); 

        System.out.println("Você é PJ ou PF? : ");
        tipoPessoa = scanner.nextLine().toUpperCase();
        
        Consumidor cliente;
        if (tipoPessoa.equals("PJ")) {
            cliente = new PessoaJuridica(endereco, idade);
        } else {
            cliente = new PessoaFisica(endereco, idade);
        }
    
        System.out.println("Digite a quantidade desejada: ");
        quantidade = scanner.nextInt();
        
        Bebidas bebida = bhrama;
        Venda venda = new Venda(cliente, bebida, quantidade);
        venda.realizarVenda();
       
        scanner.close();
    }
}