package Listas;

import java.util.List;
import java.util.Map;
import java.util.Vector;

public class Exemple_Vector {
    public static void main(String[] args) {
        List<String> esportes = new Vector<>();

        // adicao
        esportes.add("Futebol");
        esportes.add("baseball");
        esportes.add("basquete");
        esportes.add("online");

        // alterando valor da posicao 2
        esportes.set(2,"teste");

        // removendo
        esportes.remove("baseball");

        // retornando o 1 indice do vetor
        System.out.println(esportes.get(0));

        // navegadndo nos esportes

        for (String esporte:esportes){
            System.out.println("for--->"+esporte);
        }

        System.out.println(esportes);

    }
}
