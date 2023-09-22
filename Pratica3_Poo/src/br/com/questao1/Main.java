package br.com.questao1;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Normal n1 = new Normal(100);
        n1.imprimeingresso();

        Vip v1 = new Vip(100,50);
        v1.imprimeingresso();

        Camarote C1 = new Camarote(100,100,"Ala B");
        C1.imprimeingresso();

    }
}