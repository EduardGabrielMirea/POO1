package universidad;

import java.util.HashSet;
import java.util.Set;

public class Departamento {
    private String nombreD;
    private Set<Catedra> catedras;
    private Set<Profe> profes;


    public Departamento(String nombreD, Set<Catedra> catedras, Set<Profe> profes) {
        this.nombreD = nombreD;
        this.catedras = new HashSet<>();
        this.profes = new HashSet<>();
    }


    public String getNombreD() {
        return nombreD;
    }

    public void setNombreD(String nombreD) {
        this.nombreD = nombreD;
    }

    public Set<Catedra> getCatedras() {
        return catedras;
    }

    public void setCatedras(Set<Catedra> catedras) {
        this.catedras = catedras;
    }

    public Set<Profe> getProfes() {
        return profes;
    }

    public void setProfes(Set<Profe> profes) {
        this.profes = profes;
    }

    //------------ ADD ---------------//
    public void addProfe(Profe profe){
        this.profes.add(profe);
    }
    public void addCatedra(Catedra catedra){
        this.catedras.add(catedra);
    }

    @Override
    public String toString(){
        return "El departamento " +this.nombreD;
    }

}
