package Rendimento;

import java.text.NumberFormat;

public class rendimento {
    private double investimentoInicial;
    private double taxaRendimento;
    private int numMeses;

    public rendimento(double investimentoInicial, double taxaRendimento, int numMeses) {
        this.investimentoInicial = investimentoInicial;
        this.taxaRendimento = taxaRendimento;
        this.numMeses = numMeses;
    }

    public double getInvestimentoInicial() {
        return investimentoInicial;
    }

    public double getTaxaRendimento() {
        return taxaRendimento;
    }

    public int getNumMeses() {
        return numMeses;
    }

    public void setInvestimentoInicial(double investimentoInicial) {
        this.investimentoInicial = investimentoInicial;
    }

    public void setTaxaRendimento(double taxaRendimento) {
        this.taxaRendimento = taxaRendimento;
    }

    public void setNumMeses(int numMeses) {
        this.numMeses = numMeses;
    }

    public void cauculaRendimento(){
        double rendimentoMes;
        rendimentoMes=getInvestimentoInicial();
        System.out.println("Valor Inicial:" + NumberFormat.getCurrencyInstance().format(getInvestimentoInicial()));
        System.out.println("Taxa de Juros: " + NumberFormat.getPercentInstance().format(getTaxaRendimento()/100));
        for (int i=0;i < getNumMeses();i++)
        {
            rendimentoMes=rendimentoMes*getTaxaRendimento()/100+rendimentoMes;
            System.out.println("Mês" + (i+1) + ":" + NumberFormat.getCurrencyInstance().format(rendimentoMes));


        }
    }
}
