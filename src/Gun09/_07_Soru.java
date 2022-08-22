package Gun09;

import java.util.Scanner;

public class _07_Soru {
    public static void main(String[] args) {
        // Girilen bir sayının tek sayı olup olmadığını yazdırınız.

        Scanner oku=new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz = ");
        int sayi=oku.nextInt();

        System.out.println("Sayı Tek mi ? = " + (sayi%2==1));




    }
}
