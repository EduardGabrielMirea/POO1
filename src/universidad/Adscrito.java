package universidad;

public class Adscrito {
    private String fecha;
    private Catedra catedra;
    private Profe profe;

    public Adscrito(String fecha, Catedra catedra, Profe profe) {
        this.fecha = fecha;
        this.catedra = catedra;
        this.profe = profe;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Catedra getCatedra() {
        return catedra;
    }

    public void setCatedra(Catedra catedra) {
        this.catedra = catedra;
    }

    public Profe getProfe() {
        return profe;
    }

    public void setProfe(Profe profe) {
        this.profe = profe;
    }

    @Override
    public String toString(){
        return this.fecha;
    }
}
