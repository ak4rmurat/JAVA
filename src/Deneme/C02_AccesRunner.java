package Deneme;

public class C02_AccesRunner {

    public static void main(String[] args) {

        C01_AccesModifier obj = new C01_AccesModifier();
        obj.setSatis(10);
        obj.setSatis(20);
        obj.setSatis(30);
        System.out.println(obj.getToplamSatis());
    }
}
