package banco2;

import java.util.HashSet;
import java.util.Set;

public class CuentaCorriente {

    private String nCC;

    private int cantidad;

    private Sucursal sucursal;
    private Set<Cliente> clientes;

    private Set<Domiciliacion> domiciliacions;



    public CuentaCorriente(String nCC,int cantidad , Sucursal sucursal,Set<Cliente> clientes, Set<Domiciliacion> domiciliacions) {
        this.nCC = nCC;
        this.cantidad = cantidad;
        this.sucursal = sucursal;
        this.clientes = new HashSet<>();
        this.domiciliacions = new HashSet<>();
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getnCC() {
        return nCC;
    }

    public void setnCC(String nCC) {
        this.nCC = nCC;
    }

    public Sucursal getSucursal() {
        return sucursal;
    }

    public void setSucursal(Sucursal sucursal) {
        this.sucursal = sucursal;
    }

    public Set<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(Set<Cliente> clientes) {
        this.clientes = clientes;
    }

    public Set<Domiciliacion> getDomiciliacions() {
        return domiciliacions;
    }

    public void setDomiciliacions(Set<Domiciliacion> domiciliacions) {
        this.domiciliacions = domiciliacions;
    }

    //Añadimos 1 cliente a la lista de clientes que tiene una cuenta corriente.
    public void addCliente(Cliente cliente){
        this.clientes.add(cliente);
    }
    //Añadimos.
    public void addDomiciliacions(Domiciliacion domiciliacion){
        this.domiciliacions.add(domiciliacion);
    }

    @Override
    public String toString(){
        return this.nCC+ " con cantidad " +this.cantidad;
    }
}
