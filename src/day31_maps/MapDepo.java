package day31_maps;

import java.util.*;

public class MapDepo {

    // Bu class OgrenciMap'i ile kullanabileceğimiz methodları depolamak için oluşturuldu.

    // Map olusturan method

    public static Map<Integer, String> mapOlustur(){
        Map<Integer, String> ogrenciMap = new HashMap<>();
        ogrenciMap.put(101,"Ali-Can-11-H-MF");
        ogrenciMap.put(102,"Veli-Cem-10-K-TM");
        ogrenciMap.put(103,"Ali-Cem-11-K-TM");
        ogrenciMap.put(104,"Ayse-Can-10-H-MF");
        ogrenciMap.put(105,"Sevgi-Cem-11-M-TM");
        ogrenciMap.put(106,"Sevgi-Can-10-K-MF");
        ogrenciMap.put(107,"Esra-Han-11-M-SOZ");

        return ogrenciMap;

    }

    public static String getBolum(Map<Integer,String> ogrenciMap, Integer istenenNo){

        String istenenNoValue = ogrenciMap.get(istenenNo); // Sevgi-Cem-11-M-TM

        String[] istenenValueArr = istenenNoValue.split("-"); // [Sevgi, Cem, 11, M, TM]

        return istenenValueArr[4];
    }

    public static String getSinif(Map<Integer,String> ogrenciMap, int istenenNo){

        String istenenOgrValue = ogrenciMap.get(istenenNo) ; // "Ali-Cem-11-K-TM"

        String[] istenenValueArr = istenenOgrValue.split("-"); // [Ali, Cem, 11, K, TM]

        return istenenValueArr[2]; // 11
    }

    public static String getData(Map<Integer,String> ogrenciMap, int istenenNo, String istenenBilgi){
        // verilen bir ogrenci map'inde
        // istenen numaradaki ogrencinin
        // Isim,Soyisim,Sinif,Sube veya Bolum bilgisini dondursun

        String istenenOgrValue = ogrenciMap.get(istenenNo) ; // "Ali-Cem-11-K-TM"

        String[] istenenValueArr = istenenOgrValue.split("-"); // [Ali, Cem, 11, K, TM]


        switch (istenenBilgi.toUpperCase()){

            case "ISIM" :
                return istenenValueArr[0];

            case "SOYISIM" :
                return istenenValueArr[1];

            case "SINIF" :
                return istenenValueArr[2];

            case "SUBE" :
                return istenenValueArr[3];

            case "BOLUM" :
                return istenenValueArr[4];

            default:
                return "Yanlis bilgi istegi";
        }
    }

    public static void sinifSubeListesiYazdir(Map<Integer, String> ogrenciMap, Integer  sinif, String sube){

        // 1 - Tüm öğrencileri gözden geçirebilmek için önce tüm öğrencileri numaraları elde edelim

        Set<Integer> ogrenciNoSeti = ogrenciMap.keySet();

        // 2 - Bu keyleri kullanarak her bir key için value'leri bize getirecek bir for-each loop oluşturalım

        System.out.println("No Isim   Soyisim");
        System.out.println("=============================");
        for ( Integer eachKey : ogrenciNoSeti) {
            String eachValue = ogrenciMap.get(eachKey); // Ali-Can-11-H-Mf


            String[] valueArr = eachValue.split("-");  // [Ali, Can, 11, H, MF]

            if (valueArr[2].equalsIgnoreCase(sinif +"") && valueArr[3].equalsIgnoreCase(sube)){
                System.out.println(
                        eachKey + " " +
                                valueArr[0] + " " +
                                valueArr[1] );

            }
        }
        System.out.println("=============================");
    }

    public static void isimSoyisimleOgrenciBilgiYazdir(Map<Integer, String> ogrenciMap, String isim, String soyIsim){

        // Tüm keyleri kaydet

        Set<Integer> ogrenciNoSeti = ogrenciMap.keySet();

        System.out.println("No Sinif Sube Bolum");
        System.out.println("=====================");

        for ( Integer eachKey : ogrenciNoSeti){
            String eachValue = ogrenciMap.get(eachKey);

            String[] valueArr = eachValue.split("-");

            if (isim.equalsIgnoreCase(valueArr[0]) && soyIsim.equalsIgnoreCase(valueArr[1])){

                System.out.println(
                                    eachKey + " " +
                                    valueArr[2] + " " +
                                    valueArr[3] + " " +
                                            valueArr[4]
                );
            }
        }
        System.out.println("=====================");



    }

    public static void sinifIleOgrenciBilgiYazdir(Map<Integer , String> ogrenciMap , String sinif) {
        Set<Integer> ogrenciNoSeti = ogrenciMap.keySet();
        System.out.println("No Isim Soyisim Sube");
        System.out.println("=====================");
        for (Integer ogrenciNo : ogrenciNoSeti) {
            String eachValue = ogrenciMap.get(ogrenciNo);

            String[] valueArr = eachValue.split("-");
            // numara isim, soyisim ve subelerini yazdırın
            if (sinif.equalsIgnoreCase(valueArr[2])){
                System.out.println(
                                    ogrenciNo + " " +
                                    valueArr[0] + " " +
                                    valueArr[1] + " " +
                                    valueArr[3]
                );
            }
        }
        System.out.println("=====================");
    }

    public static void soyIsimIleOgrenciListele(Map<Integer , String> ogrenciMap, String soyIsim){

        Set<Integer> ogrenciNoSeti = ogrenciMap.keySet();

        System.out.println("No Isim Sinif Sube Bolum");
        System.out.println("=========================");

        for (Integer ogrenciNo : ogrenciNoSeti){

            String ogrenciValue = ogrenciMap.get(ogrenciNo);

            String[] valueArr = ogrenciValue.split("-");

            if (soyIsim.equalsIgnoreCase(valueArr[1])){

                System.out.println(
                                    ogrenciNo + " " +
                                    valueArr[0] + " " +
                                    valueArr[2] + " " +
                                    valueArr[3] + " " +
                                    valueArr[4]
                );
            }
        }
        System.out.println("=========================");
    }

}



