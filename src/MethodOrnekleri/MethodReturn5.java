package MethodOrnekleri;

public class MethodReturn5 {
    /*
     // Verilen isim,soyisim ve KK numarasini asagida verilen formatta
    // donduren bir method olusturun kaydetme
    // input Ali, Kayali, 1234567890123456
    // output A** K*****, **** **** **** 3456

     */

    public static void main(String[] args) {

        System.out.println(duzenleKaydet("Murat", "Akar", "1234567891234567"));
    }

    public static String duzenleKaydet(String isim, String soyIsim, String kkNo){
        String duzenlenmisIsim = isim.substring(0, 1) +isim.substring(1).replaceAll("\\w", "*") +
                " " + soyIsim.charAt(0) + soyIsim.substring(1).replaceAll("\\w", "*") +
                ", " + "**** **** **** " + kkNo.substring(kkNo.length()-4);

        return duzenlenmisIsim;
    }
}
