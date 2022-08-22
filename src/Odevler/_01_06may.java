package Odevler;

import com.oracle.xmlns.internal.webservices.jaxws_databinding.SoapBindingParameterStyle;

import java.util.Scanner;

public class _01_06may {
    public static void main(String[] args) {
        // Girilen bir sayının yüzler basamağını ekrana yazdırınız

        Scanner oku=new Scanner(System.in);
        System.out.print("Vize Notu Giriniz = ");
        int sayi1=oku.nextInt();
        System.out.print("Final Notu Giriniz = ");
        int sayi2=oku.nextInt();

        System.out.println("Genel Ders Notu = " + ((sayi1*0.4)+(sayi2*0.6)));






    }
}
