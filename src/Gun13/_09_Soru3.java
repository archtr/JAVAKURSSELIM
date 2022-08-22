package Gun13;

import java.util.Scanner;

public class _09_Soru3 {
    public static void main(String[] args) {
        // 3- 20-80 arasında üretilen bir sayının birler basamağını yazı ile yazdırınız.

        double RandomSayi=Math.random();

        int tamSayi=(int)(RandomSayi * (80-20)+1)+20;
        System.out.println("Random Sayı = " +tamSayi);
        int birler=tamSayi%10;

        switch (birler){
            case 1:
                System.out.print("BİR");break;
            case 2:
                System.out.print("İKİ");break;
            case 3:
                System.out.print("ÜÇ");break;
            case 4:
                System.out.print("DÖRT");break;
            case 5:
                System.out.print("BEŞ");break;
            case 6:
                System.out.print("ALTI");break;
            case 7:
                System.out.print("YEDİ");break;
            case 8:
                System.out.print("SEKİZ");break;
            case 9:
                System.out.print("DOKUZ");break;
            case 0:
                System.out.print(" ");break;
            default:
                System.out.println("Hatalı Bir Sayı Girdiniz");break;
        }



    }
}
