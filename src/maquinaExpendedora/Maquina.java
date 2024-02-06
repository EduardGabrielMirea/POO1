package maquinaExpendedora;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Maquina {
    private int ususario;
    private int cajon;
    private Set<Integer> monedas;
    private Set<Tikets> tikets;

    public Maquina(int ususario, int cajon) {
        this.ususario = ususario;
        this.cajon = cajon;
        this.tikets = new HashSet<>();
        this.monedas = new HashSet<>();
    }

    public int getUsusario() {
        return ususario;
    }

    public void setUsusario(int ususario) {
        this.ususario = ususario;
    }

    public int getCajon() {
        return cajon;
    }

    public void setCajon(int cajon) {
        this.cajon = cajon;
    }

    public Set<Tikets> getTikets() {
        return tikets;
    }

    public void setTikets(Set<Tikets> tikets) {
        this.tikets = tikets;
    }

    public Set<Integer> getMonedas() {
        return monedas;
    }

    public void setMonedas(Set<Integer> monedas) {
        this.monedas = monedas;
    }

    //adds
    public void addTikest(Tikets tikets){
    this.tikets.add(tikets);
    }
    public void addMonedas(Integer monedas){
        this.monedas.add(monedas);
    } //Revisar....

    @Override
    public String toString(){
        return String.valueOf(this.ususario + this.cajon);
    }

}
