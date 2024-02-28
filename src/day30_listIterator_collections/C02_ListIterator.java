package day30_listIterator_collections;

import java.util.*;

public class C02_ListIterator {

    public static void main(String[] args) {

        // Verilen listedeki tüm elementleri index kullanmadan 2 artırın

        List<Integer> sayilar = new ArrayList<>(Arrays.asList(2, 5, 7 ,8, 1, 3, 4));

        ListIterator lit = sayilar.listIterator();

        while (lit.hasNext()){
            lit.set((Integer)lit.next()+2);
        }
        System.out.println(sayilar);

        //Listeke var olan her element'ten sonra element'in 1 fazlası değere sahip yeni bir element ekleyin
        // [4, 5, 7 ,8 ,9, 10, 10, 11, 3, 4, 5, 6, 6, 7]

        ListIterator lit2 = sayilar.listIterator();

        lit2.next();
        lit2.next();
        lit2.next();
        Integer sayi = (Integer)lit2.next();
        System.out.println(sayi);

        while (lit2.hasNext()){
            lit2.add((Integer)lit2.next()+1);

        }
        System.out.println(sayilar);
    }
}
