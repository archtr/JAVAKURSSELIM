package Gun10;

import java.util.Scanner;

public class _06_JavaIf {
    public static void main(String[] args) {
        // Girilen 3 sayıdan en büyük olanı yazdırınız.

        Scanner oku = new Scanner(System.in);

        System.out.print("Birinci Sayıyı Giriniz =");
        int sayi1 = oku.nextInt();

        System.out.print("İkinci Sayıyı Giriniz =");
        int sayi2 = oku.nextInt();

        System.out.print("Üçüncü Sayıyı Giriniz =");
        int sayi3 = oku.nextInt();

        int enb=sayi1;

        if (sayi2>enb) {
            enb=sayi2;
        }
        if (sayi3 > enb) {
            enb=sayi3;
        }
        System.out.println("En Büyük Sayı = " +enb);

    }
}
