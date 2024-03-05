package Deneme;

import java.awt.*;
import java.util.*;
import java.util.List;

public class ArraySorusu {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        /*
        Verilen array'e kullanıcıdan girilen sayı kadar ekleme yapılacak.
        Ekleme tamamlandığında 00 basarak sonlandırılacaktır.
        Fakat sadece çift sayılar eklenecektir.
         */

        int[] arr = {1, 5, 3, 4, 8, 10, 21};

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }
        int sayi;


        while (true) {
            System.out.println("Lütfen sıfır eklemek istediğiniz elemanları ekleyin. Tamamlandığında 0'ı tuşlayın");
            sayi = scanner.nextInt();
            if (sayi == 0) {
                break;
            } else if (sayi % 2 == 0) {
                list.add(sayi);
            }
        }
        int[] yeniArr = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            yeniArr[i] = list.get(i);
        }
        System.out.println(list);
        System.out.println(Arrays.toString(yeniArr));
        arr = yeniArr;
        System.out.println(Arrays.toString(arr));

    }
}
