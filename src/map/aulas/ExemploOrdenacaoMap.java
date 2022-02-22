package map.aulas;

import java.util.*;

public class ExemploOrdenacaoMap {
    public static void main(String[] args) {



        System.out.println("--\tOrdem aleatória\t--");
        Map<String, Livro> meusLivros = new HashMap<>(){{
            put("Hawking, Stephen", new Livro("Uma breve História do tempo", 256));
            put("Duhing, Charles", new Livro("O poder do hábito", 408));
            put("Harari, Yuval Noah", new Livro("21 Lições para o século 21", 432));
        }};

        for (Map.Entry<String, Livro> livro: meusLivros.entrySet()) {
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
        }


        System.out.println("--\tOrdem Inserção\t--");
        Map<String, Livro> meusLivros1 = new LinkedHashMap<>(){{
            put("Hawking, Stephen", new Livro("Uma breve História do tempo", 256));
            put("Duhing, Charles", new Livro("O poder do hábito", 408));
            put("Harari, Yuval Noah", new Livro("21 Lições para o século 21", 432));
        }};

        for (Map.Entry<String, Livro> livro: meusLivros1.entrySet()) {
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
        }


        System.out.println("--\tOrdem alfabética dos autores\t--");

        Map<String, Livro> meusLivros2 = new TreeMap<>(meusLivros1);
        for (Map.Entry<String, Livro> livro: meusLivros2.entrySet()) {
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
        }

        System.out.println("--\tOrdem alfabética dos livros\t--");

        Set<Map.Entry<String, Livro>> meusLivros3 = new TreeSet<>(new ComparatorNome());
        meusLivros3.addAll(meusLivros.entrySet());

        for (Map.Entry<String, Livro> livro: meusLivros3) {
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
        }

        System.out.println("--\tOrdem por numero de paginas\t--");

        Set<Map.Entry<String, Livro>> meusLivros4 = new TreeSet<>(new ComparatorPaginas());
        meusLivros4.addAll(meusLivros.entrySet());

        for (Map.Entry<String, Livro> livro: meusLivros4) {
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome() + " - " + livro.getValue().getPaginas());
        }
    }
}


class Livro{
    private String nome;
    private Integer paginas;

    public Livro(String nome, Integer paginas) {
        this.nome = nome;
        this.paginas = paginas;
    }

    public String getNome() {
        return nome;
    }

    public Integer getPaginas() {
        return paginas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Livro livro = (Livro) o;
        return nome.equals(livro.nome) && paginas.equals(livro.paginas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, paginas);
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", paginas=" + paginas +
                '}';
    }
}

class ComparatorNome implements Comparator<Map.Entry<String, Livro>>{


    @Override
    public int compare(Map.Entry<String, Livro> livro1, Map.Entry<String, Livro> livro2) {
        return livro1.getValue().getNome().compareToIgnoreCase(livro2.getValue().getNome());
    }
}

class ComparatorPaginas implements  Comparator<Map.Entry<String, Livro>>{

    @Override
    public int compare(Map.Entry<String, Livro> livro1, Map.Entry<String, Livro> livro2) {
        return livro1.getValue().getPaginas().compareTo(livro2.getValue().getPaginas());
    }
}