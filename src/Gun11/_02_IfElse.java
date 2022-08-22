package Gun11;

import java.util.Scanner;

public class _02_IfElse {
    public static void main(String[] args) {
        // Ben Buraya (kursa) neden geldim ?

        // Girilen vize(%40) ve final(%60) notunu okuyarak ortalamayı bulunuz.
        // ortalama 60 dan büyük ise geçtiniz , tebrikler yazdırınız ,değilse
        // bütünlemeye kaldınız şeklinde yazdırnız.

        Scanner oku=new Scanner(System.in);
        System.out.print("Vize Notunu Giriniz = ");
        int vize=oku.nextInt();
        System.out.print("Final Notunu Giriniz = ");
        int final1= oku.nextInt();


        // eğer sonucu double istiyorsak doubleye eşitlemeliyiz
        // eğer int istiyorsak int e eşitlemeliyiz.


        double ort=(vize*0.4)+(final1*0.6);

        if (ort>=60){
            System.out.println("Geçtiniz Tebrikler =" +ort);
        }
        else {
            System.out.println("Bütünlemeye Kaldınız =" +ort);
        }


    }
}
