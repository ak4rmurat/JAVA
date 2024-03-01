package day31_maps;

import java.util.Arrays;
import java.util.HashSet;

public class C03_HashSet {

    public static void main(String[] args) {

        int[] arr = {2, 4, 5, 6, 7, 5, 3, 2, 3, 4, 6, 8, 9, 1, 2, 3};

        /*
            Verilen array'deki tekrar eden sayıları silip her sayının sadece 1 kere
            bulunduğu bir array yapın.
         */

        HashSet<Integer> tekrarsizSet = new HashSet<>();

        for ( int each : arr) {
            tekrarsizSet.add(each);
        }

        // Array'deki elementleri unique olarak bulunduğu bir set elde ettik
        // Array'i bu hale döndürmeliyiz

        arr = new int[tekrarsizSet.size()];

        // set'deki herbir elemanı alıp array'e atayalım
        // set index desteklemez, array mutlaka index ister

        int index = 0;

        for (int each : tekrarsizSet){
            arr[index] = each;
            index++;
        }

        System.out.println("Array'in son hali : " + Arrays.toString(arr));

    }
}
