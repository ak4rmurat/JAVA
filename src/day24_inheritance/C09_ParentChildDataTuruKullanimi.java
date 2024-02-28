package day24_inheritance;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class C09_ParentChildDataTuruKullanimi {
    public static void main(String[] args) {

        String str = new String("Java");
        Object obj = new String("Tava");
        Object sayi = new Integer(5);

        ArrayList<Integer> liste1 = new ArrayList<>();
        List<Integer> liste2 = new ArrayList<>();

        /*
            Eşitliğin sol tarafındaki
            String, Object, List veya ArrayList
            HEM str, obj, sayi, Liste1 objelerinin oluşturduğu Class
            HEM DE bu objelerin data turudur.

            YANİ bir class'tan obje oluşturduğumuzda
                o objenin data turu, oluşturulduğu class'dir diyebiliriz.

         */

        C03_Corsa corsa1 = new C03_Corsa();
        C02_Opel corsa2 = new C03_Corsa();
        C01_Araba corsa3 = new C03_Corsa();


        /*
        Yukarıdaki C03_Corsa class'ındaki bizim oluşturduğumuz non-primitive'dir.
         */

    }
}
