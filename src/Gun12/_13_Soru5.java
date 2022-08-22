package Gun12;

import java.util.Scanner;

public class _13_Soru5 {
    public static void main(String[] args) {
        // 5- Girilen Bir öğrencinin notunu belirleyen bir Java programı yazın.
        // Program üç tür puan (sınav, ara sınav ve final puanı) okuyacak ve notu aşağıdaki kurallara göre belirleyecektir:
        // Eğer ortalama not >=90% =>not=A
        // Eğer ortalama not >= 70% ve<90% => not=B
        // Eğer ortalama not >=50% ve <70% =>not=C
        // Eğer ortalama not <50% =>note=F
        // Aşağıdaki örnek çıktıya bakın:
        // int Quiz_score: 80
        // int mid_term_score: 68
        // int Final_score: 90
        // print (Your grade is B)
        // (Notunuz B'dir)

        Scanner oku=new Scanner(System.in);
        System.out.print("Vize Notunu Giriniz = ");
        int vize=oku.nextInt();

        System.out.print("Quiz Notunu Giriniz = ");
        int quiz=oku.nextInt();

        System.out.print("Final Notunu Giriniz = ");
        int finall=oku.nextInt();

        int ort=(vize+quiz+finall)/3;

        if (ort>=90)
            System.out.println("Ders Notunuz = A'dır");
        else
            if (ort>=70 && ort<90)
                System.out.println("Ders Notunuz = B'dir");
            else
                if (ort>=50 && ort<70)
                    System.out.println("Ders Notunuz = C'dir");
                else
                    if (ort<50)
                        System.out.println("Ders Notunuz = F'dir Seneye Görüşürüz!!!");


    }
}
