package banco2;

public class Domiciliacion {

    private int numD;
    private CuentaCorriente cuentaCorriente;

    public Domiciliacion(int numD, CuentaCorriente cuentaCorriente) {
        this.numD = numD;
        this.cuentaCorriente = cuentaCorriente;
    }

    public int getNumD() {
        return numD;
    }

    public void setNumD(int numD) {
        this.numD = numD;
    }

    public CuentaCorriente getCuentaCorriente() {
        return cuentaCorriente;
    }

    public void setCuentaCorriente(CuentaCorriente cuentaCorriente) {
        this.cuentaCorriente = cuentaCorriente;
    }

    @Override
    public String toString(){
        return String.valueOf(this.numD);
    }

}
