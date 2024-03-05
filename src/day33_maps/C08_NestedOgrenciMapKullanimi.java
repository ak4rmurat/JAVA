package day33_maps;

import day31_maps.MapDepo;

import java.util.Map;

public class C08_NestedOgrenciMapKullanimi {

    public static void main(String[] args) {

        Map<Integer, Map<String,String>> nesOgrMap = NestedOkulMapDepo.nesOgrMapOlustur();

        System.out.println(nesOgrMap);
        //{101={sinif=11, sube=H, soyisim=Can, bolum=MF, isim=Ali},
        // 102={sinif=11, sube=K, soyisim=Cem, bolum=TM, isim=Ali},
        // 103={sinif=10, sube=H, soyisim=Can, bolum=MF, isim=Ayse}}

        // 103 numaralı öğrencinin soyismini yazdırın

        System.out.println(nesOgrMap.get(103).get("soyisim")); // Can

    }
}
