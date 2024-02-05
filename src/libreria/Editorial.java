package libreria;

import java.util.HashSet;
import java.util.Set;

public class Editorial {
    private String nombreE;
    private int codEditorial;
    private Set<Libro> libros;

    //Constructor
    public Editorial(String nombreE, int codEditorial) {
        this.nombreE = nombreE;
        this.codEditorial = codEditorial;
        this.libros = new HashSet<>();
    }

    //Getters and Setters.
    public String getNombreE() {
        return nombreE;
    }

    public void setNombreE(String nombreE) {
        this.nombreE = nombreE;
    }

    public int getCodEditorial() {
        return codEditorial;
    }

    public void setCodEditorial(int codEditorial) {
        this.codEditorial = codEditorial;
    }

    public Set<Libro> getLibros() {
        return libros;
    }

    public void setLibros(Set<Libro> libros) {
        this.libros = libros;
    }

    //ADDS.
    public void addLibro(Libro libro){
        this.libros.add(libro);
    }

    //ToString
    @Override
    public String toString(){
        return this.nombreE;
    }
}
