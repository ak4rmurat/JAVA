package day14_arrays_arrayLists;

import java.util.Arrays;

public class C06_ArrayeElemanEkleme {

    public static void main(String[] args) {

        // Array'ler ekleme-silme yapamadigimiz icin bizi cok kisitliyor.

        int[] arr = {3,5,8};

        // arr'ye 4.eleman olarak 20 ekleyin

        // arr[3] = 20; // ArrayIndexOutOfBoundsException

        int[] yeniArr = {1,2,3,4,7};

        arr = yeniArr;

        System.out.println(Arrays.toString(arr)); // [3, 5, 8, 20]

        // bu array'den 5'i silin ve array'i 3 elemanli hale getirin

        int[] yeniArr2 = {5,6,7,8,9,11};

        System.out.println(Arrays.toString(arrayeElemanEkleme(yeniArr, yeniArr2)));

    /*
    1 2 3 4 arr 4
    5 6 7 8 arr 4

    yeniArr
     */
    }

    public static int[] arrayeElemanEkleme(int[] arr,int[] eklenecekArr){
        int[] yeniArr = new int[arr.length+eklenecekArr.length];
        for (int i = 0; i < arr.length; i++) {
            yeniArr[i] = arr[i];
        }
        for (int i = arr.length; i < yeniArr.length ; i++) {
            yeniArr[i] = eklenecekArr[i + eklenecekArr.length - yeniArr.length];
        }
        arr = yeniArr;
        return arr;
    }
}
