package Gun14;

import java.util.Scanner;

public class _07_DoWhile {
    public static void main(String[] args) {
        // kullanıcıda x girilene kadar ekrana "Program Çalışıyor" yazan
        // ve x girildiğinde ise "Program Bitti" yazan programı yazdırınız.

        Scanner oku=new Scanner(System.in);
        String okunan="";

        do {
            System.out.println("Program Çalışıyor");
            System.out.print("Bir İfade Giriniz = ");
            okunan=oku.next();

        } while (!okunan.equalsIgnoreCase("X") );
        System.out.println("Program Bitti");




    }
}
