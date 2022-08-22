package Gun09;

import javafx.scene.transform.Scale;

import java.util.Scanner;

public class _04_Soru {
    public static void main(String[] args) {
        // Girilen 3 basamaklı bir sayının tersi olan sayıyı bulunuz.
        // mesela 524 -> 425

        Scanner oku=new Scanner(System.in);
        System.out.print("3 Basamaklı Bir Sayı Giriniz = ");
        int sayi=oku.nextInt();


        // 524 , 5 2 4 u ayırmam lazım -> 4*100+2*10+5

        int yuzler=(sayi/100)%10;
        int onlar=(sayi/10)%10;
        int birler=sayi%10;

        int tersi=birler*100+onlar*10+yuzler;
        System.out.println("tersi = " + tersi);

    }
}
