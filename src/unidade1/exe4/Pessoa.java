package unidade1.exe4;

public class Pessoa {

    double altura;
    double peso;
    String nome;

    void imc(){
        double imc = peso / (altura * altura);
        System.out.println("o imc é de" + imc);
    }
}
