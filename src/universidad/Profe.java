package universidad;

import java.util.HashSet;
import java.util.Set;

public class Profe {

    private String dni;
    private String nombreP;
    private Departamento departamento;
    private Set<Catedra> catedras;

    public Profe(String dni, String nombreP, Departamento departamento, Set<Catedra> catedras) {
        this.dni = dni;
        this.nombreP = nombreP;
        this.departamento = departamento;
        this.catedras = new HashSet<>();
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

    //--------- ADD ------------//



    @Override
    public String toString(){
        return this.dni+ " - " +this.nombreP;
    }
}
