package Gun11;

import java.util.Scanner;

public class _07_IfElse {
    public static void main(String[] args) {
        // Girilen yeni bir password un kurallara uygunluğunu kontrol ediniz.
        // kurallar :
        // 1) en az 8 karakter olmalı
        // 2) içinde pass kelimesi olmamalı
        // 3) en fazla 12 karakter olmalı.

        Scanner oku = new Scanner(System.in);
        System.out.print("Bir Şifre Giriniz = ");
        String sifre = oku.nextLine();

        if (sifre.length()>=8 && sifre.length()<13 && !sifre.contains("pass")){
            System.out.println("Uygun Şifre");
        }
        else {
            System.out.println("Şifreniz Uygun Değildir");
        }



    }
}
