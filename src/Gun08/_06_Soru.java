package Gun08;

import java.util.Scanner;

public class _06_Soru {
    public static void main(String[] args) {
        // Girilen bir cümledeki ilk kelimeyi yazdırınız.

        Scanner oku=new Scanner(System.in);
        System.out.print("Bir Cümle Giriniz = ");
        String cumle=oku.nextLine();


        System.out.println("Boşluk indexi = " + cumle.indexOf(" "));
        System.out.println("İlk Kelime = " + cumle.substring(0,6));

        String İlkKelime=cumle.substring(0, cumle.indexOf(" "));
        System.out.println("İlkKelime = " + İlkKelime);




    }
}
