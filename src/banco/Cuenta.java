package banco;

public class Cuenta {

    private String titular;

    private double cantidad;


    //Este constructor piede de forma obligatoria la variable cantidad.
    public Cuenta(String titular, double cantidad) {
        this.titular = titular;
        this.cantidad = cantidad;
    }
    //Creando un constructor para que la variable cantidad sea opcinal.
    public Cuenta(String titular) {
        this.titular = titular;
        this.cantidad = 0;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public void ingresar(double cantidad){
        if (this.cantidad > 0){

        }
    }
    @Override
    public String toString(){
        return "El titular de la cuenta " + this.titular;
    }

}
