package br.com.exercicios.arrays;

import java.util.Scanner;

public class Ex_Tabuada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Tabuada: ");
        int tabuada = scanner.nextInt();

        System.out.println("Tabuada de " + tabuada);

        for (int i = 0; i <= 10; i = i + 1) {
            System.out.println(tabuada + "x" + i + "=" + (tabuada * i));
        }

    }
}
