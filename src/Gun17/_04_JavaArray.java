package Gun17;

import java.util.Scanner;

public class _04_JavaArray {
    public static void main(String[] args) {
        // 100 elemanlı int bir dizi tanımlayınız. kullanıcıdan değerleri alarak
        // bu diziyi doldurunuz. daha sonra ortalamadan büyük eleman sayısını bulunuz.

        int[] dizi=new int[5]; // test için 5 yaptık.
        Scanner oku=new Scanner(System.in);

        int toplam=0;
        for (int i=0;i< dizi.length;i++){
            System.out.print((i+1)+".Not Giriniz = ");
            dizi[i]=oku.nextInt();
            toplam=toplam+dizi[i];
        }

        double ortalama=toplam/dizi.length;
        System.out.println("Ortalama = " +ortalama);

        int adet=0;
        for (int i=0;i< dizi.length;i++){
            if (dizi[i]>ortalama){
                adet++;
            }
        }
        System.out.println("Ortalamadan Büyük Not Miktarı = " +adet);







    }
}
