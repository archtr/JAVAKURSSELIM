package Gun14;

import java.util.Scanner;

public class _09_Soru2 {
    public static void main(String[] args) {
        // 2-  0-100 arasındaki sayılardan teklerin ayrı çiftleri ayrı toplamını bulunuz.

        Scanner oku = new Scanner(System.in);

        int sayac = 1;
        int tektoplam = 0;
        int cifttoplam=0;

        while (sayac <= 100) {

            if (sayac % 2 == 1)
                tektoplam = tektoplam + sayac;
            else
                cifttoplam=cifttoplam+sayac;
            sayac++;
        }
        System.out.println("100'e Kadar Olan Tek Sayıların Toplamı =" + tektoplam);
        System.out.println("100'e Kadar Olan Çift Sayıların Toplamı =" +cifttoplam);





    }
}
