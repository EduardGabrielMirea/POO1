package universidad;

import java.util.HashSet;
import java.util.Set;

public class Profe {

    private String dni;
    private String nombreP;
    private Departamento departamento;
    private Set<Catedra> catedras;
    private Set<Adscrito> adscritos;

    public Profe(String dni, String nombreP, Departamento departamento) {
        this.dni = dni;
        this.nombreP = nombreP;
        this.departamento = departamento;
        this.catedras = new HashSet<>();
        this.adscritos = new HashSet<>();
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombreP() {
        return nombreP;
    }

    public void setNombreP(String nombreP) {
        this.nombreP = nombreP;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public Set<Catedra> getCatedras() {
        return catedras;
    }

    public void setCatedras(Set<Catedra> catedras) {
        this.catedras = catedras;
    }

    public Set<Adscrito> getAdscritos() {
        return adscritos;
    }

    public void setAdscritos(Set<Adscrito> adscritos) {
        this.adscritos = adscritos;
    }

    //--------- ADD ------------//
    public void addAdscrito(Adscrito adscrito){
        this.adscritos.add(adscrito);
    }
    public void addCatedras(Catedra catedra){
        this.catedras.add(catedra);
    }


    @Override
    public String toString(){
        return this.dni+ " - " +this.nombreP;
    }
}
