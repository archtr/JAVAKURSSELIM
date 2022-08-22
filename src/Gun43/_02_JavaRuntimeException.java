package Gun43;

import java.util.Scanner;

public class _02_JavaRuntimeException {
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);

        System.out.print("1. sayıyı giriniz = ");
        int sayi1= oku.nextInt();

        System.out.print("2. sayıyı giriniz = ");
        int sayi2= oku.nextInt();

        System.out.println("bölüm = "+(sayi1/sayi2));




    }
}
