package Gun15;

import java.util.Scanner;

public class _16_Soru7 {
    public static void main(String[] args) {
        // 7-Girilen bir cumledeki a harfi sayısını bulunuz.(Regex kullanmayın)

        Scanner oku = new Scanner(System.in);
        System.out.print("Bir Cümle Giriniz = ");
        String cumle = oku.nextLine();

        int sayac=0;

        for (int i=0;i<cumle.length();i++){
            if (cumle.charAt(i)=='a' || cumle.charAt(i)=='A'){
                sayac++;
            }
        }

        System.out.println("Cümlede ki 'a-A' Harflerinin Adedi = "+sayac+ " tanedir");

    }
}
