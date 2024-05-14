package tekrar;

import java.util.Scanner;

public class day04c06 {
    //Soru 4- Kullanicidan bir karakter girmesini isteyin,
    //        girilen karakterin buyuk harf olup olmadigini yazdirin.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen kucuk veya buyuk bir harf giriniz ");
        char chr = scanner.nextLine().charAt(0);

        if (Character.isUpperCase(chr)){
            System.out.println("Girdiginiz harf buyuk");
        }else {
            System.out.println("Girdiginiz harf kucuk");
        }
    }
}
