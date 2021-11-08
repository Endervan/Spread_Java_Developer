package br.com.exercicios.arrays;


import java.util.Scanner;

public class Ex1_NomeEIdade {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String nome;
        int idade;

        while (true) {
            System.out.println("Nome: ");
            nome = scan.next();  // ler nome digitado
            if (nome.equals("0")) break; // para laco caso nome seja igual a zero
            System.out.println("Idade: ");
            idade = scan.nextInt();  // ler idade digitada (inteiro)
        }


    }

}
