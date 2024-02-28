package day28_exceptions;

public class C04_TryCatch {

    public static void main(String[] args) {

        int sayi1 = 10;
        int sayi2 = 0;

        try {
            System.out.println("satir1");
            System.out.println("satir2");
            System.out.println(sayi1/sayi2);
            System.out.println("satir3");
            System.out.println("satir4");
        } catch (ArithmeticException e) {
            // 1 - e => catch cümlesinin yakaladığı exception'ı kaydettiği variable ismidir.

            // 2 - Try bölümünde oluşan exception'ın catch bölümünde yakalanabilmesi için
            // uygun exception türü yazılmalıdır.

            // 3 - Catch bölümü hatayı ayıkladığında hatayı "e" variable'ına kaydeder ve
            // çalışmaya devam eder.

            // 4 - Eğer Java'nın yakaladığı hatayı tamamen veya kısmen yazdırmak isterseniz
            // "e" objesi ile hazır method'lar kullanabilirsiniz.

            //System.out.println("ikici sayı sıfır olamaz.");
            // e.printStackTrace();
            /*
            java.lang.ArithmeticException: / by zero
	        at day28_exceptions.C04_TryCatch.main(C04_TryCatch.java:11)
             */
            System.out.println(e.toString()); // java.lang.ArithmeticException: / by zero

            System.out.println(e.getMessage()); // / by zero
        }
    }
}
