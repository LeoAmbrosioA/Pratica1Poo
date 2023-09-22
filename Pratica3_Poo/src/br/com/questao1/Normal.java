package br.com.questao1;

public class Normal extends Ingresso{
    public Normal (double valorIngresso){
    super(valorIngresso);
    }
    public void imprimeingresso(){
        System.out.println("Ingresso normal - valor:" + getValorIngresso());

    }
}
