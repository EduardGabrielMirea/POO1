package universidad;

import java.util.HashSet;
import java.util.Set;

public class Facultad {
    private String nombreF;
    private Set<Catedra> catedras;


    public Facultad(String nombreF) {
        this.nombreF = nombreF;
        this.catedras = new HashSet<>();
    }

    public String getNombreF() {
        return nombreF;
    }

    public void setNombreF(String nombreF) {
        this.nombreF = nombreF;
    }

    public Set<Catedra> getCatedras() {
        return catedras;
    }

    public void setCatedras(Set<Catedra> catedras) {
        this.catedras = catedras;
    }

    //---------- ADD -----------//
    public void addCatedra(Catedra catedra){
        this.catedras.add(catedra);
    }

    @Override
    public String toString(){
        return this.nombreF;
    }
}
