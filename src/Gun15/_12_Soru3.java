package Gun15;

import java.util.Scanner;

public class _12_Soru3 {
    public static void main(String[] args) {
        // 3-  Kullanıcıdan 10 adet sayı isteyiniz, eğer sayı çift ise toplasın, tek ise girdiğinde ise döngü sonlansın.

        Scanner oku = new Scanner(System.in);
        int toplam=0;

        for (int i=0;i<=10;i++){

            System.out.print("Bir Sayı Giriniz = ");
            int sayi=oku.nextInt();

            if (sayi%2==1)
                break;
                toplam=toplam+sayi;
        }
        System.out.println("Toplam = "+toplam);




    }
}
