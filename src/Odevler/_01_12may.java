package Odevler;

import java.util.Scanner;

public class _01_12may {
    public static void main(String[] args) {
        // 3- Girilen bir keliede bosluk veya A harfinin olup olmadığını kontrol ediniz.

        Scanner oku=new Scanner(System.in);

        System.out.print("Bir Kelime Giriniz = ");
        String kelime=oku.nextLine();

        boolean varMiA=kelime.contains("A");
        boolean varMiBosluk=kelime.contains(" ");

        if (varMiA==true || varMiBosluk==true){
            System.out.println("Girdiğiniz Kelimede A veya Boşluk VARDIR");
        }
        else {
            System.out.println("Girdiğiniz Kelimede A veya Boşluk YOKTUR");
        }



    }
}
