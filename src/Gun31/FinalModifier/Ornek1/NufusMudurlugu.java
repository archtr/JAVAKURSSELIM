package Gun31.FinalModifier.Ornek1;

public class NufusMudurlugu {
    public static void main(String[] args) {
        // Vatandas isimli bir Class tanımlayınız (fields: isim, tcNo)
        // tcNo değerini int olarak alınız ve nesne oluşturulurken
        // sıralı olarak atayınız.Daha sonradan değeri değiştirilemesin.
        // kontrol için mainde 2 kişi tanımlayınız.

        Vatandas v1=new Vatandas("İsmet");
        System.out.println("v1 = " +v1);
        Vatandas v2=new Vatandas("Nazmiye");
        System.out.println("v2 = " +v2);
        Vatandas v3=new Vatandas("Mehmet");
        System.out.println("v3 = " +v3);

        // v1.tcNo=5; atanamıyor
        // final değişkenlerine sadece 1 kez veri atanabilir
        // o da ya tanımlanırken yada constructor da

        final double pi=3.14;




    }
}
