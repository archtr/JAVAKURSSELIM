package Gun14;

import java.util.Scanner;

public class _01_Switch {
    public static void main(String[] args) {
        // Girilen bir ay numarasına göre , ayın kaç gün olduğunu sayı ile yazdırınız.

        Scanner oku = new Scanner(System.in);
        System.out.print("Bir Ay Numarası Giriniz =");
        int sayi = oku.nextInt();

        switch (sayi){
            case 1:
                System.out.println("Ayın İsmi = Ocak , Gün Sayısı = 31");break;
            case 2:
                System.out.println("Ayın İsmi = Şubat , Gün Sayısı = 28 veya 29");break;
            case 3:
                System.out.println("Ayın İsmi = Mart , Gün Sayısı = 31");break;
            case 4:
                System.out.println("Ayın İsmi = Nisan , Gün Sayısı = 30");break;
            case 5:
                System.out.println("Ayın İsmi = Mayıs , Gün Sayısı = 31");break;
            case 6:
                System.out.println("Ayın İsmi = Haziran , Gün Sayısı = 30");break;
            case 7:
                System.out.println("Ayın İsmi = Temmuz , Gün Sayısı = 31");break;
            case 8:
                System.out.println("Ayın İsmi = Ağustos , Gün Sayısı = 31");break;
            case 9:
                System.out.println("Ayın İsmi = Eylül , Gün Sayısı = 30");break;
            case (10):
                System.out.println("Ayın İsmi = Ekim , Gün Sayısı = 31");break;
            case (11):
                System.out.println("Ayın İsmi = Kasım , Gün Sayısı = 30");break;
            case (12):
                System.out.println("Ayın İsmi = Aralık , Gün Sayısı = 31");break;
            default:
                System.out.println("Hatalı Bir Ay Numarası Girdiniz");break;
        }


    }
}
