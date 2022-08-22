package Gun24;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class _03_HashSet {
    public static void main(String[] args) {
        HashSet<String > renkler=new HashSet<>();
        renkler.add("Red");
        renkler.add("Green");
        renkler.add("Blue");
        renkler.add("Red");// bu çıkmaz eklenmedi
        renkler.add("RED");// bu eklendi

        // Ekrana yazdırma 1. yöntem
        System.out.println("renkler = "+renkler);

        // Ekrana tek tek yazdırma 2. yöntem
        for (String eleman : renkler
             ) { // renklerin içindeki elemanları herhangi bir sırayla eleman ismini vererek gönderiyor
            System.out.println("renkler = "+eleman);
        }

        // ben bunları kendi içinde sıralı olanların sırasına göre nasıl yazdırabilirim.TreeSet ve LinkedSet
        TreeSet<String > ths=new TreeSet<>();
        ths.add("bir");
        ths.add("iki");
        ths.add("üç");
        ths.add("dört");
        ths.add("beş");
        System.out.println("ths = " +ths);
        for (String s:ths // sırayı garanti etmiyor
             ) {
            System.out.println("s = " +s);
        }
        Iterator gosterge=ths.iterator(); // indexin yaptığını yapıyor
        while (gosterge.hasNext()){ // setlerde kendi içindeki sırasına göre elemanlara ulaşmak için.
            System.out.println("gosterge = " +gosterge.next()); // sıradaki elemanı gösteriyor
        }




    }
}
