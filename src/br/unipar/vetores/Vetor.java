package br.unipar.vetores;

import java.util.Scanner;

public class Vetor {

    public static void main(String[] args){

        double nota1 = 0;
        double nota2 = 0;
        double nota3 = 0;
        double nota4 = 0;
        double nota5 = 0;


        // CRIEI UM VETOR
        double[] notas = new double[5];

        // GUARDEI O VALOR
        notas[0] = 10;
        notas[1] = 1.1;
        notas[2] = 7.3;
        notas[3] = 8.1;
        notas[4] = 3.2;

        //USEI O VALOR
        double media = notas[0] + notas[1] + notas[2] + notas[3] + notas[4] + notas[5];
        media = media / 5;

        System.out.println("Media final é: " + media);

        System.out.println("Qual foi a 3° nota " + notas[2]);
        System.out.println("Qual foi a 4° nota " + notas[3]);
        System.out.println("Qual foi a 5° nota " + notas[4]);

        String[] nomes = new String[5];
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o nome 1: ");
        nomes[0] = sc.next();

        System.out.println("Informe o nome 2: ");
        nomes[1] = sc.next();

        System.out.println("Informe o nome 3: ");
        nomes[2] = sc.next();

        System.out.println("Informe o nome 4: ");
        nomes[3] = sc.next();

        System.out.println("Informe o nome 5: ");
        nomes[4] = sc.next();




    }

}
