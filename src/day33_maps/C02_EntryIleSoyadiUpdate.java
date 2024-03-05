package day33_maps;

import day31_maps.MapDepo;

import java.util.Map;
import java.util.Set;

public class C02_EntryIleSoyadiUpdate {

    public static void main(String[] args) {

        // ogrenci map'indeki soyisimleri
        // tumu buyuk harf olacak sekilde duzenleyin

        Map<Integer,String> ogrenciMap = MapDepo.mapOlustur();

        // 1. entry'leri bir set olarak kaydedelim

        Set<Map.Entry<Integer,String>> ogrenciEntrySeti = ogrenciMap.entrySet();

        // 2. tum entry'lere ulasmak icin bir for-each loop olusturalim

        for(Map.Entry<Integer, String > eachEntry  : ogrenciEntrySeti ){

            // 3 - Value'i direk bir array olarak kaydedelim.
            String[] eachValueArr = eachEntry.getValue().split("-"); // Ali,Can,11,H,MF

            // 4 - istediğimiz update'i yapalım.
            eachValueArr[1] = eachValueArr[1].toUpperCase();

            // 5 - Array'i value olacak şekilşde String'e dönüştürelim
            eachEntry.setValue(String.join("-",eachValueArr));
        }
        System.out.println(ogrenciMap);


    }
}