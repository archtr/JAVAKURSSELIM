package Gun12;

import java.util.Scanner;

public class _02_IfElse {
    public static void main(String[] args) {
        // Girilen bir sayının pozitif , negatif veya sıfır olduğunu yazdırınız.

        Scanner oku = new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz = ");
        int sayi = oku.nextInt();

        if (sayi > 0) {
            System.out.println("Pozitif");
        } else // yukarıdaki şart sağlanmazsa kaç ihtimal geriye kalıyor.

            if (sayi < 0) {
                System.out.println("Negatif");
            } else {
                System.out.println("Sıfır");
            }


    }
}
