package aire;

public class MainAire {

    public static void main(String[] args) {
        Aire aire = new Aire("Yamaha",20,30,-10);

        aire.aumenta();
        aire.aumenta();
        System.out.println(aire);

        aire.disminuye();
        aire.disminuye();
        System.out.println(aire);


        Aire aire2 = new Aire("Yamaha2",29,30,-10);


        aire2.aumenta();
        aire2.aumenta();
        aire2.aumenta();
        System.out.println(aire2);

    }
}
