package unidade1.dia20;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Produto Produto = new Produto();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome do produto");
        String nome = scanner.nextLine();
        System.out.println("Digite o estoque do produto: ");
        int estoque = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Digite o preço do produto: ");
        double preco = scanner.nextDouble();
        scanner.nextLine();

        Produto.setNome(nome);
        Produto.repor(estoque);
        Produto.setPreco(preco);

        System.out.println("Quanto vc deseja repor?");
        int repor = scanner.nextInt();
        Produto.repor(repor);

        System.out.println("Quanto vc deseja vender?");
        int vender = scanner.nextInt();
        Produto.vender(vender);


        System.out.println("Digite um novo preço inválido (negativo ou zero):");
        double novoPreco = scanner.nextDouble();
        Produto.setPreco(novoPreco);

        // Exibe os dados finais do produto
        System.out.println("\n=== Dados do Produto ===");
        System.out.println("Nome: " + Produto.getNome());
        System.out.println("Estoque: " + Produto.getEstoque());
        System.out.println("Preço: R$ " + Produto.getPreco());
    }
}
