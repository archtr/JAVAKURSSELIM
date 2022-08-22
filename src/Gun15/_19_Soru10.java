package Gun15;

import java.util.Scanner;

public class _19_Soru10 {
    public static void main(String[] args) {
        // 10-Kullanıcından 10 sayı isteyiniz, eğer sonra girilen
        // önce girilenden büyük ise döngü sonlansın.

        Scanner oku = new Scanner(System.in);

        int girilensayi=1000000000;

        for (int i=0;i<10;i++){
            System.out.print("Bir Sayı Giriniz = ");

            int sayi=oku.nextInt();
            if (girilensayi<sayi) break;
            girilensayi=sayi;
        }



    }
}
