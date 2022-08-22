package Gun20;

import java.util.Scanner;

public class _06_JavaMethod {
    public static void main(String[] args) {
        // Kullanıcıya aşağıdaki gibi bir menü çıkartarak sürekli değişkenleri alınız ve
        // her bir menü elemanını değer alan fonksiyon olarak yazınız.
        /*  1-toplama
            2-çıkarma
            3-çarpma
            4-bolme
            5-Faktöryel
            6-Çıkış
        Bir işlem seçiniz */

        Scanner oku = new Scanner(System.in);

        int secim = 0;
        do {
            menuYaz();
            secim = oku.nextInt();
            if (secim < 6 && secim > 0)
                islemiYap(secim);

        } while (secim < 6 && secim > 0);

    }

    public static void menuYaz() {
        System.out.print("1-Toplama\n" +
                "2-Çıkarma\n" +
                "3-Çarpma\n" +
                "4-Bölme\n" +
                "5-Faktöryel\n" +
                "6-Çıkış\nSeçiminiz = ");
    }

    public static void islemiYap(int secim) {
        Scanner oku = new Scanner(System.in);
        int sayi1 = 0;
        int sayi2 = 0;

        if (secim < 5) {
            // 2 sayı al
            System.out.print("1. Sayı = ");
            sayi1 = oku.nextInt();
            System.out.print("2. Sayı = ");
            sayi2 = oku.nextInt();
        } else {
            // 1 sayı al
            System.out.print("Sayı = ");
            sayi1 = oku.nextInt();
        }
        switch (secim) {
            case 1:
                toplamYaz(sayi1, sayi2);
                break;
            case 2:
                cıkartmaYaz(sayi1, sayi2);
                break;
            case 3:
                carpmaYaz(sayi1, sayi2);
                break;
            case 4:
                bolmeYaz(sayi1, sayi2);
                break;
            case 5:
                faktoriyelYaz(sayi1);
                break;
        }
    }

    public static void toplamYaz(int sayi1, int sayi2) {
        System.out.println(sayi1 + sayi2);
    }

    public static void cıkartmaYaz(int sayi1, int sayi2) {
        System.out.println(sayi1 - sayi2);
    }

    public static void carpmaYaz(int sayi1, int sayi2) {
        System.out.println(sayi1 * sayi2);
    }

    public static void bolmeYaz(int sayi1, int sayi2) {
        System.out.println(sayi1 / sayi2);
    }

    public static void faktoriyelYaz(int sayi1) {
        int carpim = 1;
        for (int i = 1; i <= sayi1; i++)
            carpim = carpim * i;
        System.out.println("Çarpım = " + carpim);
    }

}
