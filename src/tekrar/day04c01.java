package tekrar;

import java.util.Scanner;

public class day04c01 {
    // kullanicidan notunu isteyin
    // not 50 veya daha fazla ise "Gectin" yazdirin
    public static void main(String[] args) {

        System.out.println("Lütfen notunuzu giriniz :");
        Scanner scanner = new Scanner(System.in);
        double not = scanner.nextDouble();

        if (0 <= not && not <= 100){
            if (not >= 50){
                System.out.println("Geçtin");
            }else {
                System.out.println("Kaldin");
            }
        }else {
            System.out.println("Hatali giris yaptiniz lutfen tekrar deneyin");
        }
    }
}
