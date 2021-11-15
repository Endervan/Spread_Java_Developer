package br.com.desafios;

import java.util.Scanner;

//Romeu e Julieta acabaram de casar e estão planejamendo a Lua de Mel na Europa.
// Como vão visitar vários países, o fuso horário de cada um é diferente, por isso eles
// precisam ficar atento às escalas.
// Para que a Lua de Mel deles seja um sucesso, ele pediram que você desenvolva um
// aplicativo que, a partir da hora de saída, tempo de viagem e fuso horário do destino
// comparado ao país de origem, informe a hora de chegada de cada vôo no destino.
// Por exemplo, se eles partirem às 10 horas da manhã para uma viagem de 4 horas rumo
// a um destino que fica à leste, em um fuso horário com uma hora a mais com relação ao
// fuso horário do ponto de partida, a hora de chegada terá que ser: 10 horas + 4 horas
// de viagem + 1 hora de deslocamento pelo fuso, ou seja, chegarão às 15 horas. Note que
// se a hora calculada for igual a 24, seu programa deverá imprimir 0 (zero).
// Entrada
// A entrada contém 3 inteiros: S (0 ≤ S ≤ 23), T (1 ≤ T ≤ 12) e F (-5 ≤ F ≤ 5),
// separados por um espaço, indicando respectivamente a hora da saída, o tempo de viagem e
// o fuso horário do destino com relação à origem.
public class FusoHorario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int horasaida = sc.nextInt();
        int tempoviagem = sc.nextInt();
        int fuso = sc.nextInt();

        int hora = horasaida + tempoviagem + fuso;
        if (hora >= 24) hora -= 24;
        else if (hora < 0) hora += 24;


        System.out.println(hora);

        sc.close();
    }
}
