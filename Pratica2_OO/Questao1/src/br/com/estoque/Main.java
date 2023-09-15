package br.com.estoque;

import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o nome do produto: ");
        String nome = scanner.nextLine();

        System.out.println("Informe a quantidade atual em estoque: ");
        int qtdAtual = scanner.nextInt();

        System.out.println("Informe a quantidade mínima em estoque: ");
        int qtdMinima = scanner.nextInt();

        Estoque estoque = new Estoque(nome, qtdAtual, qtdMinima);

        System.out.println("\nDados do estoque:");
        System.out.println(estoque.mostra());

        estoque.darBaixa(5);
        estoque.darBaixa(10);
        estoque.setQtdAtual(20);
        estoque.setQtdMinima(15);

        if (estoque.precisaRepor()) {
            System.out.println("\nÉ necessário repor o estoque.");
        } else {
            System.out.println("\nNão é necessário repor o estoque.");
        }

        System.out.println("\nDados do estoque atualizados:");
        System.out.println(estoque.mostra());

        scanner.close();
    }
}
