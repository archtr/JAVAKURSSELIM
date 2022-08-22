package Gun13;

import java.util.Scanner;

public class _06_Switch {
    public static void main(String[] args) {
        // Girilen bir sayının onlar basamağının değerini yazı ile yazdırınız.

        Scanner oku = new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz =");
        int sayi = oku.nextInt();

        int onlar=(sayi/10)%10;

        switch (onlar){
            case 1:
                System.out.println("Onlar Basamağı = BİR");break;
            case 2:
                System.out.println("Onlar Basamağı = İKİ");break;
            case 3:
                System.out.println("Onlar Basamağı = ÜÇ");break;
            case 4:
                System.out.println("Onlar Basamağı = DÖRT");break;
            case 5:
                System.out.println("Onlar Basamağı = BEŞ");break;
            case 6:
                System.out.println("Onlar Basamağı = ALTI");break;
            case 7:
                System.out.println("Onlar Basamağı = YEDİ");break;
            case 8:
                System.out.println("Onlar Basamağı = SEKİZ");break;
            case 9:
                System.out.println("Onlar Basamağı = DOKUZ");break;
            case 0:
                System.out.println("Onlar Basamağı = SIFIR");break;
            default:
                System.out.println("HATALI SAYI GİRDİNİZ");break;
        }



    }
}
