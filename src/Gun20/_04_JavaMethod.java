package Gun20;

import java.util.Scanner;

public class _04_JavaMethod {
    public static void main(String[] args) {

        tekmiCiftMi(55);
        tekmiCiftMi(66);
        tekmiCiftMiOku();

    }
    public static void tekmiCiftMi(int sayi){
        if (sayi%2==0)
            System.out.println("Girilen Sayı = Çift");
        else
            System.out.println("Girilen Sayı = Tek");
    }
    public static void tekmiCiftMiOku(){
        Scanner oku=new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz = ");
        int okunanSayi= oku.nextInt();


        if (okunanSayi%2==0)
            System.out.println("Girilen Sayı = Çift");
        else
            System.out.println("Girilen Sayı = Tek");
    }


}
