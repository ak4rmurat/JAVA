package day32_maps;

import day31_maps.MapDepo;

import java.util.Map;

public class C05_SoyisimIleOgrenciListesi {

    public static void main(String[] args) {

        Map<Integer, String> ogrenciMap = MapDepo.mapOlustur();

        MapDepo.soyIsimIleOgrenciListele(ogrenciMap, "Can");
    }
}
