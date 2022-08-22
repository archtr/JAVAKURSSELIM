package Odevler;

import java.util.Scanner;

public class _3 {
    public static void main(String[] args) {

        Scanner oku=new Scanner(System.in);
        System.out.print("bir sifre giriniz:");
        String sifre= oku.next();

        if(sifre.length()<8) {
            System.out.println("sifreniz kabul edildi");
        }
        if (sifre.length()>8){
            System.out.println("sifreniz kabul edilmedi");
        }
    }
}
