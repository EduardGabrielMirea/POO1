package libreria;

import java.util.HashSet;
import java.util.Set;

public class Libro {
    private String nombreL;
    private String isbn;

    private Editorial editorial;
    private Tema tema;
    private Set<Autor> autors;
    private Set<Ejemplar> ejemplars;

    //Constructor
    public Libro(String nombreL, String isbn, Editorial editorial, Tema tema) {
        this.nombreL = nombreL;
        this.isbn = isbn;
        this.editorial = editorial;
        this.tema = tema;
        this.autors = new HashSet<>();
        this.ejemplars = new HashSet<>();
    }

    //Getters and Setters.
    public String getNombreL() {
        return nombreL;
    }

    public void setNombreL(String nombreL) {
        this.nombreL = nombreL;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Editorial getEditorial() {
        return editorial;
    }

    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
    }

    public Tema getTema() {
        return tema;
    }

    public void setTema(Tema tema) {
        this.tema = tema;
    }

    public Set<Autor> getAutors() {
        return autors;
    }

    public void setAutors(Set<Autor> autors) {
        this.autors = autors;
    }

    public Set<Ejemplar> getEjemplars() {
        return ejemplars;
    }

    public void setEjemplars(Set<Ejemplar> ejemplars) {
        this.ejemplars = ejemplars;
    }

    //ADDS.
    public void addAutor(Autor autor){
        this.autors.add(autor);
    }
    public void addEjemplar(Ejemplar ejemplar){
        this.ejemplars.add(ejemplar);
    }

    //ToString.
    @Override
    public String toString(){
        return this.nombreL + " con ISBN " + this.isbn;
    }
}
