package Gun19;

import java.util.Arrays;

public class _01b_JavaArray {
    public static void main(String[] args) {
        // 100 elemanlı bir diziyi random (0-100) doldurduktan sonra ,
        // sadece tek elemanlarını bir başka diziye atayınız.

        int[] dizi = new int[100];
        int[] tekler=new int[100];

        for (int i=0;i< dizi.length;i++){
            dizi[i]=(int)(Math.random()*101);
        }
        int j=0;
        for (int i=0;i< dizi.length;i++)
            if (dizi[i]%2==1){
                tekler[j]=dizi[i];
                j++;
            }

        System.out.println("dizi   = " + Arrays.toString(dizi));
        System.out.println("tekler = " + Arrays.toString(tekler));



    }
}
