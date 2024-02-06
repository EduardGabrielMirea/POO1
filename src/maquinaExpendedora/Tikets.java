package maquinaExpendedora;

public class Tikets {
    private int precio;
    private String hora;
    private String fecha;
    private Maquina maquina;

    public Tikets(int precio, String hora, String fecha, Maquina maquina) {
        this.precio = precio;
        this.hora = hora;
        this.fecha = fecha;
        this.maquina = maquina;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Maquina getMaquina() {
        return maquina;
    }

    public void setMaquina(Maquina maquina) {
        this.maquina = maquina;
    }

    @Override
    public String toString(){
        return this.fecha + " - " + this.hora + "- "+ this.precio;
    }
}
