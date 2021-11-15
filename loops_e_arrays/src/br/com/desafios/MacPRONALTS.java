package br.com.desafios;

import java.util.Locale;
import java.util.Scanner;


//O MacPRONALTS está com uma super promoção,
// exclusivo para os competidores da primeira
// Seletiva do MaratonaTEC. Só que teve um problema,
// todos os maratonistas foram tentar comprar
// ao mesmo tempo, com isso gerou uma fila muito grande.
// O pior é que a moça do caixa estava sem calculadora ou
// um programa para ajudá-la a calcular com maior agilidade,
// eis que surge você para fazer um programa para ajudar a
// coitada e aumentar a renda do MacPRONALTS. Segue o cardápio
// do dia contendo o número do produto e seu respectivo valor.

//        1001 | R$ 1.50
//
//        1002 | R$ 2.50
//
//        1003 | R$ 3.50
//
//        1004 | R$ 4.50
//
//        1005 | R$ 5.50

public class MacPRONALTS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        Locale.setDefault(new Locale("en", "US"));

        int produtos = 0, quantidade = 0;
        double res = 0, valor = 0;
        int N = Integer.parseInt(sc.nextLine());

        for (int x = 0; x < N; x++) {
            produtos = sc.nextInt();
            quantidade = sc.nextInt();

            if (produtos == 1001)
                valor = 1.50;
            else if (produtos == 1002)
                valor = 2.50;
            else if (produtos == 1003)
                valor = 3.50;
            else if (produtos == 1004)
                valor = 4.50;
            else if (produtos == 1005)
                valor = 5.50;

            res += valor * quantidade;
        }
        System.out.printf("%.2f\n", res);
        sc.close();
    }
}

