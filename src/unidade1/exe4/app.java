package unidade1.exe4;

import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pessoa[] pessoasCadastradas = new Pessoa[3];

        for (int i = 0; i < 3; i++) {
            Pessoa pessoa = new Pessoa();

            System.out.println("--- Dados da Pessoa " + (i + 1) + " ---");

            System.out.print("Digite o nome: ");
            pessoa.setNome(scanner.nextLine());

            System.out.print("Digite o peso da pessoa " + (i + 1) + ": ");
            pessoa.setPeso(scanner.nextDouble());

            System.out.print("Digite a altura da pessoa " + (i + 1) + ": ");
            pessoa.setAltura(scanner.nextDouble());
            scanner.nextLine();

            pessoasCadastradas[i] = pessoa;
        }

        System.out.println("\n--- Exibindo IMCs em Ordem Inversa ---");
        for (int i = pessoasCadastradas.length - 1; i >= 0; i--) {
            Pessoa pessoaAtual = pessoasCadastradas[i];
            System.out.println("Nome: " + pessoaAtual.getNome());
            pessoaAtual.imc();
        }

        scanner.close();
    }
}
