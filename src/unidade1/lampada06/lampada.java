package unidade1.lampada06;

public class lampada {

    boolean ligada;
    String cor;
    int potencia;



    public void ligar() {
        this.ligada = true;
    }

    public void desligar() {
        this.ligada = false;
    }

    public void alternarEstado() {
        this.ligada = !this.ligada;
    }

    public void trocarCor(String novaCor) {
        this.cor = novaCor;
    }

    public void mostrarStatus() {
        String estado = this.ligada ? "Ligada" : "Desligada";
        System.out.println("--- Status da Lâmpada ---");
        System.out.println("Estado: " + estado);
        System.out.println("Cor: " + this.cor);
        System.out.println("Potência: " + this.potencia + "W");
        System.out.println("-------------------------");
    }
}
