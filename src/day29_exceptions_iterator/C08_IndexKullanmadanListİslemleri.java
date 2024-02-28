package day29_exceptions_iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class C08_IndexKullanmadanListİslemleri {
    public static void main(String[] args) {

        List<Integer> sayilar = new ArrayList<>(Arrays.asList(2, 3, 5, 6, 7, 8));

        System.out.println(sayilar);

        // Index kullanmadan, sayılar listesindeki çift sayıları silin.

        Iterator itr = sayilar.iterator();


        while (itr.hasNext()) {
            Integer sayi = (Integer) itr.next();
            if (sayi % 2 == 0) {
                itr.remove();
            }
        }
        System.out.println(sayilar);
        List<Integer> numbers = Arrays.asList(1, 2, 3);
        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            Integer number = iterator.next();
            if (number == 2) {
                iterator.remove(); // UnsupportedOperationException hatası alınacak
            }
        }
    }
}
