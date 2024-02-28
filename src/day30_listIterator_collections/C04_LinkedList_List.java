package day30_listIterator_collections;

import java.util.LinkedList;
import java.util.List;

public class C04_LinkedList_List {
    public static void main(String[] args) {

        List<Integer> sayilar = new LinkedList<>(); // Burada data türü List Constructor ise LinkedList'tir.

        System.out.println(sayilar.hashCode()); // 1
        sayilar.add(20);
        sayilar.add(10);

        System.out.println(sayilar.hashCode()); // 1291


        // HashCode() eklenen değerlere göre değiştirilir.Buna sırasıda dahildir.Yani biz önce 20'i sonra
        // 10'u eklersek bu durumda hashCode()'da değişecektir.








    }
}
