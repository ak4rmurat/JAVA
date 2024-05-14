package tekrar;

import java.util.Scanner;

public class day05c10 {
    // Kullanicidan gun numarasini alin
    // girilen numaraya gore gun ismini yazdirin

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen gün numarasını giriniz ");
        int gun = scanner.nextInt();

        switch (gun){
            case 1:
                System.out.println("pazartesi");
                break;
            case 2:
                System.out.println("sali");
                break;
            case 3:
                System.out.println("carsamba");
                break;
            case 4:
                System.out.println("persembe");
                break;
            case 5:
                System.out.println("cuma");
                break;
            case 6:
                System.out.println("cumartesi");
                break;
            case 7:
                System.out.println("pazar");
                break;
            default:
                 break;
        }

    }
}
