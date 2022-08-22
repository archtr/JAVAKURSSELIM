package Gun15;

import java.util.Scanner;

public class _15_Soru6 {
    public static void main(String[] args) {
        // 6-Kullanıcnın gireceği bir sayının basamaklarına göre tersi olan sayıyı bulunuzç

        Scanner oku = new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz = ");
        int sayi = oku.nextInt();
        int tersi=0;
        while (sayi > 0) {
            int basamak=sayi%10;
            tersi = tersi*10+basamak;
            sayi = sayi/10;
        }
        System.out.println("tersi = " +tersi);


    }
}
