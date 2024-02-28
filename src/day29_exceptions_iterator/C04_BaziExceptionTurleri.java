package day29_exceptions_iterator;

public class C04_BaziExceptionTurleri {

    public static void main(String[] args) {

        // NullPointerException
        // Bir variable null olarak işaretlenip
        // sonra yazdırma dısında bir işlem yapılırsa NPE oluşur

        String str = null;
        System.out.println(str);

        // System.out.println(str.substring(1)); //NullPointerException

        // 2 - StringIndexOutOfBoundsException
        // 3 - ArrayIndexOutOfBoundException
        // 4 - ArithmeticException

        // 5 - NumberFormatException
        // String'i integer'a parse yapmaya çalışırken String sayı olmayan bir karakter
        // içerirse oluşur.

        String say1 = "24a";
        String say2 = "12";

        // say1 ve say2 sayısal olarak toplayın

        System.out.println(say1 + say2); // 24a12

        //System.out.println(Integer.parseInt(say1) + Integer.parseInt(say2)); // NumberFormatException

        // 6 - ClassCastException

        Integer sayi = 10;

        Object obj = sayi; // Object HAS - A Integer

        String str1 = (String) obj; // String IS - A Object

        // 7 - FileNotFoundException
        // 8 - IOException ==> Dosya Input-Output exception, Parent exception olduğunu unutma!....
        // 9 - RunTimeException ==> Run time'da ortaya çıkan tüm exception'ların parent'idir.
        // 10 - Exception ==> Tüm exception'ların parent'idir.




    }
}
