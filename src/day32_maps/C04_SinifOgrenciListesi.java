package day32_maps;

import day31_maps.MapDepo;

import java.util.Map;

public class C04_SinifOgrenciListesi {

    // verilen sınıftaki tüm öğrencilerin
    // numara isim, soyisim ve subelerini yazdırın
    public static void main(String[] args) {
        /*
            ogrenciMap.put(101,"Ali-Can-11-H-MF");
            ogrenciMap.put(102,"Veli-Cem-10-K-TM");
            ogrenciMap.put(103,"Ali-Cem-11-K-TM");
            ogrenciMap.put(104,"Ayse-Can-10-H-MF");
            ogrenciMap.put(105,"Sevgi-Cem-11-M-TM");
            ogrenciMap.put(106,"Sevgi-Can-10-K-MF");
            ogrenciMap.put(107,"Esra-Han-11-M-SOZ");
         */

        Map<Integer, String> ogrenciMap = MapDepo.mapOlustur();

        MapDepo.sinifIleOgrenciBilgiYazdir(ogrenciMap, "10");
        MapDepo.sinifIleOgrenciBilgiYazdir(ogrenciMap, "11");
    }
}
