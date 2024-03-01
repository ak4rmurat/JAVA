package day31_maps;

import java.util.HashMap;
import java.util.Map;

public class C06_OgrenciMap {
    public static void main(String[] args) {

        // Öğrenci map'inde 105 öğrencinin bölümünü yazdırın

        Map<Integer, String> ogrenciMap = MapDepo.mapOlustur();

        System.out.println(ogrenciMap);

        // 108 numaralı bir öğrenci ekleyelim

        ogrenciMap.put(108, "Murat-Akar-12-D-MF");

        System.out.println(ogrenciMap);

        String istenenNoValue = ogrenciMap.get(105);

        String[] istenenArray = istenenNoValue.split("-");

        System.out.println("105 numaralı öğrencinin bölümü : " + istenenArray[4]);


    }
}
