package Gun15;

import java.util.Scanner;

public class _13_Soru4 {
    public static void main(String[] args) {
        // 4- Kullanıcın gireceği bir sayının kaç basamak olduğunu bulunuz

        Scanner oku = new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz = ");
        int sayi = oku.nextInt();

        int i = 0;
        while (sayi > 10) {
            sayi = sayi / 10;
            i++;
        }
        System.out.println("Basamak Sayısı = " + (i+1));
    }
}
