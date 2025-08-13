package unidade1.contadorSimples;

public class app {
    public static void main(String[] args){
       contador  contador1 = new contador();
        contador  contador2 = new contador();

        System.out.println("\nIncrementando contador1 5 vezes:");
        contador1.incrementar();
        contador1.incrementar();
        contador1.incrementar();
        contador1.incrementar();
        contador1.incrementar();
        contador1.exibirEstado();

        System.out.println("\nDecrementando contador2 3 vezes:");
        contador2.decrementar();
        contador2.decrementar();
        contador2.decrementar();
        contador2.exibirEstado();

        System.out.println("\n--- Estados Atuais ---");
        System.out.print("Contador 1: ");
        contador1.exibirEstado();
        System.out.print("Contador 2: ");
        contador2.exibirEstado();

        System.out.println("\nZerando contador1 e exibindo novamente:");
        contador1.zerar();
        contador1.exibirEstado();

        System.out.println("\n--- Fim da Demonstração. ---");
    }

}
