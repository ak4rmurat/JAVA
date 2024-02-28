package day28_exceptions;

import java.util.Scanner;

public class C03_MultipleExceptions {

    public static void main(String[] args) {

        String str = "Java Candir";

        String[] harfler = {"a", "b", "c", "f", "g", "h", "j", "k"};

        /*
              Kullanıcıdan pozitif bir sayı isteyip
              sayıyı index kabul edin ve str ve array'deki sayıya ait karakter ve elementleri yazdırın

              örnek input : 2 ; outpuy => v,c
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Index olarak pozitif bir tamsayı giriniz ");
        int index  = scanner.nextInt();



        // Birden fazla exception oluşta ihtimali varsa öncelikle bu olası exception'ların birbiri ile
        // ilintili olup olmadığına ( Parent - Child exceptions ) bakmalıyız.
        /*
        Eğer bu sorudaki gibi olası exception'lar birbiri ile ilintili değil ise üç(3) farklı çözüm
        üretebiliriz.

         */

        // 1 - İki tane bağımsız try - catch yapabiliriz.

        // try {
        //     System.out.println(str.charAt(index)); // StringIndexOutOfBoundsExceptions
        // } catch (StringIndexOutOfBoundsException e) {
        //     System.out.println("Verilen index String'in sınırları dışında");
        // }

        // try {
        //     System.out.println(harfler[index]); // ArrayIndexOutOfBoundsExceptions
        // } catch (ArrayIndexOutOfBoundsException e) {
        //     System.out.println("Verilen index Array'in sınırları dışında");
        // }

        // 2 - Bir try, birden fazla catch kullanabiliriz.
        //     Ancak burada ilk exception ile karşılaştığında çalışmayı durduracağı için
        //     tüm exception'ları raporlayamayabilir.

        //try {
        //    System.out.println(str.charAt(index)); // StringIndexOutOfBoundsExceptions
        //    System.out.println(harfler[index]); // ArrayIndexOutOfBoundsExceptions
        //} catch (StringIndexOutOfBoundsException e) {
        //    System.out.println("Verilen index String'in sınırları dışında");
        //} catch (ArrayIndexOutOfBoundsException e){
        //    System.out.println("Verilen index Array'in sınırları dışında");
        //}

        // 3 - Tek bir try ve daha kapsamlı bir tek catch kullanabiliriz.
        // Bu durumda tek bir catch ile sorunu çözebiliriz.
        // ancak hata raporunu detaylandıramayız, genel bir hata verebiliriz.

           try {
               System.out.println(str.charAt(index)); // StringIndexOutOfBoundsExceptions
               System.out.println(harfler[index]); // ArrayIndexOutOfBoundsExceptions
           } catch (RuntimeException e) {
               System.out.println("Verilen index sınırların dışında");
           }


    }

}

