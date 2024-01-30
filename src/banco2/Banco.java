package banco2;

import java.util.HashSet;
import java.util.Set;

public class Banco {

    private String name;

    private int nEntidad;

    private Set<Sucursal> sucursales;

    public Banco(String name, int nEntidad, Set<Sucursal> sucursales) {
        this.name = name;
        this.nEntidad = nEntidad;
        this.sucursales = new HashSet<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getnEntidad() {
        return nEntidad;
    }

    public void setnEntidad(int nEntidad) {
        this.nEntidad = nEntidad;
    }

    public Set<Sucursal> getSucursales() {
        return sucursales;
    }

    public void setSucursales(Set<Sucursal> sucursales) {
        this.sucursales = sucursales;
    }

    public void addScursales(Sucursal sucursal){
        this.sucursales.add(sucursal);
    }
    @Override
    public String toString(){
        return this.name + " - " + this.nEntidad;
    }

}
