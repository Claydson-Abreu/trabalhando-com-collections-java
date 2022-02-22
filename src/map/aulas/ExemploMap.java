package map.aulas;

import java.util.*;

public class ExemploMap {
    public static void main(String[] args) {
        System.out.println("crie um dicionario que relacione os modelos e seus respectivos consumos ");
        Map<String, Double> carrosPopulares = new HashMap<>(){{
           put("gol", 14.4);
           put("uno", 15.6);
           put("mobi", 16.1);
           put("hb20", 14.5);
           put("kwid", 15.6);
        }};

        System.out.println(carrosPopulares);

        System.out.println("substitua o consumo do gol por 15,2km/l: ");
        carrosPopulares.put("gol" , 15.2);
        System.out.println(carrosPopulares);

        System.out.println("Confira se o modelo tucson está no dicionario: " + carrosPopulares.containsKey("Tucson"));

        System.out.println("Exiba o consumo do uno: " + carrosPopulares.get("uno"));

        System.out.println("Exiba os modelos:");
        Set<String> modelos = carrosPopulares.keySet();

        System.out.println(modelos);

        System.out.println("Exiba o consumo dos carros: ");
        Collection<Double> consumos = carrosPopulares.values();

        System.out.println(consumos);


        System.out.println("Exiba o modelo mais economico:");

        Double consumoMaisEficiente = Collections.max(carrosPopulares.values());
        Set<Map.Entry<String, Double>> entries = carrosPopulares.entrySet();
        String modeloMaisEficiente = "";

        for (Map.Entry<String, Double> entry : entries) {
            if(entry.getValue().equals(consumoMaisEficiente))
                modeloMaisEficiente = entry.getKey();
                System.out.println("Modelo mais eficiente: " + modeloMaisEficiente+ " e seu respectivo consumo: " + consumoMaisEficiente );

        }


        System.out.println("Exiba o modelo menos econômico e seu consumo");
        Double consumoMenosEficiente = Collections.min(carrosPopulares.values());
        String modeloMenosEficiente = "";
        for (Map.Entry<String,Double> entry : carrosPopulares.entrySet() ) {
            if(entry.getValue().equals(consumoMenosEficiente)) {
                modeloMenosEficiente = entry.getKey();
                System.out.println("Modelo menos eficiente " + modeloMenosEficiente + " - " + consumoMenosEficiente );
            }
        }

        Iterator<Double> iterator = carrosPopulares.values().iterator();
        Double soma = 0.0;
        while (iterator.hasNext()){
            soma+= iterator.next();
        }

        System.out.println("Exiba a soma dos consumos: " + soma);


        System.out.println("Exiba a media dos consumos deste dicionario de carros: " +  (soma/carrosPopulares.size()));

        System.out.println("Remova os modelos com o consumo igual a 15,6 km/l: ");
        Iterator<Double> iterator1 = carrosPopulares.values().iterator();

        while (iterator1.hasNext()){
            if(iterator1.next().equals(15.6)) iterator1.remove();
        }
        System.out.println(carrosPopulares);


        System.out.println("Exiba todos os carros na ordem que foram informados: ");
        Map<String, Double> carrosPopulares1 = new LinkedHashMap<>(){{
            put("gol", 14.4);
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwid", 15.6);
        }};
        System.out.println(carrosPopulares1.toString());


        System.out.println("Exiba o dicionario ordenado pelo modelo: ");
        Map<String, Double> carrosPopulares2 = new TreeMap<>(carrosPopulares1){{
            put("gol", 14.4);
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwid", 15.6);
        }};
        System.out.println(carrosPopulares2);


        System.out.println("Apague o dicionario de carros: ");
        carrosPopulares.clear();

        System.out.println("Confira se o dicionario está vazia: " + carrosPopulares.isEmpty());


    }
}
