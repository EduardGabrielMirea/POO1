package banco2;

import java.util.HashSet;
import java.util.Set;

public class Sucursal {

    private String direccion;

    private int nSuc;

    private Banco banco;

    private Set<Prestec> prestecs;

    private Set<CuentaCorriente> cuentaCorrientes;

    public Sucursal(String direccion, int nSuc,Banco banco, Set<CuentaCorriente> cuentaCorrientes, Set<Prestec> prestecs) {
        this.direccion = direccion;
        this.banco = banco;
        this.nSuc = nSuc;
        this.prestecs = new HashSet<>();
        this.cuentaCorrientes = new HashSet<>();
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    //Hemos eliminado los setters del numero de sucursal para que no se pueda cambiar y tamb el de Banco porque no se puede cambiar de banco.

    public int getnSuc() {
        return nSuc;
    }
    public Banco getBanco() {
        return banco;
    }


    public Set<CuentaCorriente> getCuentaCorrientes() {
        return cuentaCorrientes;
    }

    public void setCuentaCorrientes(Set<CuentaCorriente> cuentaCorrientes) {
        this.cuentaCorrientes = cuentaCorrientes;
    }

    //AADD.
    public void addPrestamo(Prestec prestec){
        this.prestecs.add(prestec);
    }
    public void addCuentaCorriente(CuentaCorriente cuentaCorriente){
        this.cuentaCorrientes.add(cuentaCorriente);
    }
    @Override
    public String toString(){
        return this.direccion + " - " + this.nSuc;
    }


}
