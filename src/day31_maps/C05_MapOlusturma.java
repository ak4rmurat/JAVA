package day31_maps;

import java.util.HashMap;
import java.util.Map;

public class C05_MapOlusturma {

    public static void main(String[] args) {

        // 1 - Biz öğrenci bilgilerini tutan bir map oluşturacağız
        // 2 - Map No, İsim, Soyisim, Sınıf, Şube ve Bölüm bilgilerini tutacak
        // Bu bilgilerden no, Map'in key'i olacak
        // Kalan isim, soyisim, sinif, sube, ve bölüm bilgilerini bir String
        // olark bileştirip value yapacağız.
        // Birleştirirken "isim-soyisim-sinif-sube-bolum" şeklinde birleştireceğiz

        Map<Integer, String> ogrenciMap = new HashMap<>(); // Integer ve String yerine object yazmak
        // İleride işlerimizi zorlaştıracağı için tercih edilmemekte. Daha sonradan anlatılacak

        ogrenciMap.put(101,"Ali-Can-11-H-MF");
        ogrenciMap.put(102,"Veli-Cem-10-K-TM");
        ogrenciMap.put(103,"Ali-Cem-11-K-TM");
        ogrenciMap.put(104,"Ayse-Can-10-H-MF");
        ogrenciMap.put(105,"Sevgi-Cem-11-M-TM");
        ogrenciMap.put(106,"Sevgi-Can-10-K-MF");
        ogrenciMap.put(107,"Esra-Han-11-M-SOZ");

        System.out.println(ogrenciMap);
        /*
            {
        101=Ali-Can-11-H-MF,
        102=Veli-Cem-10-K-TM,
        103=Ali-Cem-11-K-TM,
        104=Ayse-Can-10-H-MF,
        105=Sevgi-Cem-11-M-TM,
        106=Sevgi-Can-10-K-MF,
        107=Esra-Han-11-M-SOZ
            }
         */

        // ogrenci map'indeki key'leri yazdırınç

        System.out.println(ogrenciMap.keySet()); // [101, 102, 103, 104, 105, 106, 107]

        // 103 numaralı öğrencinin value'sini yazdırın

        System.out.println(ogrenciMap.get(103)); // Ali-Cem-11-K-TM

        // key olmadan, sadece value'leri bir liste olarak yazdırın.

        System.out.println(ogrenciMap.values());

        //[Ali-Can-11-H-MF, Veli-Cem-10-K-TM, Ali-Cem-11-K-TM,
        // Ayse-Can-10-H-MF, Sevgi-Cem-11-M-TM, Sevgi-Can-10-K-MF, Esra-Han-11-M-SOZ]

        // map'te 105 numaralı öğrenci var mı ?

        System.out.println(ogrenciMap.containsKey(105)); // true

        // map'te ismi Ali olan bir öğrenci var mı ?
        // containsValue() value'deki isim, sınıf gibi detayları arayamaz.
        // value olarak kaydedilen butunu arayabilir.

        System.out.println(ogrenciMap.containsValue("Ali")); // false
        System.out.println(ogrenciMap.containsValue("Ali-Can-11-H-MF")); // true

        // 104 numaralı öğrencisinin soyismini yazdırın  104=Ayse-Can-10-H-MF,
        // MAp'de value'yi birden fazla bilgini birleşimi olan bir String olarak kullandık.
        // Map'de amaç kolay erişim değil daha fazla bilgi tutmaktır.
        // Tutulan bilgilere ulaşmak, developer'ların işidir.(kodu yazan kişilerin)

        String tumValue104 = ogrenciMap.get(104); // Ayse-Can-10-H-MF
        String[] value104Array = tumValue104.split("-");
        System.out.println("104 numaralı öğrenci isim : " + value104Array[0]);
        System.out.println("104 numaralı öğrenci soyisim : " + value104Array[1]);
        System.out.println("104 numaralı öğrenci sinif : " + value104Array[2]);
        System.out.println("104 numaralı öğrenci sube : " + value104Array[3]);
        System.out.println("104 numaralı öğrenci bolum : " + value104Array[4]);




    }
}
