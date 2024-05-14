package tekrar;

import java.util.Scanner;

public class day04c08 {
    //Soru 5- Kullanicidan bir harf isteyin,
    //        girilen karakter kucuk harf ise onu buyuk harf olarak yazdirin,
    //        yoksa girilen karakteri girildigi gibi yazdirin

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen kucuk veya buyuk bir harf giriniz ");
        char chr = scanner.nextLine().charAt(0);

        if (Character.isLowerCase(chr)){
            System.out.println(Character.toUpperCase(chr));
        }else {
            System.out.println(chr);
        }
    }
}
