package Gun32._03_Ornek;

import java.util.ArrayList;
import java.util.Scanner;

public class PizzaSiparisHatti {
    public static void main(String[] args) {
        // Bir pizza sipariş hattı yapılmak isteniyor.
        // Kullanıcıya Pizza için 1-Small,2-Medium,3-Large, 4-Goster
        // seçeneklerini bir menü şeklinde vererek, verdiği pizzaları
        // bir ARRAYLIST e atınız.
        // Goster (4) ü seçtiğinde her pizzadan kaçar tane sipariş
        // verdiğini bir metodda yazdırınız.

        Scanner oku = new Scanner(System.in);
        ArrayList<Pizza> siparis = new ArrayList<>();

        int secim = 0;
        do {
            menu();
            secim = oku.nextInt();

            switch (secim) {
                case 1: Pizza ps = new Pizza(PizzaSize.Small);
                    siparis.add(ps);break;
                case 2: Pizza pm = new Pizza(PizzaSize.Medium);
                    siparis.add(pm);break;
                case 3: Pizza pl = new Pizza(PizzaSize.Large);
                    siparis.add(pl);break;
                case 4: siparisYaz(siparis);break;
                case 5: System.out.println("Bizi Tercih Ettiğiniz için Teşekkür Ederiz");
            }

        } while (secim <= 4);
        System.out.println();

    }

    public static void menu() {
        System.out.println("***** Pızza Menu *****");
        System.out.println("1-SMALL");
        System.out.println("2-MEDIUM");
        System.out.println("3-LARGE");
        System.out.println("4-İŞLEME AL");
        System.out.println("5-ÇIKIŞ");
        System.out.print("Seçim Yapınız = ");
    }

    public static void siparisYaz(ArrayList<Pizza> siparis) {
        int smallCnt = 0;
        int mediumCnt = 0;
        int largeCnt = 0;
        for (Pizza p : siparis
        ) {
            if (p.size == PizzaSize.Small) smallCnt++;
            if (p.size == PizzaSize.Medium) mediumCnt++;
            if (p.size == PizzaSize.Large) largeCnt++;
        }
        System.out.println();
        System.out.println("Small Pizza = " + smallCnt);
        System.out.println("Medium Pizza = " + mediumCnt);
        System.out.println("Large Pizza = " + largeCnt);
        System.out.println("Siparişiniz Alınmıştır ");
        System.out.println();
    }

}
