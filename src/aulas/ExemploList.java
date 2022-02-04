package aulas;

import java.util.ArrayList;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExemploList {

    public static void main(String[] args) {
        System.out.println("Crie uma lista;");
        List<Double> notas = new ArrayList<>();
        notas.add(10.0);
        notas.add(7.0);
        notas.add(8.0);
        notas.add(5.0);
        notas.add(5.0);
        notas.add(7.0);
        notas.add(7.0);

        System.out.println(notas);

        System.out.println("Exiba a posição da nota 5.0: " + notas.indexOf(5.0));

        System.out.println("Adicione na lista a nota 8.0 na posição 4: ");
        notas.add(4, 8.0);
        System.out.println(notas.toString());

        System.out.println("Substitua a nota 5.0 pela nota 6.0: ");
        notas.set(notas.indexOf(5.0), 6.0);
        System.out.println(notas);

        System.out.println("Confira se a nota 5.0 está na lista: " + notas.contains(5.0));

        System.out.println("Exiba todas as notas na ordem em que foram adicionadas: ");
        for (Double nota : notas) System.out.println(nota);

        System.out.println("Exiba a menor nota: " + Collections.min(notas));

        System.out.println("Exiba a maior nota: " + Collections.max(notas));

        System.out.println("Exiba a soma dos valores: ");
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0.0;
        while (iterator.hasNext()){    // enqaunto houver proximo
            Double next = iterator.next();
            soma += next;
        }
        System.out.println(soma);

        System.out.println("Exiba a media das notas: " + (soma/ notas.size()));

        System.out.println("Remova a nota 5.0");
        notas.remove(5.0);
        System.out.println(notas);

        System.out.println("Remova a nota na posição 0");
        notas.remove(0);
        System.out.println(notas);

        System.out.println("Remova as notas menores que 7 e exiba a lista: ");
        Iterator<Double> iterator1 = notas.iterator();

        while (iterator1.hasNext()){
            Double next = iterator1.next();
            if(next < 7.0)iterator1.remove();
        }
        System.out.println(notas);


        System.out.println("Apague toda a lista: ");
        notas.clear();
        System.out.println(notas);

        System.out.println("Confira se a lista esta vazia: " + notas.isEmpty());

    }
}
