package Gun15;

import java.util.Scanner;

public class _01_Break {
    public static void main(String[] args) {
        // Girilen bir sayının , 2 aynı sayının çarpımına eşit olup olmadığını bulunuz.
        // 16=4x4 , 9=3x3 , 6 böyle bir sayı değildir.


        Scanner oku=new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz = ");
        int sayi=oku.nextInt();

        int sayac=0;
        int aranansayi=0;

        while (sayac<=sayi) {
            if (sayi==sayac*sayac){
                aranansayi=sayac;
                break;
            }
             sayac++;

        }
        if (aranansayi>0)
            System.out.println("Tam Karedir , sayı = " +aranansayi);
        else
            System.out.println("Bu Sayı Tam kare değildir. ");






    }
}
