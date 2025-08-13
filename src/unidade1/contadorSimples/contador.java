package unidade1.contadorSimples;

public class contador {
    int valor = 0;

    void incrementar(){
      this.valor++;
    }
    void decrementar(){
        this.valor--;
    }
    void zerar() {
        this.valor = 0;
    }
    int obterValor() {
        return this.valor;
    }
    void exibirEstado() {
        System.out.println("Contador está em: " + this.valor);
    }

}
