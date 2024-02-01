package banco2;

import java.util.HashSet;

public class MainBanco {
    public static void main(String[] args) {
        /*
        Banco bbva = new Banco("BBVA",100, new HashSet<>());
            Sucursal sMayor = new Sucursal("C/ Mayor",1,bbva);
                Cliente maria = new Cliente("1","Maria");
                Prestec p1 = new Prestec(99,"01/01/2024",sMayor,1000);
                    sMayor.addPrestamo(p1);
                Prestec p2 = new Prestec(100,"01/01/2024",sMayor,2000);
                    sMayor.addPrestamo(p2);
            Sucursal sEnMedio = new Sucursal("C/ En Medio",2,bbva);
                Prestec p3 = new Prestec(101,"01/01/2024",sEnMedio,5000);
                    sEnMedio.addPrestamo(p3);
        bbva.addScursales(sMayor); //Hemos añadido la sucursual al banco. Usando el metodo void addSucursal de Banco.
        bbva.addScursales(sEnMedio); //Hemos añadido la sucursual al banco. Usando el metodo void addSucursal de Banco.

        System.out.println(bbva);
        for (Sucursal s: bbva.getSucursales()){
            System.out.println("\t" + s);
            /*for (Prestec p:s.)


        }

        bbva.getSucursales().forEach(System.out::println);
        System.out.println(sMayor.getBanco().getName());
        System.out.println(p3.getSucursal().getBanco().getName());

        */

    }
}
