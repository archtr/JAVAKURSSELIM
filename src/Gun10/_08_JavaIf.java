package Gun10;

import java.util.Scanner;

public class _08_JavaIf {
    public static void main(String[] args) {
        // Girilen bir sayının birler ve onlar basamağının eşit olup olmadığını yazdırınız.

        Scanner oku=new Scanner(System.in);
        System.out.print("En Az İki Basamaklı Bir Sayı Giriniz = ");
        int sayi=oku.nextInt();

        int birlerBasamagı=sayi%10;
        int onlarBasamagı=sayi/10%10;

        if (birlerBasamagı==onlarBasamagı){
            System.out.println("Eşit");
        }
        if (birlerBasamagı!=onlarBasamagı){
            System.out.println("Eşit Değil");
        }

    }
}
