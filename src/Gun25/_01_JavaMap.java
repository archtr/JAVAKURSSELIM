package Gun25;

import apple.laf.JRSUIConstants;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class _01_JavaMap {
    public static void main(String[] args) {
        // Sets -> HashSet , LinkedHashSet , TreeSet
        // Maps -> HashMap , LinkedHashMap , TreeMap

        // Map ailesinden HashMap
        HashMap<Integer,Integer> m=new HashMap<>(); // Key i ve Value si INTEGER olan bir Map
        m.put(2,11); // 2 Key ine 11 atandı
        m.put(3,12);
        m.put(6,15);
        m.put(2,5); // 2 anahtarında ki değeri güncelledi
        System.out.println("m = " +m); // m = {2=5, 3=12, 6=15} key value
        System.out.println("m = " +m.get(2)); // 2 anahtarında ki değer
        System.out.println("m = " +m.keySet()); // anahtarları verdi
        System.out.println("m = " +m.values()); // değerleri verdi

        for (Integer k : m.keySet()
             ) {
            System.out.println("k = " +k);
        }
        for (Integer v : m.values()
             ) {
            System.out.println("v = " +v);
        }

        for (Map.Entry<Integer,Integer> anahtarValue : m.entrySet()
             ) {
            System.out.println("anahtarValue.getKey() = " +anahtarValue.getKey());
            System.out.println("anahtarValue.getValue() = " +anahtarValue.getValue());
        }



    }
}
