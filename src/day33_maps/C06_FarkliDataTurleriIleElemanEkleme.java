package day33_maps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C06_FarkliDataTurleriIleElemanEkleme {

    public static void main(String[] args) {

        List<Object> liste = new ArrayList<>();

        liste.add("Ali");
        liste.add(24);
        liste.add(true);
        liste.add('a');
        int[] arr = {4,5,6,7};

        liste.add(arr);

        // listeyi yazdıralım
        System.out.println(liste); // [Ali, 24, true, a, [I@7c30a502]

        //Listedeki array'i tek basına yazdırabiliriz
        System.out.println(Arrays.toString((int[]) liste.get(4)));// [4, 5, 6, 7]

        //Listedeki arr'nin uzunluğunu yazdırın
        System.out.println(((int[]) liste.get(4)).length); // 4

        // Listedeki Ali'yi büyük harf olarak yazdırın
        System.out.println(((String) liste.get(0)).toUpperCase()); // ALİ

        // Listedeki 24'ün karesini yazdırın
        System.out.println((Integer)liste.get(1)*(Integer)liste.get(1)); // 576



    }
}
