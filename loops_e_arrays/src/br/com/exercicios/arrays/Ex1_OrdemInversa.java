package br.com.exercicios.arrays;

public class Ex1_OrdemInversa {

    public static void main(String[] args) {

        // int[] => array
        int[] vetor = {0, -5, 50, -1, 8, 15};

        System.out.println("Vetor : ");
        int count = 0;
        while (count < (vetor.length)) {
            System.out.print(vetor[count] + " ");
            count++;
        }

        System.out.println("\nVetor ordem Inversa: ");
        for (int i = (vetor.length - 1); i >= 0; i--) {
            System.out.print(vetor[i] + " ");
        }
    }
}
