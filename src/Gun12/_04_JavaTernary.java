package Gun12;

import java.util.Scanner;

public class _04_JavaTernary {
    public static void main(String[] args) {
        // Kullanıcının gireceği sayı çift ise bir stringe "çift" atayınız,
        // tek ise "tek" atayınız ve ekrana stringi yazdırınız.

        Scanner oku=new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz = ");
        int sayi=oku.nextInt();

        // klasik yöntem

        if (sayi%2==1)
            System.out.println("tek");
        else
            System.out.println("çift");

        // tek satırda yazma yöntemi : Ternary
        String sonuc=(sayi%2==1) ? "tek" : "çift" ;
        // şart doğru ise ilk bölüm değilse ikinci bölüm çalışır.
        System.out.println((sayi%2==1) ? "tek" : "çift");


    }
}
