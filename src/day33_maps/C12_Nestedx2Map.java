package day33_maps;

import java.util.HashMap;
import java.util.Map;

public class C12_Nestedx2Map {
    public static void main(String[] args) {

        Map<Integer, Map<String, Map<String,String>>> nesOgrMap = new HashMap<>();

        Map<String,String> nestedSon = new HashMap<>();

        nestedSon.put("Sac Rengi","Kirmizi");

        Map<String, Map<String,String>> nestenSonDanOnce = new HashMap<>();

        nestenSonDanOnce.put("Fiziksel Ozellikler", nestedSon);

        nesOgrMap.put(100,nestenSonDanOnce);

        System.out.println(nesOgrMap);

        System.out.println(nesOgrMap.get(100).get("Fiziksel Ozellikler").get("Sac Rengi")); // kirmizi
    }
}
