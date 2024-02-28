package day29_exceptions_iterator;

public class C05_KontrollüExceptionOluşturma {

    public static void main(String[] args) {

        /*
        Eğer herhangi bir durumda exception oluşmasını istediğimizde o durumda Java'nın hazır
        exception'ı yoksa biz throw keyword kullanarak biz bir exception fırlatabiliriz.

        Ayrıca kod'da belirli bir durumda başka bir yere göndermek istersek de throw new
         */

        System.out.println("satir1");
        System.out.println("satir2");
        System.out.println("satir3");
        throw new RuntimeException("Keyfim istedi exception fırlattım");

        // System.out.println("satir4");
        // System.out.println("satir5");

    }
}
