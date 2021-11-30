package stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamPratica {

    public static void main(String[] args) {
        List<String> estudantes = new ArrayList<>();

        estudantes.add("End");
        estudantes.add("manuella");
        estudantes.add("Louise");
        estudantes.add("Carla");
        estudantes.add("Thiago");
        estudantes.add("Rafael moura neto");

        // retorna a contagem de elementos da stream
        System.out.println(estudantes.stream().count());


        // retorna elemento com maior números de letras
        System.out.println(estudantes.stream().max(Comparator.comparing(String::length)));

        // retorna elemento com menor números de letras
        System.out.println(estudantes.stream().min(Comparator.comparing(String::length)));

        // retorna o elemento que tei letra R
        System.out.println(estudantes.stream().filter((estudante) ->
                estudante.toLowerCase().contains("r")).collect(Collectors.toList()));

        // retorna uma nova coleção com os nomes concatenados com quantidade de leta de cada nome
        System.out.println(estudantes.stream().map(estudante -> estudante.concat("-").concat(String.valueOf(
                estudante.length()))).collect(Collectors.toList()));

        // retorna somente os 3 primeiros elementos da lista
        System.out.println(estudantes.stream().limit(3).collect(Collectors.toList()));

        // Exibe cada elemento no console e dps retorna a msm coleção
        System.out.println("retorna os elemento novamente");
        estudantes.stream().forEach(System.out::println);

        // retorna true se todos os elementos possuem a letra W no nome
        System.out.println("se todos tei letra w " + estudantes.stream().allMatch((element) -> element.contains("w")));
        // retorna true se algum dos  elementos possui a letra a minuscula no nome
        System.out.println("todos existe a letra a == " + estudantes.stream().anyMatch((elemento) -> elemento.contains("a")));

        // retorna o 1 elemento da coleção
        System.out.println("retorna o 1 elemento da coleção ");
        estudantes.stream().findFirst().ifPresent(System.out::println);

        // exemplo de operação encadeada
        System.out.println("Operação Encadeada: ");
        System.out.println(estudantes.stream()
                .peek(System.out::println)
                .map(estudante -> estudante.concat(" - ").concat(String.valueOf(estudante.length())))
                .peek(System.out::println)
                .filter((estudante) -> estudante.toLowerCase().contains("r"))
//                .collect(Collectors.toList()));
//                .collect(Collectors.joining(", ")));
//                .collect(Collectors.toSet()));
                .collect(Collectors.groupingBy(estudante -> estudante.substring(estudante.indexOf("-") + 1))));


    }
}
