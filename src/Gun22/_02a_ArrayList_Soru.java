package Gun22;

import java.util.ArrayList;
import java.util.Scanner;

public class _02a_ArrayList_Soru {
    public static void main(String[] args) {

        Scanner oku = new Scanner(System.in);
        Scanner okuInt = new Scanner(System.in);
        ArrayList<Integer> notlar = new ArrayList<>();

        String devamMi = "";
        int toplam = 0;
        do {
            System.out.print("Not = ");
            int ogrNot = okuInt.nextInt();
            notlar.add(ogrNot);
            toplam += ogrNot;

            System.out.print("Devam Etmek İstiyormusunuz E/H = ");
            devamMi = oku.next();
        } while (devamMi.equalsIgnoreCase("E"));

        System.out.println("Notlar = " + notlar); // kontrol için var

        int ort = toplam / notlar.size();
        System.out.println("Ortalama = " + ort);

        gecenSayisiYaz(notlar,ort); // dönen değere gerek olmadan çözüm
        int gecenSayisi=gecenSayisiBul(notlar,ort); // dönen değer olarak çözüm
    }

    public static void gecenSayisiYaz(ArrayList<Integer>diziList, int ort){
        int gecenSayisi = 0;
        for (int i = 0; i < diziList.size(); i++)
            if (diziList.get(i) >= ort)
                gecenSayisi++;
        System.out.println("Dersi Geçen Öğrenci Sayısı = " + gecenSayisi);
    }
    public static int gecenSayisiBul(ArrayList<Integer>diziList, int ort){
        int gecenSayisi = 0;
        for (int i = 0; i < diziList.size(); i++)
            if (diziList.get(i) >= ort)
                gecenSayisi++;
        return gecenSayisi;
    }

}

