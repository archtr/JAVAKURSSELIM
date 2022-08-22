package Gun13;

import java.util.Scanner;

public class _04_Switch {
    public static void main(String[] args) {
        // Kullanıcının girdiği gün numarasına karşılık gelen günün adını yazınız.

        Scanner oku = new Scanner(System.in);
        System.out.print("Gün No Giriniz =");
        int gunNo = oku.nextInt();

        //      if (gunNo==1)
        //         System.out.println("pazartesi");
        //     else
        //         if (gunNo==2)
        //             System.out.println("salı");

        switch (gunNo) {
            case 1:
                System.out.println("pazartesi"); break;
            case 2:
                System.out.println("salı"); break;
            case 3:
                System.out.println("çarşamba");break;
            case 4:
                System.out.println("perşembe");break;
            case 5:
                System.out.println("cuma");break;
            case 6:
                System.out.println("cumartesi");break;
            case 7:
                System.out.println("pazar");break;
            default:
                System.out.println("hatalı gün no");break;
        }


    }
}
