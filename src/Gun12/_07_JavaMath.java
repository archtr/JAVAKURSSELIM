package Gun12;

import java.util.Scanner;

public class _07_JavaMath {
    public static void main(String[] args) {
        // Math.max yöntemi ile girilen 3 sayıdan büyük olanı bulunuz.

        Scanner oku=new Scanner(System.in);
        System.out.print("Birinci Sayıyı Giriniz = ");
        int sayi1=oku.nextInt();

        System.out.print("İkinci Sayıyı Giriniz = ");
        int sayi2=oku.nextInt();

        System.out.print("Üçüncü Sayıyı Giriniz = ");
        int sayi3=oku.nextInt();

        System.out.println("En Büyük Sayı = " +Math.max(sayi1,(Math.max(sayi2,sayi3))));


    }
}
