package Gun22;

import java.util.ArrayList;

public class _01_ArrayList {
    public static void main(String[] args) {
        // array : boyut sayısının belli olduğu durumlarda ki veriler için kullanılır
        int[] dizi=new int[5]; // Array 5 elemanlı boyutu sonradan değiştirilemiyor

        // ArrayList : boyutu dinamik olarak değişebilen , yani eleman eklendikçe artan
        // , sildikçe azalan Array.

        ArrayList<Integer> integerList=new ArrayList<>(); // tanımlama
        ArrayList<Boolean> booleanList=new ArrayList<>();
        ArrayList<String> stringList=new ArrayList<>();

        // String ArrayList tanımlayalım
        ArrayList<String> isimler=new ArrayList<>();

        // eleman ekleme
        isimler.add("Ahmet"); // uzunluğu 1 oldu
        isimler.add("Ayşe"); // uzunluğu 2 oldu
        isimler.add("Kaya"); // uzunluğu 3 oldu
        isimler.add("Kaya"); // uzunluğu 4 oldu , hep sonuna ekliyor.

        System.out.println("İsimler = " +isimler); // hızlı yazdırma yöntemi
        System.out.println("isimler.size() = " +isimler.size()); // dizilerde ki lenght e karşılık geliyor

        isimler.add(1,"Zeynep"); // araya ekliyor
        System.out.println("araya ekleme sonrası isimler = " +isimler);

        isimler.set(1,"Fatih"); // belli bir indexteki elemanı değiştirme
        System.out.println("belli bir indexteki elemanı değiştirme isimler = " +isimler);

        int elemanSayisi=isimler.size(); // dizideki eleman sayısını verir
        System.out.println("Eleman Sayısı = " +elemanSayisi);

        isimler.remove("Fatih"); // eleman silme
        System.out.println("Fatih silindikten sonra isimler = " +isimler);

        isimler.remove(1); // elemanı indexe göre sime işlemi
        System.out.println("1. index silindikten sonra isimler = " +isimler);

        int indexOfKaya=isimler.indexOf("Kaya"); // kayanın indexini bulma
        System.out.println("indexOfKaya =" +indexOfKaya);

        for (int i=0;i<isimler.size();i++)
            System.out.println("isimler elemanları = " +isimler.get(i)); // her birini yazdırma

        isimler.clear(); // tüm list boşaltıldı. ilk haline geldi





    }
}
