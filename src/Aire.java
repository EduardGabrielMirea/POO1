public class Aire  {

    private String name;
    private int temperatura;
    private int maxTemp;
    private int minTemp;


    public Aire(String name, int temperatura, int maxTemp, int minTemp) {
        this.name = name;
        this.temperatura = temperatura;
        this.maxTemp = maxTemp;
        this.minTemp = minTemp;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }

    public int getMaxTemp() {
        return maxTemp;
    }

    public void setMaxTemp(int maxTemp) {
        this.maxTemp = maxTemp;
    }

    public int getMinTemp() {
        return minTemp;
    }

    public void setMinTemp(int minTemp) {
        this.minTemp = minTemp;
    }

    public void aumenta(){
        if (this.temperatura +1 <= this.maxTemp ){
            this.temperatura++;
        }else {
            throw new IllegalArgumentException("La temperatura no puede superar " + this.maxTemp);
        }
    }

    public void disminuye(){
        if (this.temperatura -1 >= this.minTemp ){
            this.temperatura--;
        }else {
            throw new IllegalArgumentException("La temperatura no puede ser mas baja que " + this.minTemp);
        }
    }

    @Override
    public String toString(){
        return "El aire " + this.name + " tiene una temperatura de "+ this.temperatura + "º";
    }

}
