package libreria;

import java.util.HashSet;
import java.util.Set;

public class Tema {
    private String nomreT;
    private int codTema;
    private Set<Libro> libros;

    //Constructor
    public Tema(String nomreT, int codTema) {
        this.nomreT = nomreT;
        this.codTema = codTema;
        this.libros = new HashSet<>();
    }

    //Getters and Setters

    public String getNomreT() {
        return nomreT;
    }

    public void setNomreT(String nomreT) {
        this.nomreT = nomreT;
    }

    public int getCodTema() {
        return codTema;
    }

    public void setCodTema(int codTema) {
        this.codTema = codTema;
    }

    public Set<Libro> getLibros() {
        return libros;
    }

    public void setLibros(Set<Libro> libros) {
        this.libros = libros;
    }

    //ADDS
    public void addLibros(Libro libro){
        this.libros.add(libro);
    }

    //toSting
    @Override
    public String toString(){
        return  this.nomreT;
    }
}
