package day25_inheritanceDataTypeKullanimi_overriding;

import day23_encapsulation_inheritance.C06_Child;

public class C09_Ozet extends C06_Child {
     /*
        java'da data type kullanimini su sekilde de siniflandirabiliriz

        1- Data turu ve constructor ayni ise

           objenin ozellikleri ister VARIABLE, isterse METHOD olsun
           objenin olusturuldugu class'dan aramaya baslanir
           parent'lara dogru devam edilir
           ILK BULUNAN deger kullanilir.

           Deger bulunamazsa CTE olur

        2- Data turu ve Constructor farkli oldugunda
           ozelligin VARIABLE veya METHOD olmasi farkli isleyis gerektirir

           - Eger VARIABLE ise
             data turunun oldugu class'dan aramaya baslayip, parent'lara dogru devam ederiz
             ve ILK BULUNAN degeri kullaniriz
             variable'i bulamazsak CTE olur

           - Eger Method ise
             data turunun oldugu class'dan aramaya baslayip, parent'lara dogru devam ederiz
             eger bulamazsak CTE olur

             method'u BULUNCA hemen kullanmayiz,
             Constructor'in oldugu class'a kadar
             daha guncel hali (Overriding Method) var mi diye bakilir
             EN GUNCEL deger kullanilir
     */

    public static void main(String[] args) {

        C09_Ozet obj = new C09_Ozet();
        System.out.println(obj.soyIsim);

    }

}
