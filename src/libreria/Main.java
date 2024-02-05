package libreria;

public class Main {

    public static void main(String[] args) {
        //---------- AUTORES -------//
        Autor juan = new Autor("Juan",1);
        Autor pepe = new Autor("Pepe",2);
        Autor alex = new Autor("Alex",3);
        Autor maria = new Autor("Maria",4);
        Autor lucia = new Autor("Lucia",5);
        Autor xin = new Autor("Xin",6);

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


        //---------- Lector -------------//
        Lector eddy = new Lector("Eddy","x1234z");
        Lector adrian = new Lector("Adrian","z3456z");
        Lector brian = new Lector("Brian","x4453x");

        //--------- EJEMPLARES -----------//
        Ejemplar primeroVengadores = new Ejemplar(1,vengadores,eddy);
        Ejemplar segundoVengadores = new Ejemplar(2,vengadores,adrian);
        Ejemplar primeroAlmas = new Ejemplar(1,almas,brian);

        //----------- HISTORICO ---------------//
        Historico oo = new Historico("01/01/2000","01/02/2000",primeroVengadores,eddy);
        Historico o1 = new Historico("06/05/2000","10/10/2000",primeroVengadores,brian);

        //------------ADDS----------//
        //--------libros---------//
        vengadores.addAutor(juan);
        juan.addLibros(vengadores);
        vengadores.addEjemplar(primeroVengadores);
        vengadores.addEjemplar(segundoVengadores);

        teQuiero.addAutor(juan);
        juan.addLibros(teQuiero);

        atlas.addAutor(juan);
        juan.addLibros(atlas);

        espia.addAutor(maria);

        meses.addAutor(lucia);

        almas.addAutor(xin);
        xin.addLibros(almas);
        almas.addEjemplar(primeroAlmas);

        //------ editorial ---------//
        jabali.addLibro(vengadores);
        jabali.addLibro(teQuiero);
        jabali.addLibro(atlas);

        bang.addLibro(espia);
        bang.addLibro(meses);
        bang.addLibro(almas);

        //--------- tema ------------//
        accion.addLibros(vengadores);
        accion.addLibros(espia);
        amor.addLibros(teQuiero);
        amor.addLibros(meses);
        fantasia.addLibros(atlas);
        fantasia.addLibros(almas);

        //------ ejemplares --------//
        primeroVengadores.addHistorico(oo);
        primeroVengadores.addHistorico(o1);

        //------------------- PROBANDO PROGRAMA ------------//

        System.out.println("El autor: " +juan);
        for (Libro l: juan.getLibros()){
            System.out.println("\tLibros del autor: " +l);
            System.out.println("\tEl tema: " +l.getTema());
            System.out.println("\tLa editorial: " +l.getEditorial());
            for (Ejemplar e: l.getEjemplars()){
                System.out.println("\t\tEl ejemplar: " +e);
                for (Historico h : e.getHistoricos()){
                    System.out.println("\t\tLector: "+h.getLector());
                    System.out.println("\t\tCon historico: " +h);
                    System.out.println("\t\tFecha inicio: " +h.getDataP());
                    System.out.println("\t\tFecha final: " +h.getDataF());
                }
            }
        }

    }
}
