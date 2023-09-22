package br.com.questao2;

public class FProdutividade extends Funcionario{

    private double valor;
    private int producao;

    public FProdutividade(int matricula, String nome, double salario, double valor, int producao) {
        super(matricula, nome, salario);
        this.valor = valor;
        this.producao = producao;
    }

    public double getValor() {
        return valor;
    }

    public int getProducao() {
        return producao;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setProducao(int producao) {
        this.producao = producao;
    }

    public double caucularProventos() {
        return getSalario() + (getProducao() * getValor());
    }
        public String toString(){
            return"Nome: " + getNome() + "\n"+
                    "matricula: " +getMatricula()+ "\n"+
                    "Salario: " + caucularProventos();

            //polimorfismo quando repete varios metedos
            //classe abstrata nao pode ter objetos do tipo funcionario
            //e uma boa pratica a classe mae ser abstratas e as filhas concretas
    }
}
