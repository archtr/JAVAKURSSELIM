package Gun07;

import java.util.Scanner;

public class _12_Soru {
    public static void main(String[] args) {
        // 10. soru : girilen 3 kelimelik ismi A.Y.T. şeklinde yazdırınız.

        Scanner oku=new Scanner(System.in);
        System.out.println("3 Kelimelik İsim Giriniz = ");
        String adAdSoyad = oku.nextLine();

        // Ahmet Yılmaz Temiz
        // A-> 0 , Y-> 1. Boşluk+1 , T-> lastIndex bosluk+1

        char İlkHarf= adAdSoyad.charAt(0);
        char İkinciHarf= adAdSoyad.charAt(adAdSoyad.indexOf(" ") +1 );
        char UcuncuHarf= adAdSoyad.charAt(adAdSoyad.lastIndexOf(" ") + 1 );

        System.out.println("Kısa Hali = " +İlkHarf+"." +İkinciHarf+"." +UcuncuHarf+".");



    }
}
