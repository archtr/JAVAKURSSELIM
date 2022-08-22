package Gun13;

import java.util.Scanner;

public class _02_IfElseIf {
    public static void main(String[] args) {
        // Girilen 2 tam sayıyı kullanıcıdan aldıktan sonra,
        // Toplama için T, Çıkarma için Ç, çarpma için P, bölme için B
        // harflerini alarak isteğe uygun olan işlemi yaptırıp
        // sonucu yazdırınız.

        Scanner oku=new Scanner(System.in);
        System.out.print("1. Sayıyı Giriniz =");
        int sayi1=oku.nextInt();

        System.out.print("2. Sayıyı Giriniz =");
        int sayi2=oku.nextInt();

        System.out.print("T , C , P , B Harflerinden Birini Giriniz = ");
        String harf=oku.next();

        if (harf.equalsIgnoreCase("T"))
            System.out.println("Sonuç = " + sayi1+sayi2);
        else
            if (harf.equalsIgnoreCase("C"))
                System.out.println("Sonuç = " + (sayi1-sayi2));
            else
                if (harf.equalsIgnoreCase("P"))
                    System.out.println("Sonuç = " + sayi1*sayi2);
                else
                    if (harf.equalsIgnoreCase("B"))
                        System.out.println("Sonuç = " + sayi1/sayi2);



    }
}
