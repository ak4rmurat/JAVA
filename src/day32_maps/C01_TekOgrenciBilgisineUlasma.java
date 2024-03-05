package day32_maps;

import day31_maps.MapDepo;

import java.util.HashMap;
import java.util.Map;

public class C01_TekOgrenciBilgisineUlasma {

    public static void main(String[] args) {

        Map<Integer, String> ogrenciMap = new HashMap<>();
        ogrenciMap.put(101,"Ali-Can-11-H-MF");
        ogrenciMap.put(102,"Veli-Cem-10-K-TM");
        ogrenciMap.put(103,"Ali-Cem-11-K-TM");
        ogrenciMap.put(104,"Ayse-Can-10-H-MF");
        ogrenciMap.put(105,"Sevgi-Cem-11-M-TM");
        ogrenciMap.put(106,"Sevgi-Can-10-K-MF");
        ogrenciMap.put(107,"Esra-Han-11-M-SOZ");

        ogrenciMap.put(108, "Veli-San-11-H-TM");

        // manuel olarak 102 nolu öğrencinin soyadını han yapalım

        ogrenciMap.put(102, "Veli-Han-10-K-TM");
        ogrenciMap = MapDepo.soyAdiDegistir(ogrenciMap, 108, "Genc");

        System.out.println(ogrenciMap);

        /*
            103 numaralı öğrenciin soyismini yazdırın. Value içindeki bir bilgiye ulaşmak için
            1 - Value'yi elde ederiz
            2 - Value'yi bir array'e çeviririz.
            3 - Array'den istediğimiz bilgiye ulaşabiliriz.
         */

        System.out.println(MapDepo.getData(ogrenciMap, 103, "soyısım"));

        // 105 numaralı öğrencinin isim ve soyismini yazdırın

        System.out.println("105 numaralı öğrencinin isim ve soyismi : " +
                            MapDepo.getData(ogrenciMap, 105, "ısım")+
                            " "+
                            MapDepo.getData(ogrenciMap, 105, "soyısım"));

    }
}
