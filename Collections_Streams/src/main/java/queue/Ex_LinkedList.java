package queue;

import java.util.LinkedList;
import java.util.Queue;

public class Ex_LinkedList {

    public static void main(String[] args) {
        Queue<String> filaBanco = new LinkedList<>();
        filaBanco.add("Patricia");
        filaBanco.add("Manuella");
        filaBanco.add("Ender");
        filaBanco.add("Zeus");

        System.out.println(filaBanco);

        // primeiro da fila index 0 retira da fila
        String ClienteSerAtendido = filaBanco.poll();
        System.out.println(ClienteSerAtendido);
        System.out.println(filaBanco);

        // pega primeiro lista(index=0) e nao retira da fila
        String primeiroCliente = filaBanco.peek();
        System.out.println(primeiroCliente);
        System.out.println(filaBanco);

        filaBanco.clear();

        String primeiroClienteOuErro = filaBanco.element();// get porem na retira da lista

        System.out.println(primeiroClienteOuErro);
        System.out.println(filaBanco);
    }
}
