package br.com.exercicios.arrays;

import java.util.Scanner;

public class ex4_ParEImpar {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int quantNumeros;
        int numero;
        int quantPares = 0, quantImpares = 0;

        System.out.println("Quantidade de numeros : ");
        quantNumeros = scanner.nextInt();

        int count = 0;
        do {
            System.out.println("Numero : ");
            numero = scanner.nextInt();

            if (numero % 2 == 0) quantPares++; // =====  quantPares =  quantPares +1
            else quantImpares++;
            count++;
        } while (count < quantNumeros);

        System.out.println("Quantidades de pares e "+ quantPares);
        System.out.println("Quantidades de impares e "+ quantImpares);
    }
}
