package day32_maps;

import day31_maps.MapDepo;

import java.util.Map;

public class C06_SubeDegistirme {

    public static void main(String[] args) {

        // H subesindeki tüm öreğncilerin subesini A yapın

        Map<Integer, String> ogrenciMap = MapDepo.mapOlustur();

        /*
        ogrenciMap.put(101,"Ali-Can-11-H-MF");
        ogrenciMap.put(102,"Veli-Cem-10-K-TM");
        ogrenciMap.put(103,"Ali-Cem-11-K-TM");
        ogrenciMap.put(104,"Ayse-Can-10-H-MF");
        ogrenciMap.put(105,"Sevgi-Cem-11-M-TM");
        ogrenciMap.put(106,"Sevgi-Can-10-K-MF");
        ogrenciMap.put(107,"Esra-Han-11-M-SOZ");
         */

        /*
            MapDepo'da yaptığımız değişiklik orada kalacağı için method'dan map'in son halini return
            edip bu class'da onu ogrenciMap olarak atamalıyız yani kaydetmeliyiz.
         */

        MapDepo.subeDegistir(ogrenciMap , "H", "A");
        System.out.println(ogrenciMap);

        // Araba değişmeden, sadece yolcular değiştiği için başka method'da yapılan değişiklik kalıcı oluyor.
    }

}
