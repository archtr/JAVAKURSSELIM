package Odevler;

import java.util.Scanner;

public class ss {
    public static void main(String[] args) {

        Scanner oku=new Scanner(System.in);

        System.out.print("Bir Sayı Giriniz = ");
        int sayi1=oku.nextInt();

        int birler=sayi1%10;
        int onlar=(sayi1/10)%10;

        if (birler%2==1 && onlar%2==1 && birler==onlar){
            System.out.println("eşit");
        }
        else {
            System.out.println("değil");
        }



    }
}
