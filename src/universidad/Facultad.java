package universidad;

import java.util.HashSet;
import java.util.Set;

public class Facultad {
    private String nombreF;
    private String direccionF;
    private Set<Catedra> catedras;


    public Facultad(String nombreF, String direccionF, Set<Catedra> catedras) {
        this.nombreF = nombreF;
        this.direccionF = direccionF;
        this.catedras = new HashSet<>();
    }

    public String getNombreF() {
        return nombreF;
    }

    public void setNombreF(String nombreF) {
        this.nombreF = nombreF;
    }

    public String getDireccionF() {
        return direccionF;
    }

    public void setDireccionF(String direccionF) {
        this.direccionF = direccionF;
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
        return "La facultad "+this.nombreF+ " con dirección " +this.direccionF;
    }
}
