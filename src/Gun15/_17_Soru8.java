package Gun15;

import java.util.Scanner;

public class _17_Soru8 {
    public static void main(String[] args) {
        // 8-Girilen bir cümledeki kelime sayısını bulunuz.(Regex kullanmayın)

        Scanner oku = new Scanner(System.in);
        System.out.print("Bir Cümle Giriniz = ");
        String cumle = oku.nextLine();

        int sayac=1;

        for (int i=0;i<cumle.length();i++){
            if (cumle.charAt(i)==' '){
                sayac++;
            }
        }

        System.out.println("Cümlede ki Kelime Adedi = "+sayac+ " tanedir");


    }
}
