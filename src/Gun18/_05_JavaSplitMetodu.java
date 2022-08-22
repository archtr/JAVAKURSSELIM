package Gun18;

import java.util.Arrays;
import java.util.Scanner;

public class _05_JavaSplitMetodu {
    public static void main(String[] args) {
        // Split: bir stringi parçalara ayırmak demek

        // Kullanıcıdan alacağınız cümleyi kelimelerine göre alt alta yazdırınız
        Scanner oku=new Scanner(System.in);
        System.out.print("Bir Cümle Giriniz = ");
        String cumle=oku.nextLine();

        String[] kelimeler=cumle.split(" ");
        System.out.println("Kelimeler = " + Arrays.toString(kelimeler));

        System.out.println("Kelime Sayısı = " +kelimeler.length);

        for (int i=0;i<kelimeler.length;i++){
            System.out.println("Kelimeler = " +kelimeler[i]);
            System.out.println("Kelimeler = " +kelimeler[i].length());
        }


    }
}
