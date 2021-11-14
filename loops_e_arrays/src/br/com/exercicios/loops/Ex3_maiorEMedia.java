package br.com.exercicios.loops;

import java.util.Scanner;

public class Ex3_maiorEMedia {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero;
        int maior = 0;
        int soma = 0;


        int count = 0;
        do {
            System.out.println("Numero: ");
            numero = scanner.nextInt();

            soma = soma + numero;
            if (numero > maior) maior = numero;
            count = count + 1;
        } while (count < 5);

        System.out.println("Maior " + maior);
        System.out.println("Media " + (soma/5));

    }
}
