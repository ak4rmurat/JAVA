package day30_listIterator_collections;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;

public class C06_LinkedList_Deque {
    public static void main(String[] args) {

        // Deque ==> Double Ended Queue ==> iki uçlu kuyruk

        Deque<Integer> sayilar = new LinkedList<>();
        System.out.println(sayilar.add(10)); // true
        sayilar.add(20);
        sayilar.add(60);
        sayilar.add(50);

        System.out.println(sayilar); // [10, 20, 60, 50]

        // Deque double ended queue olduğundan hemen hemen bütün method'ların
        // ...first() ve ...last() versiyonları bulunur

        sayilar.addFirst(70);
        sayilar.addLast(90); // [70, 10, 20, 60, 50, 90]
        System.out.println(sayilar);

        sayilar.addFirst(20);
        sayilar.addLast(90); // [20, 70, 10, 20, 60, 50, 90, 90]
        System.out.println(sayilar);

        System.out.println(sayilar.removeFirstOccurrence(20)); // true
        System.out.println(sayilar); // [70, 10, 20, 60, 50, 90, 90]

        HashMap<String, String> map = new HashMap<>();




    }

}
