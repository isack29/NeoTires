package clases;

public class Neumatico implements Comparable<Neumatico> {

    private String marca = "";
    private int tamRing;
    private char velMax;
    private int perfilCarga;
    private int anchoNominal;

    public Neumatico(String marca, int tamRing, char velMax, int perfilCarga, int anchoNominal) {

        this.marca = marca;
        this.tamRing = tamRing;
        this.velMax = velMax;
        this.perfilCarga = perfilCarga;
        this.anchoNominal = anchoNominal;

    }

    Neumatico() {

    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getTamRing() {
        return tamRing;
    }

    public void setTamRing(int tamRing) {
        this.tamRing = tamRing;
    }

    public char getVelMax() {
        return velMax;
    }

    public void setVelMax(char velMax) {
        this.velMax = velMax;
    }

    public int getPerfilCarga() {
        return perfilCarga;
    }

    public void setPerfilCarga(int cargaLlanta) {
        this.perfilCarga = cargaLlanta;
    }

    public int getAnchoNominal() {
        return anchoNominal;
    }

    public void setAnchoNominal(int anchoNominal) {
        this.anchoNominal = anchoNominal;
    }

    @Override
    public int compareTo(Neumatico o) {
        return marca.compareTo(o.getMarca());
    }

}
