package Listas;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Exemple_Listas {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();

        nomes.add("Pedro");
        nomes.add("Carlos");
        nomes.add("Ender");
        nomes.add("Juliana");
        nomes.add("Maria");
        System.out.println(nomes);

//        nomes.set(1,"jussara"); // seta novo valor
//        Collections.sort(nomes);// "ordem alfabetica
//        nomes.remove(1); // remove pelo indice
//        nomes.remove("Maria"); // remove pelo value
//        String nome = nomes.get(0);
//        String nome = nomes.get(-10); // n existe
//        int tamanho = nomes.size(); // tamanho lista
//        boolean seExistir = nomes.contains("ender"); // caso sensitive
//        boolean empty = nomes.isEmpty();// ve se lista esta vazia
//        boolean limpaALista = nomes.clear();// ve se lista esta vazia
//        int posicao  = nomes.indexOf("Ender"); // busca indice na lista
        for (String nomeDoItem : nomes) {
            System.out.println(nomeDoItem);
        }

        Iterator<String> stringIterator = nomes.iterator();
        while (stringIterator.hasNext()) { // hasNext retorna boolean
            System.out.println("iterator==>"+stringIterator.next()); // next() =>retorna objeto ta iterando naquele moment
        }
//        System.out.println(posicao);


    }
}
