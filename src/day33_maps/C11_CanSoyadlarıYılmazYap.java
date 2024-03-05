package day33_maps;

import day31_maps.MapDepo;

import java.util.Map;
import java.util.Set;

public class C11_CanSoyadlarıYılmazYap {

    public static void main(String[] args) {

        Map<Integer, String > ogrenciMap = MapDepo.mapOlustur();

        Set<Integer> ogrenciKeySet = ogrenciMap.keySet();

        for (Integer eachSet : ogrenciKeySet){
            String value = ogrenciMap.get(eachSet);
            String[] valueArr = value.split("-");

            if (valueArr[1].equals("Can")){
                valueArr[1] = "Yilmaz";
            }

            String yeniValue = String.join("-",valueArr);
            ogrenciMap.put(eachSet,yeniValue);
        }

        System.out.println(ogrenciMap);
    }
}
