package MethodOrnekleri;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class MethodCallReturn8 {

    /*
        Bir array'de tekrar eden sayıları bulup array olarak döndüren method yazın.Kaç adet tekrar olduğunuda yazsın.
     */

    public static void main(String[] args) {

        int[] arr = {1, 32, 5, 7, 1, 1, 1, 5, 7, 2, 2, 7, 32};
        System.out.println(arrTekrarSayisi(arr));
    }
    public static List<Integer> arrTekrarSayisi(int[] arr) {
        List<Integer> yeniArr = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    if (!yeniArr.contains(arr[i])) {
                        yeniArr.add(arr[i]);
                    }
                }
            }
        }
        for (int i = 0; i <yeniArr.size() ; i++) {
            int sayac = 0;
            int deger = 0;
            for (int j = 0; j <arr.length ; j++) {
                if (yeniArr.get(i).equals(arr[j])){
                    sayac++;
                }
                deger = yeniArr.get(i);
            }
            System.out.println(deger + " sayısından " + sayac + " kere kullanılmıştır.");
        }
        return yeniArr;
    }
}