package br.com.estoque;

public class Estoque {

    private String nome;
    private int qtdAtual;
    private int qtdMinima;

    public Estoque() {
    }

    public Estoque(String nome, int qtdAtual, int qtdMinima) {
        this.nome = nome;
        setQtdAtual(qtdAtual); // Chama o setter para verificar se qtdAtual é válido
        this.qtdMinima = qtdMinima;
    }

    public int getQtdAtual() {
        return qtdAtual;
    }

    public String getNome() {
        return nome;
    }

    public int getQtdMinima() {
        return qtdMinima;
    }

    public void setQtdAtual(int qtdAtual) {
        if (qtdAtual >= 0) {
            this.qtdAtual = qtdAtual;
        } else {
            System.out.println("Quantidade atual não pode ser negativa.");
        }
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setQtdMinima(int qtdMinima) {
        this.qtdMinima = qtdMinima;
    }

    public void darBaixa(int qtde) {
        if (qtde > 0 && qtde <= qtdAtual) {
            qtdAtual -= qtde;
            System.out.println("Baixa de " + qtde + " unidades de " + nome + " realizada com sucesso.");
        } else {
            System.out.println("Quantidade inválida para dar baixa.");
        }
    }

    public String mostra() {
        return "Nome do Produto: " + nome + "\nQuantidade Mínima: " + qtdMinima + "\nQuantidade Atual: " + qtdAtual;
    }

    public boolean precisaRepor() {
        return qtdAtual <= qtdMinima;
    }
}
