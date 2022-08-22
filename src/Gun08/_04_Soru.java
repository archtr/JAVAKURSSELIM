package Gun08;

import java.util.Scanner;

public class _04_Soru {
    public static void main(String[] args) {
        // Girilen bir passwordun sizin bildiğiniz bir kelime ile eş olup olmadığını bulunuz
        // şifre= "bayrak"



        String gizlisifre="bayrak";
        Scanner oku=new Scanner(System.in);
        System.out.print("Bir Şifre Giriniz =");
        String girilenSifre=oku.nextLine();


        System.out.println("Şifre Geçerli mi ? = " + gizlisifre.equals(girilenSifre));
        System.out.println("Şifre Geçerli mi ? = " + gizlisifre.equalsIgnoreCase(girilenSifre));


    }
}
