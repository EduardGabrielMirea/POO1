package libreria;

import java.util.HashSet;
import java.util.Set;

public class Lector {
    private String nombre;
    private String dni;
    private Set<Ejemplar> ejemplars;
    private Set<Historico> historicos;

    //Constructor
    public Lector(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
        this.ejemplars = new HashSet<>();
        this.historicos = new HashSet<>();
    }

    //Getters and Setters.
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Set<Ejemplar> getEjemplars() {
        return ejemplars;
    }

    public void setEjemplars(Set<Ejemplar> ejemplars) {
        this.ejemplars = ejemplars;
    }

    public Set<Historico> getHistoricos() {
        return historicos;
    }

    public void setHistoricos(Set<Historico> historicos) {
        this.historicos = historicos;
    }

    //ADDS.
    public void addEjemplar(Ejemplar ejemplar){
        this.ejemplars.add(ejemplar);
    }
    public void addHistorico(Historico historico){
        this.historicos.add(historico);
    }

    //String.
    @Override
    public String toString(){
        return this.nombre + " con DNI: " + this.dni;
    }
}
