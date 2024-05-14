package tekrar;

import java.util.Scanner;

public class day04c11 {
    //Soru 3- Kullanicidan aldigi urun adedini ve indirimsiz fiyatini alin,
    //        kullaniciya musteri karti olup olmadigini sorun.
    //        Musteri karti varsa
    //              - 10 urunden fazla alirsa %20,
    //              - az alirsa %15 indirim yapin,
    //        Musteri karti yoksa
    //              - 10 urunden fazla alirsa %15,
    //              - az alirsa %10 indirim yapin
    // ve toplam fiyati yazdirin
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Müşteri kartınız var mı ? E/H");
        char chr = scanner.nextLine().charAt(0);
        char girilenChr = Character.toUpperCase(chr);
        
        System.out.println("Lütfen almak istediginiz urun adedini girin");
        int adet = scanner.nextInt();

        System.out.println("Lütfen urunun fiyatini giriniz ");
        double fiyat = scanner.nextDouble();

        double toplamFiyat = 0;


            if (girilenChr == 'E'){
                if (adet > 10){                    
                    System.out.println("Toplam fiyat : " + (adet*fiyat*0.80) + " TL" );
                }else {
                    System.out.println("Toplam fiyat : " + (adet*fiyat*0.85)+ " TL" );
                }
            }else {
                if (adet > 10){
                    System.out.println("Toplam fiyat : " + (adet*fiyat*0.85) + " TL");
                }else {
                    System.out.println("Toplam fiyat : " + (adet*fiyat*0.90) + " TL");
                }
            }

       
    }
}
