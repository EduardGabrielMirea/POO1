package libreria;

public class Main {

    public static void main(String[] args) {
        //---------- AUTORES -------//
        Autor juan = new Autor("Juan",1);
        Autor pepe = new Autor("Pepe",2);
        Autor alex = new Autor("Alex",3);
        Autor maria = new Autor("Maria",4);
        Autor lucia = new Autor("Lucia",5);

        //------ Editorial ---------//
        Editorial jabali = new Editorial("Jabalí",111);
        Editorial bang = new Editorial("Bang",222);

        //------ TEMA ---------//
        Tema accion = new Tema("Acción",10);
        Tema amor = new Tema("Amor",11);
        Tema fantasia = new Tema("Fantasía",12);

        //--------- LIBROS -----------//
        Libro vengadores = new Libro("Los Vengadores","0-1111-2222-3",jabali,accion);
        Libro teQuiero = new Libro("Me Quiero - Te Quiero","0-2222-3333-4",jabali,amor);
        Libro atlas = new Libro("Los Seis de Atlas","0-3333-4444-5",jabali,fantasia);

        Libro espia = new Libro("Espia de dios","0-4444-5555-6",bang,accion);
        Libro meses = new Libro("Tres Meses","0-5555-6666-7",bang,amor);
        Libro almas = new Libro("Reino de las Almas","0-6666-7777-8",bang,fantasia);


        //--------- EJEMPLARES -----------//

    }
}
