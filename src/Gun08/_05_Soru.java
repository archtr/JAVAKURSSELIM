package Gun08;

import java.util.Scanner;

public class _05_Soru {
    public static void main(String[] args) {
        // Girilen bir kelimenin ilk ve son harfini bulunuz.

        Scanner oku=new Scanner(System.in);
        System.out.print("Bir Kelime Giriniz = ");
        String kelime=oku.nextLine();

        char ilkHarf=kelime.charAt(0);
        int uzunluk=kelime.length();
        char sonHarf=kelime.charAt(uzunluk-1);
        char sonHarf2=kelime.charAt( kelime.length()-1 )  ; // böyle de olurdu


        System.out.println("ilk ve Son Harf = " + ilkHarf+" "+sonHarf);







    }
}
