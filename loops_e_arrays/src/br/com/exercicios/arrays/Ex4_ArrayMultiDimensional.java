package br.com.exercicios.arrays;

import java.util.Random;

public class Ex4_ArrayMultiDimensional {

    public static void main(String[] args) {
//        int num = 5;
//        for (int i = 0; i < 3; i++) {
//            num += i;
//            System.out.print(i);
//        }

        int[][] teste = {{4, 9, 8, 5}, {3, 0, 1, 5}, {1, 2, 7, 4}};
        System.out.println("teste" + teste[2][2]);

//        int num = 5, count1 = 1;
//        do {
//            num += count1;
//            System.out.println(num);
//        } while (count1 <= 3);

        int num = 5, count = 1;
        while(count <= 3) {
            ++count;
            num += count;
        }
        System.out.println(num);

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
                System.out.println(linha[0] + coluna++);
            }
            // pula linha
            System.out.println();

        }


    }
}
