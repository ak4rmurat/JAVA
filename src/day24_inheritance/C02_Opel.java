package day24_inheritance;

public class C02_Opel extends C01_Araba{
    C02_Opel(){
        this(5);
        System.out.println("Opel constructor çalıştı.");
    }

    C02_Opel(int a){
        System.out.println("parametreli opel constructor calisti");
    }

    String marka = "Opel";
    String renk = "Belirtilmedi";


        C01_Araba obj = new C01_Araba();

        C01_Araba obj2 = new C03_Corsa();
}
