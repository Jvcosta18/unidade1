package unidade1.online04;

public class Pessoa {
    String nome;
    int idade;
    double altura;

    void apresentar(){
        System.out.println(" Olá, eu sou " + nome + " tenho " + idade + " anos " + " e " + altura + " m de altura");
    }
    int calcularIdadeEm(int ano){
        int anoAtual = 2025;
        int idadeEmAno = this.idade + (ano - anoAtual);
        return idadeEmAno;
    }
    boolean ehMaiorIdade(){
        return this.idade >= 18;
       }

        }



