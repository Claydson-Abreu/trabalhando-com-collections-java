package map.exercicios;

import java.util.*;

public class ExerciciosPropostos {
    public static void main(String[] args) {
        Map<String, Integer> estadosNordeste = new HashMap<>() {{
            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3534265);
        }};
        System.out.println(estadosNordeste);

        System.out.println("Substitua a população do RN por 3.534.165: ");
        estadosNordeste.put("RN", 3534165);
        System.out.println(estadosNordeste);

        System.out.println("Confira se o Estado PB está no dicionario, caso não adicione: ");
        if (!estadosNordeste.containsKey("PB")){
            estadosNordeste.put("PB", 4039277);
        }
        System.out.println(estadosNordeste);

        System.out.println("Exiba a população do PE: "  +  estadosNordeste.get("PE"));

        System.out.println("Exiba os elementos e suas populações na ordem em que foram imformados: ");
        Map<String, Integer> estadosNordeste2 = new LinkedHashMap<>(){{
            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3534265);
        }};
        System.out.println(estadosNordeste2);

        System.out.println("Exiba os estados e suas populações em ordem Alfabetica");
        Map<String, Integer> estadosNordeste3 = new TreeMap<>(){{
            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3534265);
        }};

        System.out.println(estadosNordeste3);


        System.out.println("Exiba o estado com a menor populaçao e sua quantidade");
        Integer estadoComMenorPopulacao = Collections.min(estadosNordeste3.values());
        String siglaEstadoMenorPopulacao = "";

        for (Map.Entry<String,Integer> estado : estadosNordeste3.entrySet() ) {
            if(estado.getValue().equals(estadoComMenorPopulacao)) {
                siglaEstadoMenorPopulacao = estado.getKey();
                System.out.println("O estado com a menor população é " + siglaEstadoMenorPopulacao + " - " + estadoComMenorPopulacao );
            }
        }


        System.out.println("Exiba o Estado com a maior população e sua quantidade: ");
        Integer estadoComMaiorPopulacao = Collections.max(estadosNordeste3.values());
        String siglaEstadoMaiorPopulacao = "";

        for (Map.Entry<String, Integer> estado: estadosNordeste3.entrySet() ) {
            if(estado.getValue().equals(estadoComMaiorPopulacao)) {
                siglaEstadoMaiorPopulacao = estado.getKey();
                System.out.println("O estado com a maior população é " + siglaEstadoMaiorPopulacao + " - " + estadoComMaiorPopulacao);
            }
        }




        Iterator<Integer> iterator = estadosNordeste2.values().iterator();
        Integer soma = 0;
        while(iterator.hasNext()){
            soma += iterator.next();
        }

        System.out.println("A soma de todas as populações é de " + soma);

        System.out.println("A media de população de todos os estados é de: " + soma/estadosNordeste2.size());

        System.out.println("Remova os estados com a população menor que 4.000.000");
        Iterator<Integer> iterator1 = estadosNordeste2.values().iterator();

        while(iterator1.hasNext()){
            if(iterator1.next() < 4000000) iterator1.remove();
        }
        System.out.println(estadosNordeste2);

        System.out.println("Apague o dicionario de estados: ");
        estadosNordeste3.clear();

        System.out.println("Confira se o dicionario está vazio " + estadosNordeste3.isEmpty());

    }
}


