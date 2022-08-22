package Gun17;

import java.util.Scanner;

public class _01_JavaDiziNedir {
    public static void main(String[] args) {
        int sayi; // 1 tane sayı saklayabiliyor.

        int sayi1;
        int sayi2;
        int sayi3;
        //.
        //.
        //.

        int ogrnot1;
        int ogrnot2;
        int ogrnot3;
        //.
        //.
        //.

        int [] notlar=new int[250]; // 250 tane sayı saklayabiliyor.

        notlar[0]=60;
        notlar[1]=70;
        //.
        //.
        //.
        notlar[249]=80;

        Scanner oku=new Scanner(System.in);
        for (int i=0;i<250;i++){
            System.out.println("Lütfen Notu  Giriniz = ");
            notlar[i]=oku.nextInt();
        }



    }
}
