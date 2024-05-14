package tekrar;

import java.util.Scanner;

public class day03c02 {
    // Kullanicidan 3 basamakli pozitif bir tam sayi alin
    // Sayinin rakamlar toplamini yazdirin

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen 3 adet pozitif tamsayı giriniz : ");
        int sayi1 = scanner.nextInt();
        int sayi2 = scanner.nextInt();
        int sayi3 = scanner.nextInt();


        System.out.println("Girilen sayıların toplamı : " + (sayi1+sayi2+sayi3));
    }
}
