package herencia.tienda;

public class Empleado {

    private String nombre;
    private int codigo;

    public Empleado(String nombre, int codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void vende(){
        System.out.println("Quieres una chocolatina? ");
    }

    public void habla(){
        System.out.println("Hola. Como te llamas? ");
    }


    public void rie(){
        System.out.println("Que gracia!! ");
    }

}
