package day31_maps;

import java.util.Map;

public class C07_SinifBilgisi {

    // 103 numaralı öğrencinin sınıf bilgisini yazdırın

    public static <Map> void main(String[] args) {


        java.util.Map<Integer,String> ogrenciMap = MapDepo.mapOlustur();

        System.out.println(MapDepo.getSinif(ogrenciMap, 103)); // 11


        System.out.println(MapDepo.getData(ogrenciMap, 107, "Sube"));  // M

        System.out.println(MapDepo.getData(ogrenciMap, 104, "isim")); // Ayse
    }
}
