package Gun22;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class _04_ArrayList_Soru {
    public static void main(String[] args) {
        // kullanıcıdan aldığınız 6 elemanlı bir dizinin
        // sadece tek sayı olan elemanlarını ayrı diziye atayarak
        // yazdırınız

        Scanner oku = new Scanner(System.in);

        int[] dizi=new int[6];

        for (int i=0;i< dizi.length;i++){

            System.out.print("Sayı = ");
            dizi[i]=oku.nextInt();
        }
        /// System.out.println(Arrays.toString(dizi)); kontrol için
        ArrayList<Integer> tekler=new ArrayList<>();
        for (int i=0;i< dizi.length;i++)
            if (dizi[i]%2==1)
                tekler.add(dizi[i]);

        System.out.println("Tekler = " +tekler);

        // TODO : ödev : tek elemanlarını ayrı bir diziye bir metodda atayarak main de yazdırınız

    }
}
