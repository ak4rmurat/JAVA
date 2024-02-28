package day30_listIterator_collections;

import java.util.*;

public class C01_ListIterator {

    public static void main(String[] args) {

        List<Integer> sayilar = new ArrayList<>(Arrays.asList(2, 5, 7 ,8, 1, 3, 4, 7));

        // index kullanmadan listedeki tüm sayıları toplayıp sonra elemanları silelim

        Iterator iterator = sayilar.iterator();
        int toplam = 0;
        while (iterator.hasNext()){
            iterator.next();
            toplam += (Integer)iterator.next();
            iterator.remove();
        }
        System.out.println(toplam);
        /*
        Iterator konusunda dikkat etmemiz gereken en önemli konu ıterator objesinin nerede olduğudur.
        Yukarıda while loop ile iterator'i sona kadar götürdüğümüz için tüm elemanları silme işlemini
        gerçekleştirecektir. Fakat loop dışında art arda ıterator.remove() kullanırsak ilkinde silme
        işlemi yapılacağı için ıteratorda eleman kalmadığından remove() tekrarlandığında EXCEPTİON
        atacaktır.

        Eğer yeniden baştan sonra tüm elementleri elden geçirmek isterseniz yeni bir iterator oluşturmalıyız.
         */

        System.out.println("Sayılar'ın toplamı : " + toplam);

        iterator = sayilar.iterator();

        while (iterator.hasNext()){
            iterator.next();
            iterator.remove();
        }

        System.out.println(sayilar);

        /*
        Iterator sadece 3 method'a sahip  olduğundan istenen işlemleri yapmakta zorlanınca
        Java Iterator'in child interface'i olan ListIterator'ı oluşturmuştur.
         */

        List<Integer> sayilar2 = new ArrayList<>(Arrays.asList(2, 5, 7, 8, 1, 3, 4));
        ListIterator lit = sayilar2.listIterator();
        toplam = 0;

        while (lit.hasNext()){
            toplam += (Integer) lit.next();
        }
        System.out.println("Sayilar2'nin toplamı : " + toplam);

        /*
        ListIterator'da ileri gidebildiğimiz gibi, geri de gidebiliriz.İlk while loop'da sonuna
        kadar gittiğimiz için şimdi sonran başa doğru loop oluşturalım
         */

        while (lit.hasPrevious()){
            lit.previous();
            lit.remove();
        }
        System.out.println(sayilar2);

    }
}
