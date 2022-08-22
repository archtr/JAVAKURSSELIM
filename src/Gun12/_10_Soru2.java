package Gun12;

import java.util.Scanner;

public class _10_Soru2 {
    public static void main(String[] args) {
        // 2- Girilen bir sayı
        //Eğer int 9'a bölününce kalan 0 ise ve 5'e bölününce kalan 0 ise "Able to divide by 9 and 5" yazdırın.
        //Eğer int 4'e bölününce kalan 0 ise ve 5'e bölünüce kalan 0 ise "Able to divide by 4 and 15" yazdırın.

        Scanner oku=new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz = ");
        int sayi=oku.nextInt();

        int sayi9bolum=sayi%9;
        int sayi5bolum=sayi%5;
        int sayi4bolum=sayi%4;
        int sayi15bolum=sayi%15;

        if (sayi5bolum==0 && sayi9bolum==0)
            System.out.println("Able to divide by 9 and 5");

        if (sayi4bolum==0 && sayi15bolum==0)
            System.out.println("Able to divide by 4 and 15");


    }
}
