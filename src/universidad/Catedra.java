package universidad;

import java.util.HashSet;
import java.util.Set;

public class Catedra {
    private String nombreC;
    private Departamento departamento;
    private Facultad facultad;
    private Set<Profe> profes;



    public Catedra(String nombreC, Departamento departamento, Facultad facultad, Set<Profe> profes) {
        this.nombreC = nombreC;
        this.departamento = departamento;
        this.facultad = facultad;
        this.profes = new HashSet<>();
    }

    public String getNombreC() {
        return nombreC;
    }

    public void setNombreC(String nombreC) {
        this.nombreC = nombreC;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public Facultad getFacultad() {
        return facultad;
    }

    public void setFacultad(Facultad facultad) {
        this.facultad = facultad;
    }

    public Set<Profe> getProfes() {
        return profes;
    }

    public void setProfes(Set<Profe> profes) {
        this.profes = profes;
    }
    //---------- ADD --------------//
    public void addProfe(Profe profe){
        this.profes.add(profe);
    }

    @Override
    public String toString(){
    return "La catedra con nombre " +this.nombreC;
    }



}
