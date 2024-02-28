package MethodOrnekleri;

public class Method02 {
    /*
    // Verilen pozitif bir tamsayinin
     // pozitif tam bolen sayisini yazdiran bir method olusturun
     // PTBS  input : 20  output :6    (1,2,4,5,10,20)

     */

    public static void main(String[] args) {
        pozitifBolenSayisi(20);

    }

    public static void pozitifBolenSayisi(int sayi){

        int sayac = 0;
        for (int i = 1; i <= sayi; i++) {
            if (sayi % i == 0){
                sayac++;
            }
        }

        System.out.println(sayi + " sayısının " + sayac + " adet pozitif tamsayı böleni var.");
    }

}
