package Gun12;

import java.util.Scanner;

public class _14Soru1 {
    public static void main(String[] args) {
        // 1- kullanıcıdan ondalıklı bir sayının ,   tam ve ondalıklı kısmını ayrı  ayrı alınız.
        // bır sayıları  nokta ıle bırlestırerek tek bır ondalıklı sayı haline gitirip, sonra yazdırınız.

        Scanner oku=new Scanner(System.in);
        System.out.print("Bir Tam Sayı Giriniz = ");
        int tamsayi=oku.nextInt();

        System.out.print("Bir Ondalık Sayı Giriniz = ");
        int ondaliksayi=oku.nextInt();

        System.out.println("Birleşik Sayı = " +tamsayi+"."+ondaliksayi);




    }
}
