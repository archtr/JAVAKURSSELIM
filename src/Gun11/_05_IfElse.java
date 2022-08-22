package Gun11;

import java.util.Scanner;

public class _05_IfElse {
    public static void main(String[] args) {
        // Girilen bir stringin uzunluğu 10 dan büyükse ve stringin içinde
        // "study" kelimesi geçiyorsa ekrana evet yazdırın değilse hayır
        // yazdırınız

        Scanner oku = new Scanner(System.in);
        System.out.print("Bir String Giriniz = ");
        String str = oku.nextLine();

        int uzunluk = str.length();


        if (uzunluk > 10 && str.contains("study")) {
            System.out.println("EVET");
        } else {
            System.out.println("Hayır");
        }


    }
}
