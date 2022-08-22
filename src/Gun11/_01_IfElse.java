package Gun11;

import java.util.Scanner;

public class _01_IfElse {
    public static void main(String[] args) {
        // Girilen bir öğrencinin notuna göre 50 büyük eşit ise geçtiniz.
        // küçük ise kaldınız yazdırınız.

        Scanner oku=new Scanner(System.in);
        System.out.print("Notu Giriniz =");
        int ogrnot=oku.nextInt();

       // if (ogrnot>=50){
       //     System.out.println("Geçtiniz");
       //  }
        //if (ogrnot<50){
        //    System.out.println("Kaldınız");
        //}
        // yukarıdaki iflerde herzaman kontrol edilme durumu vardır
        // halbuki aşağıda IF-ELSE yapısında IF şartı çalıştığında ELSE
        // kontrol edilmesine gerek kalmaz

        if (ogrnot>=50){ // baklava dilimi
            System.out.println("Geçtiniz"); // evet çıkışı
        }
        else {
            System.out.println("Kaldınız"); // hayır çıkışı
        }


    }
}
