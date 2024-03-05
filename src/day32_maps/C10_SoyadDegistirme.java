package day32_maps;

import day31_maps.MapDepo;

import java.util.Map;

public class C10_SoyadDegistirme {

    public static void main(String[] args) {

        Map<Integer, String> ogrenciMap = MapDepo.mapOlustur();
        System.out.println(ogrenciMap);
        /*-
        {101=Ali-Can-11-H-MF,
        102=Veli-Cem-10-K-TM,
        103=Ali-Cem-11-K-TM,
        104=Ayse-Can-10-H-MF,
        105=Sevgi-Cem-11-M-TM,
        106=Cem-Can-10-K-MF,
        107=Esra-Han-11-M-SOZ}
         */

        // Butun can soyadlarını Yılmaz yap

        ogrenciMap = MapDepo.bodySoyadDegistir(ogrenciMap, "Can", "Yılmaz");

        System.out.println(ogrenciMap);
    }
}
