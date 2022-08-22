package Gun17;

import java.util.Scanner;

public class _05_JavaArray {
    public static void main(String[] args) {
        // kullanıcıdan aldığınız 7 sayıyı aldıktan sonra
        // kaç tanesinin ortalamadan büyük ve tek sayı olduğunu bulunuz.

        int[] dizi=new int[7]; // test için 5 yaptık.
        Scanner oku=new Scanner(System.in);

        int toplam=0;
        for (int i=0;i< dizi.length;i++){
            System.out.print((i+1)+".Sayıyı Giriniz = ");
            dizi[i]=oku.nextInt();
            toplam=toplam+dizi[i];
        }

        double ortalama=toplam/dizi.length;
        System.out.println("Ortalama = " +ortalama);

        int adet=0;
        for (int i=0;i< dizi.length;i++){
            if (dizi[i]>ortalama && dizi[i]%2==1){
                adet++;
            }
        }
        System.out.println("Ortalamadan Büyük ve Tek Sayı Miktarı = " +adet);

    }
}
