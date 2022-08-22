package Gun15;

import java.util.Scanner;

public class _14_Soru5 {
    public static void main(String[] args) {
        // 5- Kullanıcın girdiği bir sayının ilk ve son basamaklarının eşit olup olmadığınız bulunuz

        Scanner oku = new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz = ");
        int sayi = oku.nextInt();

        int i=0;
        int sonbasamak = sayi % 10;

        System.out.println("Son Basamak = " + sonbasamak);

        while (sayi >= 10) {
            sayi = sayi / 10;
            i++;
        }
        System.out.println("İlk Basamak = " +sayi);

        if (sayi==sonbasamak)
            System.out.println("Girilen Sayının İlk ve Son Basamakları Eşittir");
        else
            System.out.println("Girilen Sayının İlk ve Son Basamakları Eşit Değildir");

    }
}
