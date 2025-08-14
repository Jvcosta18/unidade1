package unidade1.lampada06;

public class app {

    public static void main(String[] args) {
       lampada lampada = new lampada();



        lampada.mostrarStatus();

        lampada.ligar();
        lampada.mostrarStatus();

        System.out.println("\nAlternando o estado...");
        lampada.alternarEstado();
        lampada.mostrarStatus();

        System.out.println("\nTrocando a cor para Amarelo e alternando o estado...");
        lampada.trocarCor("Azul");
        lampada.alternarEstado();
        lampada.mostrarStatus();
    }
}

