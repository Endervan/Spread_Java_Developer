package br.com.exercicios.arrays;

import java.util.Scanner;

public class Ex2_Consoantes {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] consoantes = new String[6];
        int quantConsoantes = 0;

        int count = 0;
        do {
            System.out.println("Letras: ");
            String letra = scanner.next();// pega o q usuario digitou
            if (!(letra.equalsIgnoreCase("a") |
                    letra.equalsIgnoreCase("e") |
                    letra.equalsIgnoreCase("i") |
                    letra.equalsIgnoreCase("o") |
                    letra.equalsIgnoreCase("u"))) {
                consoantes[count] = letra;
                quantConsoantes++;
            }

            count++;

        } while (count < consoantes.length);

        System.out.println("Consoantes: ");
        for (String consoante : consoantes) {
          if (consoante != null)  System.out.println(consoante + " ");
        }


    }
}
