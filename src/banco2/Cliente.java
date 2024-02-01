package banco2;

import java.util.HashSet;
import java.util.Set;

public class Cliente {

    private String dni;

    private String nombre;

    private Set<CuentaCorriente> cuentaCorrientes;

    private Set<Prestec> prestecs;


    public Cliente(String dni,String nombre ,Set<CuentaCorriente> cuentaCorrientes, Set<Prestec> prestecs) {
        this.dni = dni;
        this.nombre = nombre;
        this.cuentaCorrientes = new HashSet<>();
        this.prestecs = new HashSet<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Set<CuentaCorriente> getCuentaCorrientes() {
        return cuentaCorrientes;
    }

    public void setCuentaCorrientes(Set<CuentaCorriente> cuentaCorrientes) {
        this.cuentaCorrientes = cuentaCorrientes;
    }

    public Set<Prestec> getPrestecs() {
        return prestecs;
    }

    public void setPrestecs(Set<Prestec> prestecs) {
        this.prestecs = prestecs;
    }

    //Añadimos 1 prestamo a la lista de prestamos del cliente.
    public void addPrestec(Prestec prestec){
        this.prestecs.add(prestec);
    }
    //Añadimos 1 cuenta corriente a la lista de cuentas corrientes del cliente.
    public void addCuentaCorriente(CuentaCorriente cuentaCorriente){
        this.cuentaCorrientes.add(cuentaCorriente);
    }
    @Override
    public String toString(){
        return  "El cliente "+this.nombre+" con dni : "+this.dni;
    }

}
