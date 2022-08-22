package Gun31.FinalModifier.Ornek2;

import java.util.Scanner;

public class Ornek {
    public static void main(String[] args) {
        // Sabitler isimli bir Class da sabit bir şekilde
        // bir gündeki saat sayısı, bir saatdaki dakika sayısı ve
        // bir dakikadaki saniye sayısını tanımlayınız.
        // mainde kullanıcıdan gün , saat, dakika ve saniyeyi alarak toplam
        // saniyeyi bulunuz.


        int gun=0;
        int saat=0;
        int dakika=0;
        Scanner oku=new Scanner(System.in);
        System.out.print("Gün giriniz = "); gun= oku.nextInt();
        System.out.print("Saat giriniz = "); saat= oku.nextInt();
        System.out.print("Dakika giriniz = "); dakika= oku.nextInt();

        // 1. yöntem
        int toplamSaniye=
                gun*Sabitler.saatSayisi*Sabitler.dakikaSayisi*Sabitler.saniyeSayisi+
                        saat*Sabitler.dakikaSayisi*Sabitler.saniyeSayisi+
                        dakika*Sabitler.saniyeSayisi;

        System.out.println("Toplam Saniye = " +toplamSaniye);

        // 2. yöntem
        System.out.println("Toplam Saniye = " +Sabitler.hesapla(gun,saat,dakika));




    }
}
