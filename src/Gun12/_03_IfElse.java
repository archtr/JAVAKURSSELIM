package Gun12;

import java.util.Scanner;

public class _03_IfElse {
    public static void main(String[] args) {
        // Otopark ücretleri :
        // 3 saate kadar 10tl , 5 saate kadar 15tl , 5 saatten fazlaysa 20tl dir.
        // kullanıcıdan kaç saat kaldığını alarak ücretini yazdırınız.

        Scanner oku = new Scanner(System.in);
        System.out.print("Otoparkta Kaldığınız Süreyi Giriniz = ");
        int saat = oku.nextInt();

        if (saat <= 3) {
            System.out.println("10 TL Ödeyiniz");
        }
        else {
            if (saat<=5){
                System.out.println("15 TL Ödeyiniz");
            }
            else {
                System.out.println("20 TL Ödeyiniz");
            }
        }



    }
}
