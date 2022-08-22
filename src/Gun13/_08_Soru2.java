package Gun13;

import java.util.Scanner;

public class _08_Soru2 {
    public static void main(String[] args) {
        // 2- Girilen 3 basamaklı bir sayıyı yazı ile yazdırınız.

        Scanner oku = new Scanner(System.in);
        System.out.print("3 Basamaklı Bir Sayı Giriniz =");
        int sayi = oku.nextInt();

        int birler=sayi%10;
        int onlar=(sayi/10)%10;
        int yuzler=(sayi/100);

        switch (yuzler){
            case 1:
                System.out.print("YÜZ ");break;
            case 2:
                System.out.print("İKİ YÜZ ");break;
            case 3:
                System.out.print("ÜÇ YÜZ ");break;
            case 4:
                System.out.print("DÖRT YÜZ ");break;
            case 5:
                System.out.print("BEŞ YÜZ ");break;
            case 6:
                System.out.print("ALTI YÜZ ");break;
            case 7:
                System.out.print("YEDİ YÜZ ");break;
            case 8:
                System.out.print("SEKİZ YÜZ ");break;
            case 9:
                System.out.print("DOKUZ YÜZ ");break;
            case (10):
                System.out.print(" ");break;
            default:
                System.out.print("Hatalı Bir Sayı Girdiniz");break;
        }

        switch (onlar){
            case 1:
                System.out.print("ON ");break;
            case 2:
                System.out.print("YİRMİ ");break;
            case 3:
                System.out.print("OTUZ ");break;
            case 4:
                System.out.print("KIRK ");break;
            case 5:
                System.out.print("ELLİ ");break;
            case 6:
                System.out.print("ALTMIŞ ");break;
            case 7:
                System.out.print("YETMİŞ ");break;
            case 8:
                System.out.print("SEKSEN ");break;
            case 9:
                System.out.print("DOKSAN ");break;
            case 0:
                System.out.print(" ");break;
            default:
                System.out.println("Hatalı Bir Sayı Girdiniz");break;
        }

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
