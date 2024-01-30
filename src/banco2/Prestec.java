package banco2;

import java.util.Date;
import java.util.Set;

public class Prestec {

    private int numPrestec;

    private int cantidad;

    private String dataPrestec;
    private Sucursal sucursal;

    public Prestec(int numPrestec, String dataPrestec, Sucursal sucursal, int cantidad) {
        this.numPrestec = numPrestec;
        this.dataPrestec = dataPrestec;
        this.cantidad = cantidad;
        this.sucursal = sucursal;
    }


    public int getNumPrestec() {
        return numPrestec;
    }

    public void setNumPrestec(int numPrestec) {
        this.numPrestec = numPrestec;
    }

    public String getDataPrestec() {
        return dataPrestec;
    }

    public void setDataPrestec(String dataPrestec) {
        this.dataPrestec = dataPrestec;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Sucursal getSucursal() {
        return sucursal;
    }

    public void setSucursal(Sucursal sucursal) {
        this.sucursal = sucursal;
    }

    @Override
    public String toString(){
        return this.numPrestec + " - " + this.dataPrestec + " = " + this.cantidad;
    }


}
