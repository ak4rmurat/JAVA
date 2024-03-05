package day33_maps;

import day31_maps.MapDepo;

import java.util.Map;

public class C05_NoIleBilgiGuncelleme {

    public static void main(String[] args) {

        // Ogrenci map'inde numarası verilen öğrencinin istenen bilgisini güncelleyin

        Map<Integer,String> ogrenciMap = MapDepo.mapOlustur();

        ogrenciMap = MapDepo.setData(ogrenciMap, 103, "degisecekBilgi" ,"yeniDeger");
    }
}
