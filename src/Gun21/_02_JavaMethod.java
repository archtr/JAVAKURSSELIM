package Gun21;

import java.util.Scanner;

public class _02_JavaMethod {
    public static void main(String[] args) {
        // Kullanıcının gireceği 2 sayıdan büyük olanını bulma işlemini bir metodda
        // yaptıktan sonra main de yazdırınız

        Scanner oku = new Scanner(System.in);
        System.out.print("1. Sayıyı Giriniz = ");
        int sayi1 = oku.nextInt();
        System.out.print("2. Sayıyı Giriniz = ");
        int sayi2 = oku.nextInt();

        int enb = enbBul(sayi1, sayi2);
        System.out.println("En Büyük Sayı = " + enb);

        // _01_JavaMethod.enbBul(sayi1,sayi2); aynı paketin içinden fonksiyon çağırma
        // Gun20._06_JavaMethod.faktoriyelYaz(sayi1); diğer paketten çağırma
    }

    public static int enbBul(int s1, int s2) {
        int enb = s1;
        if (s2 > s1)
            enb = s2;
        return enb;
    }
    public static int sayiOku(){   /// ekstra olarak yapıldı
        Scanner oku = new Scanner(System.in);
        System.out.print("Sayı Giriniz = ");
        return oku.nextInt();
    }

}
