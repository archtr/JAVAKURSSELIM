package Gun24;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class _02_Sets {
    public static void main(String[] args) {
        // SETS : Hashset (hızlı),
        // LinledHashset(eklenme sırasına göre sıralı),
        // TreeSet(ordered-herzaman sıralı)

        // Hızlı çalışmak için kendi özel algoritma sırasına göre saklar
        HashSet<String> hs=new HashSet<>();
        hs.add("bir");
        hs.add("iki");
        hs.add("üç");
        hs.add("dört");
        hs.add("beş");
        System.out.println("hs = " +hs);

        // Eklenme sırasına göre elemanları tutuyor
        LinkedHashSet<String > lhs=new LinkedHashSet<>();
        lhs.add("bir");
        lhs.add("iki");
        lhs.add("üç");
        lhs.add("dört");
        lhs.add("beş");
        System.out.println("lhs = " +lhs);

        // Alfabetik olarak sıralı tutar
        TreeSet<String > ths=new TreeSet<>();
        ths.add("bir");
        ths.add("iki");
        ths.add("üç");
        ths.add("dört");
        ths.add("beş");
        System.out.println("ths = " +ths);
        // Sayısal değere göre sıralı tutar
        TreeSet<Integer > ths1=new TreeSet<>();
        ths1.add(5);
        ths1.add(89);
        ths1.add(3);
        ths1.add(17);
        ths1.add(1);
        System.out.println("ths1 = " +ths1);





    }
}
