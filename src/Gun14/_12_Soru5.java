package Gun14;

import java.util.Scanner;

public class _12_Soru5 {
    public static void main(String[] args) {
        // 5- Sayı bulmaca oyununu tam hali ile cözünüz.

        Scanner oku=new Scanner(System.in);
        int tutulansayi=(int) Math.random()*10;
        int tahmin=0;
        int tahminsayisi=0;

        do {
            System.out.print("Sayı Giriniz = ");
            tahmin=oku.nextInt();

            if (tahmin<tutulansayi){
                System.out.println("Büyük Sayı Giriniz.");
            }
            if (tahmin>tutulansayi){
                System.out.println("Küçük Sayı Giriniz.");
            }
            if (tahmin==tutulansayi){
                System.out.println("Tebrikler");break;
            }
            if (tahminsayisi==10){
                System.out.println("Tahmin etme Hakkınız Doldu");break;
            }
            tahminsayisi++;

        }while (tutulansayi!=tahmin);




    }
}
