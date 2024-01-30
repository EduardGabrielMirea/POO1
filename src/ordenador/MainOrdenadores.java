package ordenador;

import java.util.ArrayList;

public class MainOrdenadores {

    public static void main(String[] args) {

        ArrayList<Ordenador> listas = new ArrayList<>();

        listas.add(new Ordenador("Asus",154001));
        listas.add(new Ordenador("Lenovo",154003));
        listas.add(new Ordenador("MSI",154002));

        listas.stream().sorted().forEach(System.out::println);

    }
}
