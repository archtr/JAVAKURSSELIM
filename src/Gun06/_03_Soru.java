package Gun06;

import java.util.Scanner;

public class _03_Soru {
    public static void main(String[] args) {
        // Girilen bir stringin sadece son harfini yazdırınız.
        // Merhaba  -> lenght: 7
        // yani Lenght -1 i  bana son harfin index ini verir.

        Scanner oku=new Scanner(System.in);
        System.out.print("Bir string deger giriniz=");
        String girilen= oku.nextLine();

        int uzunluk=girilen.length();
        char sonHarf=girilen.charAt(uzunluk-1);  // Toplam karakter sayısı okundu.
        // Fakat charAt İndexe göre çalıştığından 1 eksiği alındı.

        System.out.println("sonHarf = " + sonHarf);








    }
}
