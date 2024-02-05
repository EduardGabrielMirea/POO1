package universidad;

import java.util.HashSet;

public class main {
    public static void main(String[] args) {

        //------------ Area Coneiximent -----------//
        AreaConex ciencias = new AreaConex("Ciencias");
        AreaConex humanidades = new AreaConex("Humanidades");

        //------------- Departamentos ------------//
        Departamento matematicas = new Departamento("Matematicas");
        Departamento castellano = new Departamento("Castellano");
        Departamento informatica = new Departamento("Informatica");

        //------------- Profesores ----------------//
        Profe pepe = new Profe("x1234z","Pepe",matematicas);
        Profe maria = new Profe("z3456y","Maria",castellano);
        Profe juan = new Profe("z9856y","Juan",informatica);

        //----------- Facultades -------------//
        Facultad fMates = new Facultad("Facultad Matematicas");
        Facultad fCaste = new Facultad("Facultad Castellano");
        Facultad fInfo = new Facultad("Facultad Informatica");

        //------------ Catedras ----------------//
        Catedra matematicasComputacionles = new Catedra("Matematicas Computacionales",matematicas,fMates);
        Catedra castellanoAvanzado = new Catedra("Castellano Avanzado",castellano,fCaste);
        Catedra informaticaAplicada = new Catedra("Informatica Aplicada",informatica,fInfo);

        //---- Adscritos ---//
        Adscrito uno = new Adscrito("10/01/2000",matematicasComputacionles,pepe);
        Adscrito dos = new Adscrito("20/01/2001",castellanoAvanzado,maria);
        Adscrito tres = new Adscrito("07/02/2004",informaticaAplicada,juan);


        //--------- ADD ---------//

        //---- Area Conocimiento ------//
        ciencias.addDepartamento(matematicas);
        ciencias.addDepartamento(informatica);
        humanidades.addDepartamento(castellano);

        //------- Departamentos ------//
        matematicas.addProfe(pepe);
        matematicas.addCatedra(matematicasComputacionles);

        castellano.addProfe(maria);
        castellano.addCatedra(castellanoAvanzado);

        informatica.addProfe(juan);
        informatica.addCatedra(informaticaAplicada);

        //---Profes---//
        pepe.addCatedras(matematicasComputacionles);
        pepe.addAdscrito(uno);
        maria.addCatedras(castellanoAvanzado);
        maria.addAdscrito(dos);
        juan.addCatedras(informaticaAplicada);
        juan.addAdscrito(tres);

        //-------- Facultades --------//
        fMates.addCatedra(matematicasComputacionles);
        fCaste.addCatedra(castellanoAvanzado);
        fInfo.addCatedra(informaticaAplicada);

        System.out.println("Area de conocimiento: " +ciencias);
        for (Departamento d : ciencias.getDepartamentos()) {
            System.out.println("\tDepartamento: " + d);
            for (Catedra c : d.getCatedras()){
                System.out.println("\tCatedra: "+c);
                System.out.println("\tFacultad: "+c.getFacultad());
                for (Profe p : d.getProfes()){
                    System.out.println("\tProfesores: "+p);
                    System.out.println("\tFecha adscrito: "+p.getAdscritos());
                }
            }
            System.out.println("\n");
        }
        System.out.println("\n");
    }
}
