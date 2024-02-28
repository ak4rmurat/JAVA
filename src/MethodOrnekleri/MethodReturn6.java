package MethodOrnekleri;

public class MethodReturn6 {
    /*
        / Verilen pozitif bir tamsayinin
        // faktoryel degerini donduren bir method olusturun
        // input:5   output :120   ( 5*4*3*2*1 )

     */

    public static void main(String[] args) {

        System.out.println(faktoriyelHesapla(6));

    }

    public static int faktoriyelHesapla(int sayi){
        int faktoriyel = 1;
        for (int i = 1; i <= sayi ; i++) {
            faktoriyel *= i;

        }

        return faktoriyel;
    }
}
