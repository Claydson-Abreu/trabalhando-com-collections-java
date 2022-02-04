package aulas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExemploOrdenacaoList {
    public static void main(String[] args) {


        List<Gato> gatos = new ArrayList<>(){{
            add(new Gato("Jon", 12 , "preto"));
            add(new Gato("Simba", 8 , "Tigrado"));
            add(new Gato("Jon", 15, "amarelo"));
        }};

        //System.out.println(gatos);


        System.out.println("--\tOrdem de inserção\t--");
        System.out.println(gatos);

        System.out.println("--\tOrdem aleatoria\t--");
        Collections.shuffle(gatos);
        System.out.println(gatos);


        System.out.println("--\tOrdem Natural (nome)\t--");
        Collections.sort(gatos);
        System.out.println(gatos);

        System.out.println("--\tOrdem Idade\t--");
        //Collections.sort(gatos, new aulas.ComparetorIdade());
        gatos.sort(new ComparetorIdade());
        System.out.println(gatos);

        System.out.println("--\tOrdem Cor\t--");
        //Collections.sort(gatos, new aulas.ComparetorIdade());
        gatos.sort(new ComparetorCor());
        System.out.println(gatos);

        System.out.println("--\tOrdem Nome/Cor/Idade\t--");
        //Collections.sort(gatos, new aulas.ComparetorIdade());
        gatos.sort(new ComparetorNomeCorIdade());
        System.out.println(gatos);
    }
}
