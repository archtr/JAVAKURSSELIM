package Gun14;

import java.util.Scanner;

public class _05_WhileLoop {
    public static void main(String[] args) {
        // Girilen bir sayıya kadar olan sayıların sadece tek olanlarının toplamını bulunuz.

        Scanner oku = new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz = ");
        int sayigirilen = oku.nextInt();

        int sayac = 1;
        int toplam = 0;

        while (sayac <= sayigirilen) {

            if (sayac % 2 == 1)
                toplam = toplam + sayac; // toplanacak sayıları sayaç belirliyor

            sayac++;

        }
        System.out.println("Girilen Sayıya Kadar Olan Tek Sayıların Toplamı =" + toplam);


        // 2. yöntem

        while (sayac <= sayigirilen) {
            toplam = toplam + sayac; // toplanacak sayıları sayaç belirliyor
            sayac = sayac + 2;

        }
        System.out.println("Girilen Sayıya Kadar Olan Tek Sayıların Toplamı =" + toplam);


    }
}
