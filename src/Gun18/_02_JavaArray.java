package Gun18;

import java.util.Scanner;

public class _02_JavaArray {
    public static void main(String[] args) {
        // kullanıcının gireceği bir cümlede kaç kelime olduğunu bulunuz

        Scanner oku=new Scanner(System.in);
        System.out.print("Bir Cümle Giriniz = ");
        String cumle=oku.nextLine();

        int bosluksayisi=0;


        for (int i=0;i<cumle.length();i++){
            if (cumle.charAt(i)==' '){
                bosluksayisi++;

            }
        }
        System.out.println("Kelime Sayısı = " +(bosluksayisi+1));


    }
}
