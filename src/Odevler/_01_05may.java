package Odevler;

import java.util.Scanner;

public class _01_05may {
    public static void main(String[] args) {

        Scanner oku=new Scanner(System.in);
        System.out.print("Bir Cümle Giriniz = ");
        String cumle=oku.nextLine();

        int sonBosluk=cumle.lastIndexOf(" ");

        System.out.println("Son Kelime = " + cumle.substring(sonBosluk));






    }
}
