package br.com.desafios;

import java.io.IOException;
import java.util.Scanner;

//Leia um valor inteiro N. Este valor será a quantidade de valores que serão lidos em seguida
// Para cada valor lido, mostre uma mensagem em inglês dizendo se
// este valor lido é par (EVEN), ímpar (ODD), positivo (POSITIVE)
// ou negativo (NEGATIVE). No caso do valor ser igual a zero (0),
// embora a descrição correta seja (EVEN NULL), pois por definição
// zero é par, seu programa deverá imprimir apenas NULL.
//
//    Entrada
//        A primeira linha da entrada contém um valor inteiro
//        N(N < 10000) que indica o número de casos de teste.
//        Cada caso de teste a seguir é um valor inteiro
//        X (-107 < X <107).

public class parEimpar {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int N = leitor.nextInt();
        for (int i = 0; i < N; i++) {
            int x = leitor.nextInt();
            if (x == 0) System.out.println("NULL");
            else if (x % 2 == 0 && x > 0) System.out.println("EVEN POSITIVE");
            else if (x % 2 == 0 && x < 0) System.out.println("EVEN NEGATIVE");
            else if (x > 0) System.out.println("ODD POSITIVE");
            else System.out.println("ODD NEGATIVE");
        }
    }
}
