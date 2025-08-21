package unidade1.dia20;

public class Produto {
    private String nome;
    private double preco;
    private int estoque;

    public void vender(int quantidade) {
        if (quantidade > 0 && quantidade <= estoque) {
            estoque -= quantidade;
            System.out.println("Venda realizada: " + quantidade + " unidades.");
        } else {
            System.out.println("Estoque insuficiente para vender " + quantidade + " unidades.");
        }
    }

    public void repor(int quantidade) {
        if (quantidade > 0) {
            estoque += quantidade;
            System.out.println("Reposição realizada: " + quantidade + " unidades.");
        } else {
            System.out.println("Quantidade inválida para reposição.");
        }
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco > 0) {
            this.preco = preco;
        } else {
            System.out.println("Preço inválido. O preço deve ser maior que zero.");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getEstoque() {
        return estoque;
    }
}
