package libreria;

import java.util.HashSet;
import java.util.Set;

public class Ejemplar {
    private int numeroEjemplar;
    private Libro libro;
    private Lector lector;
    private Set<String> dataPrestec;
    private Set<Historico> historicos;

    //Constructor.
    public Ejemplar(int numeroEjemplar, Libro libro, Lector lector) {
        this.numeroEjemplar = numeroEjemplar;
        this.libro = libro;
        this.lector = lector;
        this.dataPrestec = new HashSet<>();
        this.historicos = new HashSet<>();
    }

    //Getters and Setters.
    public int getNumeroEjemplar() {
        return numeroEjemplar;
    }

    public void setNumeroEjemplar(int numeroEjemplar) {
        this.numeroEjemplar = numeroEjemplar;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public Lector getLector() {
        return lector;
    }

    public void setLector(Lector lector) {
        this.lector = lector;
    }

    public Set<String> getDataPrestec() {
        return dataPrestec;
    }

    public void setDataPrestec(Set<String> dataPrestec) {
        this.dataPrestec = dataPrestec;
    }

    public Set<Historico> getHistoricos() {
        return historicos;
    }

    public void setHistoricos(Set<Historico> historicos) {
        this.historicos = historicos;
    }

    //ADDS.
    public void addHistorico(Historico historico){
        this.historicos.add(historico);
    }
    public void addData(String dataPrestec){
        this.dataPrestec.add(dataPrestec);
    }

    @Override
    public String toString(){
        return String.valueOf(this.numeroEjemplar);
    }
}
