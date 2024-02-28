package MethodOrnekleri;

public class Method01 {
    /*
     Verilen sayinin asal sayi olup olmadigini kontrol edip,
         sonuc olarak “asal sayi” veya “asal sayi degil” yazdiran
         bir method olusturun

     */

    public static void main(String[] args) {
        asalSayiMi(11);
        asalSayiMi(35);

    }

    public static void asalSayiMi(int sayi){
        int sayac = 0;
        for (int i = 2; i < sayi ; i++) {
            if (sayi % i == 0){
                sayac++;
            }
        }
        if (sayac == 0){
            System.out.println("Asal sayı");
        }else {
            System.out.println("Asal sayı değil");
        }
    }
}
