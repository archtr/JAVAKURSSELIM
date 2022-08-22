package Gun23;

import java.util.ArrayList;
import java.util.Scanner;

public class _01_Java2DArrayList {
    public static void main(String[] args) {
        /*************************/
        int sayi = 5; // tek bir rakam saklayabilen değişken
        int[] dizi = new int[20]; // 20 adet sayı saklayabilen değişken
        int[][] tablo = new int[20][4]; // 20x4 tane sayı saklayabilen bir değişken.

        ArrayList<Integer> liste = new ArrayList<>(); // istenildiği kadar rakam eklenebilen değişken
        /**************************/

        // 3 öğrencinin mat fiz kim notlarını tek bir yerde birleştireceğiz
        ArrayList<ArrayList<Integer>> notlarListesi = new ArrayList<>(); //Listelerin listesi
        // bunun her bir elemanı ArrayList.

        ArrayList<Integer> matNotlar = new ArrayList<>();
        matNotlar.add(60);
        matNotlar.add(70);
        matNotlar.add(80);
        matNotlar.add(90);

        ArrayList<Integer> fizNotlar = new ArrayList<>();
        fizNotlar.add(65);
        fizNotlar.add(75);
        fizNotlar.add(85);

        ArrayList<Integer> kimNotlar = new ArrayList<>();
        kimNotlar.add(85);
        kimNotlar.add(95);
        kimNotlar.add(55);

        notlarListesi.add(matNotlar);
        notlarListesi.add(fizNotlar);
        notlarListesi.add(kimNotlar);

        notlarListesi.get(0); // her bir elemanı bir liste
        notlarListesi.get(0).get(0); // 0. listenin 0. elemanını verir.

        System.out.println("Notlar Listesi = " + notlarListesi.get(0)); // 0. listeyi yazdırır
        System.out.println("Notlar Listesi = " + notlarListesi.get(1)); // 1. listeyi yazdırır
        System.out.println("Notlar Listesi = " + notlarListesi.get(2)); // 2. listeyi yazdırır

        // yukarıdakilerin yerine bu döngü
        for (int i = 0; i < notlarListesi.size(); i++)
            System.out.println("Notlar Listesi = " + notlarListesi.get(i));

        ArrayList<String> dersler = new ArrayList<>();
        dersler.add("Matematik");
        dersler.add("Fizik");
        dersler.add("Kimya");

        // tüm notlar tek tek nasıl yazdırılır.
        for (int i = 0; i < notlarListesi.size(); i++) { // liste uzunluğu
            System.out.println(dersler.get(i)); // ders isimlerini yazdık
            for (int j = 0; j < notlarListesi.get(i).size(); j++)  // her bir listedeki notların miktarı
                System.out.println((i + 1) + ".Ders " + (j + 1) + ".not = " + notlarListesi.get(i).get(j));
            // System.out.println("Notlar = " +notlarListesi.get(i).get(j));
        }

        // Soru1: Kullanıcıdan alınan ders nosuna göre ekrana notların listesini bir fonksiyonda yazdırınız

        Scanner oku = new Scanner(System.in);
        System.out.print("Ders No (0-Mat , 1-Fiz , 2-Kim) : ");
        int dersNo = oku.nextInt();

        dersNotlariYazdir(notlarListesi,dersNo,dersler);
        dersortYazdir(notlarListesi,dersNo,dersler);
        dersortYazdir(notlarListesi,dersNo,dersler);
        dersortYazdir(notlarListesi,dersNo,dersler);
        // Soru 2 : Yukarıda girilen derse ait ortalamayı main de yazdırınız
        int ort=dersOrtalamaBul(notlarListesi,dersNo);
        System.out.println("0rtalama = " +ort);

        // soru3 : tüm derslerin not ortalamasını yani tüm notların ortalamasını (double) bir fonksiyonda buşdurup mainde yazıdırınız
        // soru4 : en büyük ve en küçük notu bir main içinde bulunuz (fonksiyon yok)
        // soru5 : // kendini genç hissedenlere günü sorusu
        //        // `"aaabbccccdeeeff" seklinde verilen bir stringi yine string olarak "3a2b4c1d3e2f"
        //        //  seklinde yazdiran methodu yapiniz. parametre string
    }
    public static void dersNotlariYazdir(ArrayList < ArrayList < Integer > > notlarListesi ,int dersNo, ArrayList<
            String > dersler){

        System.out.println(dersler.get(dersNo)); // dersin adı yazıldı

        for (int i = 0; i < notlarListesi.get(dersNo).size(); i++){
            System.out.println(notlarListesi.get(dersNo).get(i));
        }
    }
    public static void dersortYazdir(ArrayList < ArrayList < Integer > > notlarListesi ,int dersNo, ArrayList<
            String > dersler){

        int toplam=0;

        for (int i = 0; i < notlarListesi.get(dersNo).size(); i++){
            toplam=toplam+notlarListesi.get(dersNo).get(i);
        }
        System.out.println("Ders Ortalaması = " +toplam/notlarListesi.get(dersNo).size());
    }
    public static int dersOrtalamaBul(ArrayList<ArrayList<Integer>> notlarListesi, int dersNo){
        int toplam=0;

        for (int i = 0; i < notlarListesi.get(dersNo).size(); i++){
            toplam=toplam+notlarListesi.get(dersNo).get(i);
        }

        return toplam/notlarListesi.get(dersNo).size();
    }
}
