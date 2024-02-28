package day30_listIterator_collections;

import java.util.LinkedList;
import java.util.Queue;

public class C05_LinkedList_Queue {

    public static void main(String[] args) {

        /*
            Queue (Kuyruk) FIFO (First in firts out)

            Yeni gelenler standart olarak sona eklenir. Çıkacaklar ise baş kısımdan çıkarılır.
         */

        Queue<Integer> sayilar = new LinkedList<>();
        Queue<Integer> sayilar2 = new LinkedList<>();

        sayilar.add(20);
        sayilar.add(30);
        sayilar.add(10);
        sayilar.add(50);
        System.out.println(sayilar); // Yeni gelen sona eklenir.

        // Kuyruk yapısından dolayı araya ekleme yoktur. Yani add() method'u index olarak çalışmaz.

        sayilar.remove(); // [30, 10, 50] Silinecekler baştan silinir.
        // Bize index yazma hakkı tanımıyor. Kuyruk yapıcı gereği baştaki elemanı siliyor.

        System.out.println(sayilar);

        sayilar.poll();
        System.out.println(sayilar);
        System.out.println(sayilar.poll()); // silinecek elemanı yazdırır yani 10
        sayilar.poll();
        System.out.println(sayilar); // []

         //sayilar.remove(); // NoSuchElementException hatası verir çünkü silinecek eleman yok

        sayilar.poll();
        System.out.println(sayilar.poll()); // null yazdırır.

        /*
            remove() ve poll() aynı işlemlere sahiptir. Fakat remove() boş bir list'te kullanılmak istediğinde
            exception fırlatırken poll() ise null olarak değeri döndürür ve exception fırlatmaz
         */

        sayilar.add(20);
        sayilar.add(30);
        sayilar.add(10);
        sayilar.add(50);

        sayilar.offer(25);
        System.out.println(sayilar); // [20, 30, 10, 50, 25]

        // Listede bir kapasite sınırlaması yoksa verilen elementi listeye ekler

        System.out.println(sayilar.peek()); // 20
        System.out.println(sayilar2.peek()); // null

        // Listenin başındaki elementi silmeden bize getirir. Eğer liste boş ise null döndürür.

        System.out.println(sayilar.element()); // 20
        // System.out.println(sayilar2.element()); // NoSuchElementException

        // listenin basindaki elementi, silmeden bize getirir
        // eger liste bos ise NoSuchElementException verir





    }
}
