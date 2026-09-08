package br.unipar.vetores;

import java.util.Scanner;

public class ATIVIDADEVETORES {

    public static void main(String[] args) {

        double totalfinal = 0;
        String[] nomes = new String[3];
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o nome 1: ");
        nomes[0] = sc.next();

        System.out.println("Informe o nome 2: ");
        nomes[1] = sc.next();

        System.out.println("Informe o nome 3: ");
        nomes[2] = sc.next();

        double[] preco = new double[3];

        System.out.println("Informe o preco 1: ");
        preco[0] = sc.nextDouble();

        System.out.println("Informe o preco 2: ");
        preco[1] = sc.nextDouble();

        System.out.println("Informe o preco 3: ");
        preco[2] = sc.nextDouble();

        double[] quantidades = new double[3];

        System.out.println("Informe a quantidade 1: ");
        quantidades[0] = sc.nextDouble();

        System.out.println("Informe a quantidade 2: ");
        quantidades[1] = sc.nextDouble();

        System.out.println("Informe a quantidade 3: ");
        quantidades[2] = sc.nextDouble();

        double[] subtotal = new double[3];
        subtotal[0] = preco[0] * quantidades[0];
        subtotal[1] = preco[1] * quantidades[1];
        subtotal[2] = preco[2] * quantidades[2];
        totalfinal = subtotal[0] + subtotal[1] + subtotal[2];

        System.out.println("O produto " + nomes[0] + " teve subtotal de " + subtotal[0]);
        System.out.println("O produto " + nomes[1] + " teve subtotal de " + subtotal[1]);
        System.out.println("O produto " + nomes[2] + " teve subtotal de " + subtotal[2]);
        System.out.println("O valor total da compra é: " + totalfinal);
    }
}