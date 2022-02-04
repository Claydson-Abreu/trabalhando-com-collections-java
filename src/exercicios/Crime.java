package exercicios;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Crime {
    public static void main(String[] args) {
        List<String> respostas = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Telefonou para vitima? (S ou N)");
        respostas.add(scanner.next());
        System.out.println("Esteve no local do crime? (S ou N)");
        respostas.add(scanner.next());
        System.out.println("Mora perto da vitima? (S ou N)");
        respostas.add(scanner.next());
        System.out.println("Devia para a vitima? (S ou N)");
        respostas.add(scanner.next());
        System.out.println("Já trabalhou para vitima? (S ou N)");
        respostas.add(scanner.next());

        Iterator<String> iterator = respostas.iterator();
        int soma = 0;
        while (iterator.hasNext()){    // enqaunto houver proximo
            String next = iterator.next();
            if(next.equalsIgnoreCase("S")){ // contador de respostas positivas
                soma++;
            }
        }

        if(soma==2){
            System.out.println("Suspeito");
        }else if(soma > 2 && soma <= 4){
            System.out.println("Cumplice");
        }else if(soma == 5){
            System.out.println("Assassina");
        }else {
            System.out.println("Inocente");
        }

        //System.out.println(respostas);

    }
}
