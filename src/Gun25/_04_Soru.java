package Gun25;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class _04_Soru {
    public static void main(String[] args) {
        // Canlı Sözlük yapılmak isteniyor.
        // Kullanıcıya aşağıdaki gibi bir menü çıkarınız
        // 1-Ekleme ( bu seçenekte kelimenin kendisi ve manasını bir cümle ile yazınız)
        // 2-Düzeltme ( bu seçenekte kullanıcının kelimenin manasını düzelttiriniz.)
        // 3-Listeleme
        // 4-Arama ( bu seçenekte verilen bir kelimeyle başlayan tüm kelimelerin manaları)
        // 5-Çıkış

        Map<String,String > sozluk=new TreeMap<>();

        Scanner okuInt= new Scanner(System.in);
        Scanner oku= new Scanner(System.in);
        String kelime = "";
        String anlami = "";
        int secim=0;
        do{
            System.out.println("***** Menu *****");
            System.out.println("1-Ekleme");
            System.out.println("2-Düzeltme");
            System.out.println("3-Listeleme");
            System.out.println("4-Arama");
            System.out.println("5-Silme");
            System.out.println("6-Çıkış");
            secim = okuInt.nextInt();

            switch (secim){
                case 1:
                    System.out.print("Kelimeyi Giriniz = ");
                    kelime = oku.nextLine();
                    System.out.print("Anlamını Giriniz = ");
                    anlami = oku.nextLine();
                    sozluk.put(kelime,anlami);
                    break;
                case 2:
                    System.out.print("Düzeltilecek Kelimeyi Giriniz = ");
                    kelime = oku.nextLine();
                    System.out.print("Anlamını Giriniz = ");
                    anlami = oku.nextLine();
                    sozluk.put(kelime,anlami);
                    break;
                case 3:
                    System.out.println("Sözlük = " +sozluk);
                    break;
                case 4:// arama
                    break;
                case 5:// silme
                    break;
            }




        }while (secim<6);


    }
}
