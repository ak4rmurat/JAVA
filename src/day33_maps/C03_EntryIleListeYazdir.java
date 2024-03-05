package day33_maps;

import day31_maps.MapDepo;

import java.util.Arrays;
import java.util.Map;
import java.util.Set;

public class C03_EntryIleListeYazdir {

    public static void main(String[] args) {

        // Ogrenci map'inde istenen sinifdaki ogrencilerin (10. sınıf)
        // no, sinif, sube, isim ve soyisimlerini liste olarak yazdirin

        Map<Integer,String> ogrenciMap = MapDepo.mapOlustur();

        // 1 - tüm öğrencilere ulaşabilmek için entry set oluşturalım

        Set<Map.Entry<Integer, String>> ogrenciEntrySeti = ogrenciMap.entrySet();

        // 2 - Her bir entry'i ele almak için for-each loop oluştur

        System.out.println("No  Sinif Sube Isim Soyisim");
        for (Map.Entry<Integer, String> eachEntry : ogrenciEntrySeti
            ){
            // 3 - Value'daki bilgilere ulaşabilmek için array'e split edelim.
            String[] valueArr = eachEntry.getValue().split("-");

            // 4 - Listede istenenleri yazdırabiliriz.
            if (valueArr[2].equals("10")) {
                System.out.println(
                        eachEntry.getKey() + "  " +
                                valueArr[2] + "    " +
                                valueArr[3] + "   " +
                                valueArr[0] + "    " +
                                valueArr[1]
                );
            }

        }


    }
}
