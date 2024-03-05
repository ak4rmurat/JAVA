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

    public static Map<Integer, String> subeDegistir(Map<Integer, String> ogrenciMap, String degisecekSube, String yeniSube) {

        Set<Integer> ogrenciNoSet = ogrenciMap.keySet();

        for (Integer each : ogrenciNoSet ){

            String eachValue = ogrenciMap.get(each);

            String[] valueArr = eachValue.split("-");

            if (valueArr[3].equalsIgnoreCase(degisecekSube)){
                valueArr[3] = yeniSube;
            }

            // 6 - Array'de yaptığımız değişikliği , map'e kaydedebilmek için array'i yeniden String ogrenci
            // value'sunun formatına getir.

            String yeniValue = String.join("-", valueArr);

            // 7 - ogrenciNo ve yeniValue'yi ogrenciMap'e ekleyelim.
            ogrenciMap.put(each, yeniValue);
        }

        return ogrenciMap;
    }
    public static Map<Integer, String> numaraIleSoyisimDegistir(Map<Integer, String> ogrenciMap, int ogrenciNo, String yeniSoyisim) {

        // verilen ogrenciNo'ya ait value'yu kaydedelim

        String ogrenciValue = ogrenciMap.get(ogrenciNo); // Ali-Can-11-H-MF

        // value'deki bilgilere erismek ve update edebilmek icin array'e cevirelim

        String[] ogrenciValueArr = ogrenciValue.split("-"); // [Ali, Can, 11, H, MF]

        // array'de istenen degisikligi yapalim

        ogrenciValueArr[1] = yeniSoyisim;

        // 6- array'de yaptigimiz degisikligi, map'e kaydedebilmek icin
        //    array'i yeniden String ogrenci value'sunun formatina getir

        String yeniValue =  String.join("-",ogrenciValueArr);

        // 7- ogrenciNo ve yeniValue'yu ogrenciMap'e ekleyelim
        ogrenciMap.put(ogrenciNo,yeniValue);

        return ogrenciMap;
    }

    public static Map<Integer, String> isimSoyisimDuzenle(Map<Integer, String> ogrenciMap) {

        // 1- tum key'leri kaydet
        Set<Integer> ogrenciNoSet = ogrenciMap.keySet();

        // 2- tum key'lere ait value'lari gozden gecirmek icin for-each loop olustur

        for (Integer ogrenciNo: ogrenciNoSet
        ) {
            // 3- for-each'in getirdigi no'daki ogrenci value'sunu kaydet
            String ogrenciValue = ogrenciMap.get(ogrenciNo); // Ali-Can-11-H-MF

            // 4- ogrenci value'sundeki bilgilere ulasmak icin array'e cevir
            String[] ogrenciValueArr = ogrenciValue.split("-"); // [Ali, Can, 11, H, MF]

            // 5- parametre olarak gonderilen bilgilerle
            //    array'de istenen update'i yap

            ogrenciValueArr[0] = ogrenciValueArr[0].substring(0,1).toUpperCase()+
                    ogrenciValueArr[0].substring(1).toLowerCase();

            ogrenciValueArr[1] = ogrenciValueArr[1].toUpperCase();
            // 6- array'de yaptigimiz degisikligi, map'e kaydedebilmek icin
            //    array'i yeniden String ogrenci value'sunun formatina getir

            String yeniValue =  String.join("-",ogrenciValueArr);

            // 7- ogrenciNo ve yeniValue'yu ogrenciMap'e ekleyelim
            ogrenciMap.put(ogrenciNo,yeniValue);

        }
        return ogrenciMap;
    }

    public static Map<Integer, String> yilSonuSinifArtirma(Map<Integer, String> ogrenciMap) {

        // 1- tum key'leri kaydet
        Set<Integer> ogrenciNoSet = ogrenciMap.keySet();

        // 2- tum key'lere ait value'lari gozden gecirmek icin for-each loop olustur

        for (Integer ogrenciNo : ogrenciNoSet
        ) {
            // 3- for-each'in getirdigi no'daki ogrenci value'sunu kaydet
            String ogrenciValue = ogrenciMap.get(ogrenciNo); // Ali-Can-11-H-MF

            // 4- ogrenci value'sundeki bilgilere ulasmak icin array'e cevir
            String[] ogrenciValueArr = ogrenciValue.split("-"); // [Ali, Can, 11, H, MF]

            // 5- parametre olarak gonderilen bilgilerle
            //    array'de istenen update'i yap

            switch (ogrenciValueArr[2]) { // sinif bilgisine gore

                case "9":
                    ogrenciValueArr[2] = "10";
                    break;
                case "10":
                    ogrenciValueArr[2] = "11";
                    break;
                case "11":
                    ogrenciValueArr[2] = "12";
                    break;
                case "12":
                    ogrenciValueArr[2] = "Mezun";

            }

            // 6- array'de yaptigimiz degisikligi, map'e kaydedebilmek icin
            //    array'i yeniden String ogrenci value'sunun formatina getir

            String yeniValue = String.join("-", ogrenciValueArr);

            // 7- ogrenciNo ve yeniValue'yu ogrenciMap'e ekleyelim
            ogrenciMap.put(ogrenciNo, yeniValue);

        }

        return ogrenciMap;
    }

    public static Map<Integer, String> topluBolumDegistir(Map<Integer, String> ogrenciMap, String eskiBolum, String yeniBolum) {
        // 1 - Tum entry'lere ulaşmak için entrySet oluşturalım.

        Set<Map.Entry<Integer,String>> ogrenciEntrySeti = ogrenciMap.entrySet();

        // 2 - Tüm entry'leri elden geçirmek için for-each Loop oluşturalım

        for (Map.Entry<Integer,String> eachEntry : ogrenciEntrySeti
            ){
        // 3 - Value'deki bilgilere ulaşabilmek için Array oluşturalım
        String[] valueArr = eachEntry.getValue().split("-");

        // 4 -Array'de istenen update'i yapalım
        if (valueArr[4].equalsIgnoreCase(eskiBolum)){
            valueArr[4] = yeniBolum;
        }
        // 5 - Update edilen array'i entry'nin value'su olarak set edelim.
            eachEntry.setValue(String.join("-", valueArr));

        }

    return ogrenciMap;
    }

    public static Map<Integer, String> setData(Map<Integer, String> ogrenciMap, int ogrenciNo, String degisecekBilgi, String yeniDeger) {

        // 1- ogrenci numarasi verilen ogrencinin value'sunu String olarak kaydedelim
        String ogrenciValue = ogrenciMap.get(ogrenciNo);
        // 2- ogrenci value'sundaki bilgilere ulasabilmek icin array'e split edelim
        String[] ogrenciValueArr = ogrenciValue.split("-");

        switch (degisecekBilgi.toLowerCase()){
            case "isim" :
                ogrenciValueArr[0] = yeniDeger;
                break;
            case "soyisim" :
                ogrenciValueArr[1] = yeniDeger;
                break;
            case "sinif" :
                ogrenciValueArr[2] = yeniDeger;
                break;
            case "sube" :
                ogrenciValueArr[3] = yeniDeger;
                break;
            case "bolum" :
                ogrenciValueArr[4] = yeniDeger;
                break;

        }

        // 3- array'de degisiklik yaptik, array'in yeni halini yeni value olarak kaydedelim
        String yeniValue = String.join("-",ogrenciValueArr);

        // 4- Ogrenci no ve yeni value ile map'i update edelim
        ogrenciMap.put(ogrenciNo,yeniValue);

    return ogrenciMap;
    }
}



