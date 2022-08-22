package Gun15;

import java.util.Scanner;

public class _18_Soru9 {
    public static void main(String[] args) {
        // 9-Girilen bir cümledeki kelimelerin baş harflarini yazdırınız.(Regex kullanmayın)


        Scanner oku = new Scanner(System.in);
        System.out.print("Bir Cümle Giriniz = ");
        String cumle=oku.nextLine();

        System.out.print(cumle.charAt(0));
        for (int i=0;i<cumle.length();i++){
            if (cumle.charAt(i)==' ')
                System.out.print(cumle.charAt(i+1));
        }


    }
}
