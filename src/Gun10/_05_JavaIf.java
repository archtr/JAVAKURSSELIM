package Gun10;

import java.util.Scanner;

public class _05_JavaIf {
    public static void main(String[] args) {
        // Girilen bir sayının birler basamağını yazı ile yazdırınız.

        Scanner oku = new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz = ");
        int sayi = oku.nextInt();

        int birlerBasamagı = sayi % 10;

        System.out.println("Girilen Sayının Birler Basamağı = " + birlerBasamagı);

        if (birlerBasamagı == 0) {
            System.out.println("Yazı ile = SIFIR");
        }
        if (birlerBasamagı == 1) {
            System.out.println("Yazı ile = BİR");
        }
        if (birlerBasamagı == 2) {
            System.out.println("Yazı ile = İKİ");
        }
        if (birlerBasamagı == 3) {
            System.out.println("Yazı ile = ÜÇ");
        }
        if (birlerBasamagı == 4) {
            System.out.println("Yazı ile = DÖRT");
        }
        if (birlerBasamagı == 5) {
            System.out.println("Yazı ile = BEŞ");
        }
        if (birlerBasamagı == 6) {
            System.out.println("Yazı ile = ALTI");
        }
        if (birlerBasamagı == 7) {
            System.out.println("Yazı ile = YEDİ");
        }
        if (birlerBasamagı == 8) {
            System.out.println("Yazı ile = SEKİZ");
        }
        if (birlerBasamagı == 9) {
            System.out.println("Yazı ile = DOKUZ");
        }


    }
}
