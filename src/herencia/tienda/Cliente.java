package herencia.tienda;

public class Cliente extends Empleado{

    public Cliente(String nombre, int codigo){
        super(nombre,codigo);
    }
    @Override
    public void vende(){
        System.out.println("Quieres una chocolatina? ");
    }
    @Override
    public void habla(){
        System.out.println("Hola. Como te llamas? ");
    }

    @Override
    public void rie(){
        System.out.println("Que gracia!! ");
    }

}
