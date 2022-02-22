package set.aulas;

import java.util.*;

public class ExemploSet {

    public static void main(String[] args) {
        Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));

        System.out.println(notas);
//        System.out.println("Exiba a posição da nota 5.0: ");  Não pode pesquisar

//        System.out.println("Adicione na lista a noa 8.0 na posição 4: ");  Não pode inserir

//        System.out.println("Substitua a nota 5.0 pela nota 6.0 ");  Não pode substituir

        System.out.println("Confira se a nota 5.0 esta no conjuto: " + notas.contains(5d));

//        System.out.println("Exiba a terceira nota adicionada: "); nao pode fazer

        System.out.println("Exiba a menor nota: " + Collections.min(notas));

        System.out.println("Exiba a maior nota: " + Collections.max(notas));

        Iterator<Double> iterator = notas.iterator();
        Double soma = 0.0;
        while (iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("Exiba a soma dos valores :" + soma);

        System.out.println("Exiba a media das notas: " + (soma / notas.size()));

        System.out.println("Remova a nota 0: ");
        notas.remove(0.0);
        System.out.println(notas);

//        System.out.println("Remover nota na posição 0"); nao pode trabalhar com indices

        System.out.println("Remova as notas menores que 7 e exiba a lista: ");
        Iterator<Double> iterator1 = notas.iterator();
        while(iterator1.hasNext()){
            Double next = iterator1.next();
            if(next < 7) iterator1.remove();
        }

        System.out.println(notas);

        
    }

}
