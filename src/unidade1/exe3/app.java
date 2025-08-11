package unidade1.exe3;
import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        for (int i = 1; i <= 3; i++) {
            Pessoa pessoa = new Pessoa();

            System.out.println("--- Dados da Pessoa " + i + " ---");
            System.out.println("Digite o peso da pessoa " + i);
            pessoa.peso = scanner.nextDouble();

            System.out.println("Digite a altura da pessoa " + i);
            pessoa.altura = scanner.nextDouble();

            pessoa.imc();
        }




    }
}