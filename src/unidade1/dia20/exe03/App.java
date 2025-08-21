package unidade1.dia20.exe03;

public class App {
    public static void main(String[] args) {

        ContaBancaria conta1 = new ContaBancaria();
        conta1.setNumero("001");
        conta1.setTitular("João");

        ContaBancaria conta2 = new ContaBancaria();
        conta2.setNumero("002");
        conta2.setTitular("Maria");


        conta1.depositar(1000);
        conta1.depositar(700);


        conta2.depositar(5000);


        conta2.sacar(3000);


        conta2.transferir(conta1, 1800);


        System.out.println("\n--- Saldo Final ---");
        System.out.println(conta1.getTitular() + " (Conta " + conta1.getNumero() + "): R$ " + conta1.getSaldo());
        System.out.println(conta2.getTitular() + " (Conta " + conta2.getNumero() + "): R$ " + conta2.getSaldo());
    }
}
