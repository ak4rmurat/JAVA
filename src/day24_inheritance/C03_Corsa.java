package day24_inheritance;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class C03_Corsa extends C02_Opel{
    C03_Corsa(){
        this(5);
        System.out.println("Corsa constructor çalıştı.");
    }
    C03_Corsa(int a){
        super();
        System.out.println("Corsa parametreli constructor calisti");
    }

    String model = "Corsa";
    String motor = "vvt";
    String renk = "belirtilmedi";

    public static void main(String[] args) {

        // Java'da olusturulan bir objeye ilk deger atamasinin yapilabilmesi icin CONSTRUCTOR calismalidir
        // Nasil oldu da sadece C03_Corsa() calisarak, parent'i olan
        // Opel ve araba class'indaki ozellikleri
        // olusturulan corsa1 objesine ekledi ?

        /*
            Java chlid class'dan bir obje oluşturduğunda parant class'daki
            özelliklere sahip olmasını sağlamak için parent class'larin
            consturctor'ları  otomatik olarak çalıştıracak özel bir
            mekanizma oluşturmuştur.

            Java oluşturulan her class'a default constructor koyduğu gibi

            EXTENDS keyword kullanan class'lardaki her constructor'ın ilk
            satırına'da parametresiz super() [constructor call] koyar.
         */

        C03_Corsa corsa1 = new C03_Corsa();

        // sistem Constructor'un içine girmeden objeyi oluşturur sonra girer.

        System.out.println(corsa1.model); // Corsa
       // System.out.println(corsa1.motor); // vvt
       // System.out.println(corsa1.renk); // belirtilmedi

       // System.out.println(corsa1.marka); // Opel
       // System.out.println(corsa1.kasa); // Belirtilmedi






    }
}
