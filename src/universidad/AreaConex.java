package universidad;

import java.util.HashSet;
import java.util.Set;

public class AreaConex {
    private String nombreA;

    private Set<Departamento> departamentos;


    public AreaConex(String nombreA, Set<Departamento> departamentos) {
        this.nombreA = nombreA;
        this.departamentos = new HashSet<>();
    }

    public String getNombreA() {
        return nombreA;
    }

    public void setNombreA(String nombreA) {
        this.nombreA = nombreA;
    }

    public Set<Departamento> getDepartamentos() {
        return departamentos;
    }

    public void setDepartamentos(Set<Departamento> departamentos) {
        this.departamentos = departamentos;
    }

    //-------- ADD ----------//
    public void addDepartamento(Departamento departamento){
        this.departamentos.add(departamento);
    }

    @Override
    public String toString(){
        return "El area de conocimiento " +this.nombreA;
    }

}
