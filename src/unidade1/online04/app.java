package unidade1.online04;

import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pessoa[] pessoasCadastradas = new Pessoa[3];

        for (int i = 0; i < pessoasCadastradas.length; i++) {
            pessoasCadastradas[i] = new Pessoa();
            System.out.println("--- Cadastro da Pessoa " + (i + 1) + " ---");

            System.out.print("Digite o nome: ");
            pessoasCadastradas[i].nome = scanner.nextLine();

            System.out.print("Digite a idade: ");
            pessoasCadastradas[i].idade = scanner.nextInt();

            System.out.print("Digite a altura  ");
            pessoasCadastradas[i].altura = scanner.nextDouble();


            scanner.nextLine();




        }
        System.out.println("\n--- Pessoas Cadastradas ---");
        for (int i = 0; i < pessoasCadastradas.length; i++) {
            pessoasCadastradas[i].apresentar();

            if (pessoasCadastradas[i].ehMaiorIdade()) {
                System.out.println("Status: Maior de idade.");
            } else {
                System.out.println("Status: Menor de idade.");
            }
            System.out.println("---------------------------");
        }

    }
    }
