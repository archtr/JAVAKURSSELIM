package Gun08;

import java.util.Scanner;

public class _01_Soru {
    public static void main(String[] args) {
        // Ayrı ayrı girilen ad ve soyadları aralarında bir boşluk koyarak birleştiriniz.

        Scanner oku=new Scanner(System.in);

        System.out.print("Bir Ad Giriniz = ");
        String GirilenAd=oku.nextLine();

        System.out.print("Bir Soyad Giriniz = ");
        String GirilenSoyad=oku.nextLine();

        String AdSoyad=GirilenAd.concat(" ").concat(GirilenSoyad) ;

        System.out.println("AdSoyad = " + AdSoyad);


    }
}
