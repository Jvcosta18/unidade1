package unidade1.exe2;

import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pessoa pessoa = new Pessoa();

        System.out.println("Digite seu peso.");
        pessoa.peso = scanner.nextDouble();

        System.out.println("Digite sua altura.");
        pessoa.altura = scanner.nextDouble();

        pessoa.imc();
    }
}