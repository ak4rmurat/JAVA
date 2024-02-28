package day28_exceptions;

import java.io.FileInputStream;

public class C02_Exceptions {

    public static void main(String[] args) {

        /*
            Java Compile Time Error'da variable'ların değerlerini göremez.
            Ama data türlerini bilir.

            Yazdığımız kodları syntax ve data türleri açısından kontrol edip
            uygun olmayan bir durumla karşılaşırsa CTE verir.Altını çizer

            Ancak altı çizilen her durum Compile Time Error değildir.
            Bazen Compile Time Exception'da olabilir.

         */

        // String str = 5; //Required type:String    Provided: int

        // FileInputStream fileInputStream = new FileInputStream("asd");

        String str = "Java Candir";

        System.out.println(str.substring(7)); // ndir
        System.out.println(str.substring(15)); // StringIndexOutOfBoundsException

        // Exception hatası varsa bu KONTROL ALTINA ALINABİLİR.

        str = null;

        // System.out.println(str.length()); // NullPointerException
    }
}
