public class Person extends Object{



    private String name;
    private String street;


    public Person(String name, String street) {
        this.name = name;
        this.street = street;

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStreet(String street) {
        this.street = street;
    }


    public String getName() {
        return name;
    }

    public String getStreet() {
        return street;
    }
    @Override
    public String toString(){
        return this.name + "\n\t" + this.street;
    }



}
