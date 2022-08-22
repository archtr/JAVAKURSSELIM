package Gun12;

import java.util.Scanner;

public class _09_JavaRandom {
    public static void main(String[] args) {
        // Girilen bir sayıya kadar random sayı üreterek tahmin etmeye çalışnız
        // kullanıcı bilirse tebrikler yazdırınız.

        Scanner oku=new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz = ");
        int sayi=oku.nextInt();

        double RandomSayi=Math.random();

        int tamSayi=(int)(RandomSayi * sayi+1);
        System.out.println("tamSayi = " +tamSayi);

        if (sayi==tamSayi)
            System.out.println("Tebrikler");
        else
            System.out.println("Tekrar Deneyiniz");




    }
}
