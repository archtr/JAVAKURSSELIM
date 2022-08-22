package Gun18;

import java.util.Arrays;

public class _04_JavaArrayMetodlar {
    public static void main(String[] args) {
        // Arrays.toString(dizi) -> diziyi string olarak direk yazdırır.

        String[] isimler={"ahmet","melike","sümeyra","mert","inanç"};
        System.out.println("İsimler = " + Arrays.toString(isimler));

        // Arrays.sort(isimler) -> diziyi sıralar
        Arrays.sort(isimler);
        System.out.println("isimler = " +Arrays.toString(isimler)); // yukarıda öğrendiğimizi yazdırıyoruz

        // Diziler eşit mi ? Arrays.equals(dizi1.dizi2)
        int[] a={1,8,3,54};
        int[] b={1,8,3,54};
        int[] c={1,8,2,54};
        System.out.println("a==b ? "+Arrays.equals(a,b));
        System.out.println("a==c ? " +Arrays.equals(a,c));

        Arrays.sort(c);
        System.out.println("c= " +Arrays.toString(c));

        // Arrays.fill -> bütün kutucuklara 7 atar ;
        Arrays.fill(c,7);
        System.out.println("c= " +Arrays.toString(c));

        // Arrays.binarySearch(rakamlar,5) -> sıralı dizide aranan elemanın indexini verir
        // aranan eleman birden fazlaysa herhangi birini verir.
        // esas amacı var mı yok mu kontrolü , var ise indexini verir , yoksa negatif sayı döndürür.
        int[] rakamlar={2,7,4,6,23,5,6};
        System.out.println("Rakamlar = " +Arrays.binarySearch(rakamlar,5));
        Arrays.sort(rakamlar);
        System.out.println("Rakamlar = " +Arrays.binarySearch(rakamlar,5));






    }
}
