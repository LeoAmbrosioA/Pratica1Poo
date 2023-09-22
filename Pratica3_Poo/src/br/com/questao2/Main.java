package br.com.questao2;

public class Main {
    public static void main(String[] args) {
        FPadrao fp = new FPadrao(1, "Leonardo", 10000 );
        System.out.println(fp.toString());

        FComissarionado fc = new FComissarionado(2, "thales", 1200,2,10000 );
        System.out.println(fc.toString());

        FComissarionado fco = new FComissarionado(1,"Guilherme", 1200,0.50,100);
        System.out.println(fco.toString());
    }
}
