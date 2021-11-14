package br.com.exercicios.loops;

import java.util.Scanner;

public class Ex_Fatorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Fatorial: ");
        int fatorial = scanner.nextInt();
        int multiplicacao = 1;

        System.out.println(fatorial + "! = ");
        for (int i = fatorial; i >= 1; i--) {
            multiplicacao = multiplicacao * i;
        }

        System.out.println(multiplicacao);
    }
}
