package Gun14;

import java.util.Scanner;

public class _04_WhileLoop {
    public static void main(String[] args) {
        // Girilen bir sayıya kadar olan sayıların toplamını bularak yazdırınız
        // girilen sayı dahil.

        Scanner oku = new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz = ");
        int sayigirilen=oku.nextInt();


        int sayac=1;
        int toplam=0;


        while (sayac<=sayigirilen){

            toplam = toplam+sayac;

            sayac++;

        }
        System.out.println("Girilen Sayıya Kadar Olan Sayıların Toplamı =" +toplam );





    }
}
