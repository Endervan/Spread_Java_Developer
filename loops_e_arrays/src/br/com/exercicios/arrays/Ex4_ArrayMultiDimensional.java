package br.com.exercicios.arrays;

import java.util.Random;

public class Ex4_ArrayMultiDimensional {

    public static void main(String[] args) {
        // Random cria numeros aleatorios
        Random random = new Random();


        // ARRAYS 2 DIMENSAOES
        int[][] M = new int[4][4];

        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[i].length; j++) {
                M[i][j] = random.nextInt(9);
            }
        }

        System.out.println("Matriz: ");
        for (int[] linha : M) {
            for (int coluna : linha) {
                System.out.print(coluna + " ");
            }
            // pula linha
            System.out.println();
        }


    }
}
