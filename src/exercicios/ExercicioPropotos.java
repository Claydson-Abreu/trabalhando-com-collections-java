package exercicios;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ExercicioPropotos {
    public static void main(String[] args) {
        List<MediaMes> medias = new ArrayList<>();

        medias.add(new MediaMes("1 - Janeiro: ", 20.7));
        medias.add(new MediaMes("2 - Fevereiro: ", 22.8));
        medias.add(new MediaMes("3 - Março: ", 23.0));
        medias.add(new MediaMes("4 - Abril: ", 21.1));
        medias.add(new MediaMes("5 - Maio: ", 19.6));
        medias.add(new MediaMes("6 - Junho: ", 18.9));

        System.out.println("Calcule a media semestral");
        Iterator<MediaMes> iterator = medias.iterator();
        Double soma = 0.0;

        while(iterator.hasNext()){
            Double next = iterator.next().getMedia();
            soma += next;
        }

        System.out.println("Media Semestral é: " + (soma/ medias.size()));

        System.out.println("Mostre todas as temperaturas acima da media e o mês");

        Iterator<MediaMes> iterator1 = medias.iterator();
        Double mediaSemestral = (soma/ medias.size());

        while(iterator1.hasNext()){
            Double next = iterator1.next().getMedia();
            if (next < mediaSemestral) iterator1.remove();
        }
        System.out.println(medias);





    }


}
