package streamapi.aulas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ExerciciosStremAPI {
    public static void main(String[] args) {
        List<String> numerosAleatorios = Arrays.asList("1", "0", "4", "1", "2", "3", "9", "9", "6", "5");

        System.out.println("Imprima todos os elementos dessa lista de String: ");
        /*numerosAleatorios.stream().forEach(System.out::println);
        numerosAleatorios.forEach(System.out::println);*/

        System.out.println("Pegue os 5 primeiros numeros e coloque dentro de um Set:");
        /*numerosAleatorios.stream().limit(5).collect(Collectors.toSet()).forEach(System.out::println);*/

        System.out.println("Tranforme essa lista de String em uma lista de números inteiros.");
        List<Integer> listaInteiros = numerosAleatorios.stream().map(Integer::parseInt).collect(Collectors.toList());

        System.out.println("Pegue os numeros pares e maiores que 2 e coloque em uma lista: ");
        List<Integer> listaMaioresQueDoisEPares = numerosAleatorios.stream().map(Integer::parseInt).filter(i -> (i % 2 == 0 && i > 2)).collect(Collectors.toList());
        System.out.println(listaMaioresQueDoisEPares);

        System.out.println("Mostre a média dos numeros: ");
        numerosAleatorios.stream().mapToInt(Integer:: parseInt).average().ifPresent(System.out::println);

        System.out.println("Remova os valores impares: ");
        listaInteiros.removeIf(integer -> integer % 2 != 0);
        System.out.println(listaInteiros);


    }


}



