package unidade1;

public class app {


    public static void main(String[] args) {
        Pessoa pessoa1;
        pessoa1 = new Pessoa();

       pessoa1.altura = 1.75;
       pessoa1.peso = 78;



        System.out.println("informacoes da pessoa");
        System.out.println("altura" + pessoa1.altura);
        System.out.println("peso" + pessoa1.peso + "KG");

        pessoa1.imc();

    }
}
