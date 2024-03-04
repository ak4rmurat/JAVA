package day32_maps;

import day31_maps.MapDepo;

import java.util.Map;

public class C02_SinifSubeListesiOlusturma {

    public static void main(String[] args) {

        // Verilen sınıf ve şubedeki tüm öğrencilerin numara, isim ve soy isimlerini yazdırın.

        Map<Integer, String> ogrenciMap = MapDepo.mapOlustur();
        System.out.println(ogrenciMap);

        // 10K sınıfının öğrencilerini listeleyin

        MapDepo.sinifSubeListesiYazdir(ogrenciMap,11, "M");
    }
}
