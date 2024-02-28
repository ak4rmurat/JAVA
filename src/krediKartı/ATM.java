package krediKartı;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Scanner;

public class ATM {
    static Scanner scanner = new Scanner(System.in);
    static String kkNo ="1111 2222 3333 4444";
    static String sifre = "123456";

    public static void main(String[] args) {
        /*
        ATM Kullanicidan giriş için kart numarasi ve şifresini isteyin,
        eger herhangi birini yanlis girerse tekrar isteyin. Kart numarasi
        aralarda boşluk ile girerse de eger doğruysa kabul edin. Kart numarasi
        ve sifre dogrulanirsa kullanicinin yapabileceği işlemleri ekrana yazdirin
        ,   Menu listesinde Bakiye sorgula, para yatirma, para çekme, para gönderme
        , sifre değiştirme ve cikis islemleri olacaktır.   Para çekme ve para gonderme
         işleminde mevcut bakiyeden buyuk para çekilemez,  Para gönderme işleminde
         istenen iban TR ile baslamali ve toplam 26 karakterli olmali, eger değilse
         menü ekranina geri donsun.  Sifre değiştirme işleminde mevcut şifreyi teyit
         ettikten sonra, sifre değişiklik işlemini yapmali,
         */


        menu();


    }

    public static void kkKontrol(){
        System.out.println("Lütfen kredi kartı numaranızı giriniz ");
        String girilenKKNo = scanner.nextLine();
        String bosluksuzKKNo = kkNo.replace(" ", "");
        System.out.println(bosluksuzKKNo);

        while(!(girilenKKNo.equalsIgnoreCase(kkNo) || bosluksuzKKNo.equalsIgnoreCase(girilenKKNo))){
            System.out.println("Hatalı giriş yaptınız lütfen kredi kartı numaranızı tekrar giriniz ");
            girilenKKNo = scanner.nextLine();

        }

    }

    public static void sifreKontrol(){
        String boskod = scanner.nextLine();
        System.out.println(boskod);
        System.out.println("Lütfen sifrenizi giriniz :");
        String girilenSifre = scanner.nextLine();

        while(!sifre.equalsIgnoreCase(girilenSifre)){
            System.out.println("Hatalı giriş yaptınız lütfen şifrenizi tekrar giriniz ");
            girilenSifre = scanner.nextLine();
        }
    }

    public static void menu(){
        System.out.println("1 - Bakiye Sorgulama \n" +
                "2 - Para Yatırma \n3 - Para Çekme\n4 - Para Gönderme \n5 - Şifre Değiştir\n6 - Çıkış");
        char secim = scanner.next().charAt(0);

        while (!('1'<= secim && secim <= '6')){
            System.out.println("Hatalı giriş yaptınız tekrardan giriş yapın.");
             menu();
        }
        switch (secim){
            case '1' :
                bakiyeSorgulama();
                break;
            case '2' :
                paraYatirma();
                break;
            case '3':
                paraCekme();
                break;
            case '4' :
                paraGonderme();
                break;
            case '5' :
                sifreDegistir();
                break;
            case '6' :
                cikis();
                break;

        }
    }

    public static void cikis() {
        System.exit(0);
    }

    public static void sifreDegistir() {

        sifreKontrol();

        System.out.println("Değiştirmek istediğini şifreyi giriniz :");
        String yeniSifre = scanner.nextLine();

        sifre = yeniSifre;

        menuSorgu();

    }

    public static void paraGonderme() {
    }

    public static void paraCekme() {
    }

    public static void paraYatirma() {
    }

    public static void bakiyeSorgulama() {
    }
    public static void menuSorgu(){
        System.out.println("İşlemlere devam etmek istiyor musunuz E/H?");
        char tercih = scanner.next().charAt(0);
        tercih = Character.toUpperCase(tercih);
        while (!(tercih == 'E' || tercih == 'H')){
            System.out.println("Hatalı seçim yaptınız lütfen tekrar seçiminizi yapınız");
            tercih = scanner.next().charAt(0);
            tercih = Character.toUpperCase(tercih);
        }
        if (tercih == 'E'){
            menu();
        }else {

            cikis();
        }

    }
}
