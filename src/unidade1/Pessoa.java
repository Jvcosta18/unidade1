package unidade1;

public class Pessoa {

   double altura;
   double peso;


  void imc(){
      double imc = peso / (altura * altura);
      System.out.println("o imc é de" + imc);
   }
}
