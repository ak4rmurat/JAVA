package MethodOrnekleri;

public class MethodReturn7 {
    /*
        // verilen bir sayi asal sayi ise true,
        // asal sayi degilse false donduren bir method olusturun

     */

    public static void main(String[] args) {

        System.out.println(asalMi(11));
        System.out.println(asalMi(35));
    }

    public static boolean asalMi(int sayi){
        boolean sorgu = false;
        int sayac = 0;
        for (int i = 2; i < sayi ; i++) {
            if (sayi % i == 0){
                sayac++;
            }
        }
        if (sayac == 0){
            sorgu = true;
        }

        return sorgu;
    }
}
