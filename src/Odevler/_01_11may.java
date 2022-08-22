package Odevler;

import java.util.Scanner;

public class _01_11may {
    public static void main(String[] args) {
        // 6- Kullanıcının bir yeni şifre girmesini isteyiniz, şifrenin uzunluğu 8 den küçük ise, şifreniz kabul edilmedi yazsın.


        Scanner oku = new Scanner(System.in);
        System.out.print("Birinci Kelimeyi Giriniz =");
        String sifre=oku.nextLine();
        int uzunluk=sifre.length();

        if (uzunluk<8){
            System.out.println("Girdiğiniz Şifre Kabul Edilmedi");
        }


    }
}
