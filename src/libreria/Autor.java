package libreria;

import java.util.HashSet;
import java.util.Set;

public class Autor {
    private String nombreA;
    private int codAutor;
    private Set<Libro> libros;

    //Constructor.
    public Autor(String nombreA, int codAutor) {
        this.nombreA = nombreA;
        this.codAutor = codAutor;
        this.libros = new HashSet<>();
    }

    //Getter and Setter.
    public String getNombreA() {
        return nombreA;
    }

    public void setNombreA(String nombreA) {
        this.nombreA = nombreA;
    }

    public int getCodAutor() {
        return codAutor;
    }

    public void setCodAutor(int codAutor) {
        this.codAutor = codAutor;
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

    //toString
    @Override
    public String toString(){
        return this.nombreA;
    }
}
