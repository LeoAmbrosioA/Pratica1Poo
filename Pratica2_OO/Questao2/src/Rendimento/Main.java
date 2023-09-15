package Rendimento;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o valor inicial do rendimento: ");
        double vrInicial = ler.nextDouble();

        System.out.println("Digite a taxa de juros ");
        double txJuros = ler.nextDouble();

        System.out.println("Digite o numero de meses para o Rendimento: ");
        int numMeses = ler.nextInt();

        rendimento r1 = new rendimento(vrInicial,txJuros,numMeses);
        r1.cauculaRendimento();



    }
}