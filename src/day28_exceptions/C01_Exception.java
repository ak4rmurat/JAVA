package day28_exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C01_Exception {
    public static void main(String[] args) {

        // Kullanıcıdan 2 tam sayı alıp bu sayıların bölümünü yazdırın.
        Scanner scanner = new Scanner(System.in);


        int sayi1 = 0;
        int sayi2 = 0;
        boolean problemVarMi = true;
        while (problemVarMi){
            try {
                scanner = new Scanner(System.in);
                System.out.println("Lütfen iki tamsayı giriniz :");
                sayi1 = scanner.nextInt();
                sayi2 = scanner.nextInt();
                problemVarMi = false;
            } catch (InputMismatchException e) {
                System.out.println("Tamsayi dedik....");
            }
        }

        if (sayi2==0){
            System.out.println("İkinci sayı 0 olamaz.");
        }else {
            System.out.println("Verilen sayıların bölümü = " + sayi1/sayi2);

            System.out.println("Kodda bir hata olursa bu satır çalışmaz.");

        }
    }
}
