package lists.exercicios.aulas;

import java.util.Comparator;

public class ComparetorCor implements Comparator<Gato> {
    @Override
    public int compare(Gato gato1, Gato gato2) {
        return gato1.getCor().compareToIgnoreCase(gato2.getCor());
    }
}
