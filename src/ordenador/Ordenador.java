package ordenador;

public class Ordenador implements Comparable<Ordenador>{

    private String name;

    private int code;

    public Ordenador(String name, int code) {
        this.name = name;
        this.code = code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public int getCode() {
        return code;
    }

    @Override
    public String toString(){
        return  "El modelo " + this.name + " con nmr de identificacion:  " + this.code;
    }
    @Override
    public int compareTo(Ordenador other){

        return this.code - other.getCode();
    }

}
