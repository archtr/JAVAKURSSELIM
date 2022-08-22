package Gun08;

import java.util.Scanner;

public class _07_Soru {
    public static void main(String[] args) {
        // Girilen en az 3 kelimelik bir cümledeki ilk iki kelimeyi yazınız.

        Scanner oku=new Scanner(System.in);
        System.out.print("Bir Cümle Giriniz = ");
        String cumle=oku.nextLine();

        int birinciBoslukındex=cumle.indexOf(" ");
        int ikinciBoslukIndex=cumle.indexOf(" ",birinciBoslukındex+1);
        // bosluk ara ama benim verdiğim indexten sonra , o yüzden ilk boşluğun yerini bulup oradan sonraki boşluğu aratıp bulduk


        String İlk2kelime=cumle.substring(0,ikinciBoslukIndex);
        System.out.println("İlk2kelime = " + İlk2kelime);







    }
}
