package Gun11;

import java.util.Scanner;

public class _06_IfElse {
    public static void main(String[] args) {
        // Girilen bir stringin uzunluğu 10 dan büyükse ve string içinde
        //        // "study" kelimesi geçiyorsa ekrana evet yazdırın değilse hayır
        //        // hayır yazdırınız.
        //        // bu soruyu büyük küçük harf girilsede doğru çalışacak şekilde çözünüz.

        Scanner oku = new Scanner(System.in);
        System.out.print("Bir String Giriniz = ");
        String okunan = oku.nextLine();

        int uzunluk = okunan.length();


        if (uzunluk > 10 && okunan.toLowerCase().contains("study")) {
            System.out.println("EVET");
        } else {
            System.out.println("Hayır");
        }


    }
}
