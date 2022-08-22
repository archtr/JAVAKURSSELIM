package Gun40.Ornek4;

import Gun32._03_Ornek.Pizza;
import Gun32._03_Ornek.PizzaSize;

import java.util.ArrayList;
import java.util.Scanner;

public class TechnoCafe {
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);
        ArrayList<Food> siparis = new ArrayList<>();

        int secim = 0;
        do {
            menu();
            secim = oku.nextInt();

            switch (secim) {
                case 1: AdanaKebap adanaKebap = new AdanaKebap();
                    siparis.add(adanaKebap);break;
                case 2: Lahmacun lm = new Lahmacun();
                    siparis.add(lm);break;
                case 3: Borsh bs = new Borsh();
                    siparis.add(bs);break;
                case 4: Palov pl = new Palov();
                    siparis.add(pl);break;
                case 5: siparisYaz(siparis);break;
                case 6: System.out.println("Bizi Tercih Ettiğiniz için Teşekkür Ederiz");
            }

        } while (secim <= 5);
        System.out.println();

    }
    public static void menu() {
        System.out.println("***** Menu *****");
        System.out.println("1-Adana Kebap");
        System.out.println("2-Lahmacun");
        System.out.println("3-Borsh");
        System.out.println("4-Palov");
        System.out.println("5-Tamam , Siparişim Bitti");
        System.out.print("Seçim Yapınız = ");
    }
    public static void siparisYaz(ArrayList<Food> siparis) {
        int AdanaKebapCnt = 0;
        int LahmacunCnt = 0;
        int BorshCnt = 0;
        int PalovCnt = 0;
        for (Food f : siparis
        );

    }
}
