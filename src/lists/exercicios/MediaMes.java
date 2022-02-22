package lists.exercicios;

public class MediaMes {
    private String mes;
    private Double media;

    public MediaMes(String mes, Double media) {
        this.mes = mes;
        this.media = media;
    }

    public String getMes() {
        return mes;
    }

    public Double getMedia() {
        return media;
    }

    @Override
    public String toString() {
        return "{" +
                "mes='" + mes + '\'' +
                ", media=" + media +
                '}';
    }




}
