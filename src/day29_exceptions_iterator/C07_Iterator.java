package day29_exceptions_iterator;

import java.util.Arrays;

public class C07_Iterator {

    public static void main(String[] args) {
        /*
        Java index kullanmanın mümkün olmadığı durumlarda veya kullanmak istemediğimizde
        tüm elemanları

         */

        int[] arr = {3, 5, 6};

        // Array'in tüm elementlerini 2 artırın

        for (int i = 0; i < arr.length; i++) {
            arr[i] += 2;
        }
        System.out.println(Arrays.toString(arr));

        // INDEX kullanmadan bu işlemi yapın

        for(int each : arr){
            each += 2;
        }

        System.out.println(Arrays.toString(arr));

    }
}
