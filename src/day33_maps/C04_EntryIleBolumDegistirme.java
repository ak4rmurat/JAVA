package day33_maps;

import day31_maps.MapDepo;

import java.util.Map;

public class C04_EntryIleBolumDegistirme {

    // Verilen bölümdeki tüm öğrencilerin bölüm bilgisini yeni verilen bölüm ile update edin.

    public static void main(String[] args) {

        Map<Integer, String > ogrenciMap = MapDepo.mapOlustur();

        ogrenciMap = MapDepo.topluBolumDegistir(ogrenciMap, "MF", "SAY");

        ogrenciMap = MapDepo.topluBolumDegistir(ogrenciMap, "TM", "EA");

        System.out.println(ogrenciMap);
    }
}
