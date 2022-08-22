package Gun07;

import java.util.Scanner;

public class _11_Soru {
    public static void main(String[] args) {
        // Girilen bir stringdeki nokta sayısını bulunuz.
        // 01.02.20 bu stringde kaç tane nokta vardır.

        Scanner oku=new Scanner(System.in);
        System.out.print("Lütfen Bilgiyi Giriniz = ");
        String girilen=oku.nextLine();

        System.out.println("girilen = " + girilen);
        int uzunluk1= girilen.length();

        String noktasiz= girilen.replace(".","");
        System.out.println("noktasiz = " + noktasiz);
        int uzunluk2=noktasiz.length();

        System.out.println("nokta sayısı = " + (uzunluk1-uzunluk2));


    }

}
