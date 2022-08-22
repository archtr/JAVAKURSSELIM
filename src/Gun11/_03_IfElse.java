package Gun11;

import com.sun.java.swing.plaf.windows.WindowsInternalFrameTitlePane;

import java.util.Scanner;

public class _03_IfElse {
    public static void main(String[] args) {
        // Girilen bir sayının tek mi çift mi olduğunu yazdırınız.

        Scanner oku=new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz = ");
        int sayi=oku.nextInt();

        int birler=sayi%2;

        if (birler==0){
            System.out.println("Girdiğiniz Sayı ÇİFTTİR !!!");
        }
        else {
            System.out.println("Girdiğiniz Sayı TEKTİR !!!");
        }

    }
}
