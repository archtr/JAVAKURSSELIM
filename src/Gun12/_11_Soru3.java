package Gun12;

import java.util.Scanner;

public class _11_Soru3 {
    public static void main(String[] args) {
        // 3- Girilen 3 sayıdan en küçük olanını bulunuz.

        Scanner oku=new Scanner(System.in);
        System.out.print("1. Sayıyı Giriniz = ");
        int sayi1=oku.nextInt();

        System.out.print("2. Sayıyı Giriniz = ");
        int sayi2=oku.nextInt();

        System.out.print("3. Sayıyı Giriniz = ");
        int sayi3=oku.nextInt();

        System.out.println("En Küçük Sayı = " +Math.min(sayi1,Math.min(sayi2,sayi3)));


    }
}
