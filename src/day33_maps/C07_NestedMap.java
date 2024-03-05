package day33_maps;

import java.util.HashMap;
import java.util.Map;

public class C07_NestedMap {
    public static void main(String[] args) {


    /*
        ogrenciMap.put(101,{"isim=Ali, soyisim=Can, sinif=11, sube=H, bolum=MF");
        ogrenciMap.put(102,"Veli-Cem-10-K-TM");
        ogrenciMap.put(103,"Ali-Cem-11-K-TM");
        ogrenciMap.put(104,"Ayse-Can-10-H-MF");
        ogrenciMap.put(105,"Sevgi-Cem-11-M-TM");
        ogrenciMap.put(106,"Sevgi-Can-10-K-MF");
        ogrenciMap.put(107,"Esra-Han-11-M-SOZ");
     */

        Map<Integer, Map<String, String>> nesOgrMap = new HashMap<>();

        Map<String, String> ogrenciValueMap101 = new HashMap<>();

        ogrenciValueMap101.put("isim", "Ali");
        ogrenciValueMap101.put("soyisim", "Can");
        ogrenciValueMap101.put("sinif", "11");
        ogrenciValueMap101.put("sube", "H");
        ogrenciValueMap101.put("bolum", "MF");

        nesOgrMap.put(101,ogrenciValueMap101);
        System.out.println(nesOgrMap); // {101={sifin=11, sube=H, soyisim=Can, bolum=MF, isim=Ali}}

        // 101 numaralı öğrencinin ismini yazdırın

        nesOgrMap.get(101); //{sifin=11, sube=H, soyisim=Can, bolum=MF, isim=Ali}

        // Ali

        System.out.println(nesOgrMap.get(101).get("bolum")); // MF

        // 101 numaralı öğrencinin soyismini Han yapın

        nesOgrMap.get(101).put("soyisim","Han");

    }
}
