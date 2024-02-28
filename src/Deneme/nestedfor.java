package Deneme;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class nestedfor {
    static Scanner scan = new Scanner(System.in);

    // Kullanicidan toplanmak uzere pozitif tamsayilar isteyin
    // Kullaniciya bitirmek istediginde 0'a basmasini soyleyin
    // Kullanici bitirmek istediginde toplam kac adet pozitif tam sayi girdigini
    // ve bunlarin toplaminin kac oldugunu yazdirin
    // Kullanici negatif sayi girerse "negatif sayi kullanamazsiniz " yazdirin
    // bu negatif sayiyi sayi adedine ve toplama eklemeyin.
    public static void main(String[] args) {

        System.out.println("Toplamını ve adetini öğrenmek istediğiniz  pozitif tamsayıları giriniz / Çıkmak için '0'ı tuşlayın.");
        int girilenSayi = scan.nextInt();
        int toplam = 0;
        int sayac = 0;

        while (girilenSayi != 0){
            if (girilenSayi > 0){
                toplam += girilenSayi;
                sayac++;
            }else{
                System.out.println("Negatif sayı giremezsiniz.");
            }
            System.out.println("Toplamını ve adetini öğrenmek istediğiniz  pozitif tamsayıları giriniz / Çıkmak için '0'ı tuşlayın.");
            girilenSayi = scan.nextInt();

        }

        System.out.println("Girdiğiniz pozitif tam sayıların toplamı = " + toplam +" Girdiğiniz pozitif tamsayi adeti = " + sayac);



    }



}
