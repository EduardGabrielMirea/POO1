package libreria;

public class Historico {
    private String dataP;
    private String dataF;
    private Ejemplar ejemplar;
    private Lector lector;

    public Historico(String dataP, String dataF, Ejemplar ejemplar, Lector lector) {
        this.dataP = dataP;
        this.dataF = dataF;
        this.ejemplar = ejemplar;
        this.lector = lector;
    }
    public Historico(String dataP, Ejemplar ejemplar, Lector lector) {
        this.dataP = dataP;
        this.dataF = "";
        this.ejemplar = ejemplar;
        this.lector = lector;
    }

    public String getDataP() {
        return dataP;
    }

    public void setDataP(String dataP) {
        this.dataP = dataP;
    }

    public String getDataF() {
        return dataF;
    }

    public void setDataF(String dataF) {
        this.dataF = dataF;
    }

    public Ejemplar getEjemplar() {
        return ejemplar;
    }

    public void setEjemplar(Ejemplar ejemplar) {
        this.ejemplar = ejemplar;
    }

    public Lector getLector() {
        return lector;
    }

    public void setLector(Lector lector) {
        this.lector = lector;
    }

    @Override
    public String toString(){
        return this.dataP + " - " +this.dataF;
    }
}
