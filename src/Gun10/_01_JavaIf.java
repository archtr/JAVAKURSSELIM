package Gun10;

import java.util.Scanner;

public class _01_JavaIf {
    public static void main(String[] args) {
        // Baklava Dilimi = if
        // Girilen bir sayının 10 dan büyük ise ekrana 10 dan büyük diye yazdırınız.
        // Algoritma
        // 1- Basla
        // 2- Sayı Oku
        // 3- Sayı > 10 ise 10 dan Büyük yaz
        // 4- Dur

        Scanner oku=new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz = ");
        int sayi=oku.nextInt();

        if (sayi>10) { // evet çıkışı
            System.out.println("10'dan Büyük ");
        }



    }
}
