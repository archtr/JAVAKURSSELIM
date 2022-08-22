package Gun12;

import java.util.Scanner;

public class _12_Soru4 {
    public static void main(String[] args) {
        //4-Girilen bir string
        //Eğer String € karakterini kapsıyorsa "This is euro" yazdırın.
        // Eğer String $ karakterini kapsıyorsa "This is dollar" yazdırın.
        // Aksi halde (else) "no money" yazdırın.

        Scanner oku = new Scanner(System.in);
        System.out.print("Bir Para Miktarı ve Değeri Giriniz = ");
        String  miktar = oku.nextLine();

        if (miktar.contains("€"))
            System.out.println("This is euro");
        else
            if (miktar.contains("$"))
                System.out.println("This is dollar");
            else
                System.out.println("No Money");


    }
}
