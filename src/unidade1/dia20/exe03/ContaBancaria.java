package unidade1.dia20.exe03;

public class ContaBancaria {
    private String numero;
    private String titular;
    private double saldo;

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    // Depositar valor positivo
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito realizado: R$ " + valor);
        } else {
            System.out.println("Valor inválido para depósito.");
        }
    }

    // Sacar valor válido sem deixar saldo negativo
    public void sacar(double valor) {
        if (valor > 0 && saldo >= valor) {
            saldo -= valor;
            System.out.println("Saque realizado: R$ " + valor);
        } else {
            System.out.println("Saque inválido. Saldo insuficiente ou valor negativo.");
        }
    }

    // Transferir valor de uma conta para outra
    public void transferir(ContaBancaria contaDestino, double valor) {
        if (valor > 0 && saldo >= valor) {
            this.sacar(valor);
            contaDestino.depositar(valor);
            System.out.println("Transferência de R$ " + valor + " para " + contaDestino.getTitular() + " realizada.");
        } else {
            System.out.println("Transferência inválida.");
        }
    }
}
