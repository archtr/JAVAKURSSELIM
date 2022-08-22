package Gun14;

import java.util.Scanner;

public class _08_Soru1 {
    public static void main(String[] args) {
        // 1- Girilen bir sayıya kadar olan sayıların çarpım sonucnu bulunuz.

        Scanner oku = new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz = ");
        int sayigirilen = oku.nextInt();

        int sayac = 1;
        int carpım = 1;


        while (sayac <= sayigirilen) {
            carpım =carpım*sayac;

            sayac++;

        }
        System.out.println("Girilen Sayıya Kadar Olan Sayıların Çarpımı =" + carpım);


    }
}
