package MethodOrnekleri;

public class Method03 {
    /*
        // Verilen isim,soyisim ve KK numarasini asagida verilen formatta yazdiran
        // bir method olusturun
        // input Ali, Kayali, 1234567890123456
        // output A** K*****, **** **** **** 3456

     */

    public static void main(String[] args) {
yazdir("Murat", "Akar", "1234567891234567");
    }

    public static void yazdir(String isim, String soyIsim, String kkNo){

        System.out.println(isim.substring(0, 1) +isim.substring(1).replaceAll("\\w", "*") +
                    " " + soyIsim.charAt(0) + soyIsim.substring(1).replaceAll("\\w", "*") +
                    ", " + "**** **** **** " + kkNo.substring(kkNo.length()-4));

    }
}
