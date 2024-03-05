package Deneme;

import java.util.Map;
import java.util.Scanner;

public class Array {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        int sayi ;
        int toplam = 0;

        do{
            System.out.println("toplamını istediğiniz sayıyı giriniz : ");
            sayi = scan.nextInt();
            toplam +=sayi;
        }
        while (!(sayi == 0));

        System.out.println("sayıların toplamı : "+toplam);



    }
}
