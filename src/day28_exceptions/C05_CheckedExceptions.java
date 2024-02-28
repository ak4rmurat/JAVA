package day28_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C05_CheckedExceptions {

    public static void main(String[] args) throws FileNotFoundException {

         /*
            Bildiğimiz exception'lar

            1 - ArrayIndexOutOfBoundsException
            2 - StringIndexOutOfBoundsException
            3 - ArithmeticException
            4 - NullPointerException
            5 - InputMissMatchException

            Compile Time Exceptions

            Compile Time Exception;
            Kodlarımızı yazdığımız sırada Javanın farkına vardığı exception türleridir.
            Genellikle dosya işlemlerinde karşılaşırız.

            Compile Time Exception'larda Run Time Exception gibi try-catch blokları ile
            handle edilip sorun oluşsa bile kodun çalışmaya devam etmesi sağlanabilir.

            Compile Time Exception'da Java bize bir opstion daha sunuyor.

            Eğer hata olursa kodların devam etmesini İSTEMİYORSANIZ.
            Amacınız sadece KIRMIZI ÇİZGİYİ yokedip Java'nın çalışmasını sağlamak ise

          */

        String dosyaYolu = "src/day28_exceptions/deneme.txt";

        FileInputStream fileInputStream = new FileInputStream(dosyaYolu);








    }
}
