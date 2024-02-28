package MethodOrnekleri;

public class Method4 {
    /*
        // Verilen pozitif bir tamsayinin
        // faktoryel degerini yazdiran bir method olusturun
        // input:5   output :120   ( 5*4*3*2*1 )

     */
    public static void main(String[] args) {

        faktoriyelHesapla(5);
    }

    public static void faktoriyelHesapla(int sayi){
        int faktoriyel = 1;
        for (int i = 1; i <= sayi ; i++) {
            faktoriyel *= i;

        }
        System.out.println(sayi + "! = " + faktoriyel);
    }
}
