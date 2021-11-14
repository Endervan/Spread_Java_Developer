package br.com.exercicios.arrays;

import java.util.Random;

public class Ex3_numerosAleatorios {

    public static void main(String[] args) {
        // Random cria numeros aleatorios
        Random aleatorios = new Random();


        // igual int numerosAleatorios[] = new int[20];
        int[] numerosAleatorios = new int[20];

        for (int i = 0; i < numerosAleatorios.length; i++) {
            int numero = aleatorios.nextInt(100);
            numerosAleatorios[i] = numero;
        }

        System.out.println("Numeros Aleatorios : ");
        for (int numero : numerosAleatorios) {
            System.out.println(numero + "");
        }

        System.out.println("\nSucessores Numeros Aleatorios : ");
        for (int numero : numerosAleatorios) {
            System.out.println((numero +1) + "");
        }
        System.out.println("\nAntessesores Numeros Aleatorios : ");
        for (int numero : numerosAleatorios) {
            System.out.println((numero -1) + "");
        }

    }
}
