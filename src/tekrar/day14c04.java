package tekrar;

import Deneme.Array;

import java.util.Arrays;

public class day14c04 {
    public static void main(String[] args) {
        // Soru 2- Verilen 2 katli ve 2 inner array'e sahip bir array’de
        //         ayni index’e sahip elementleri toplayip,
        //         yeni olusturacagimiz tek katli bir array’e bu toplamlari atayin.
        //		input :      int[][] arr =  {{3,4,5}, {2,3,6,7}};
        //	    output:                       [5, 7, 11]


        int[][] arr =  {{4,3,5,5,7}, {2,3,6,7},{1,2},{1,4,5,7},{2,7,8,4}, {1, 1, 1}};



        int minLength = arr[0].length;
        for (int i = 1; i < arr.length; i++) {
            if (minLength > arr[i].length){
                minLength = arr[i].length;
            }
        }
        int[] yeniArr = new int[minLength];

        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < minLength; j++) {
                yeniArr[j] += arr[i][j];
            }   
        }
        System.out.println(Arrays.toString(yeniArr));

    }
}
