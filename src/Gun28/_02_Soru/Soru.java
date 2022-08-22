package Gun28._02_Soru;

public class Soru {
    public static void main(String[] args) {
        // Math sınıfndaki metodlarıdan 5 tanesini ve bir de diziElemanlarTopla fonksiyonlarını
        // kendi isimlendirmenizle ayrı bir sınıfta yazarak,
        // (kendi metodunuzun içinde Math.fonksiyonlarını kullanabilirsiniz)
        // mainden nesne oluşturmadan direk kullanılmasını sağlatacak örnek
        // kullanımlarını yazınız.

        UtilitySoru1.getMin(3,4);
        UtilitySoru1.getAbs(-5);
        UtilitySoru1.getMax(3,4);
        UtilitySoru1.getPow(2,3);
        UtilitySoru1.getRandom(3,15);

        int[] dizi={2,45,6,77,89};
        UtilitySoru1.getDiziElemanlarTopla(dizi);
        System.out.println("topla = " +UtilitySoru1.getDiziElemanlarTopla(dizi));

        System.out.println("max = "+UtilitySoru1.getMax(3,4));
        System.out.println("min = "+UtilitySoru1.getMin(3,4));
        System.out.println("abs = "+UtilitySoru1.getAbs(-5));
        System.out.println("pow = "+UtilitySoru1.getPow(2,3));
        System.out.println("random = "+UtilitySoru1.getRandom(3,15));

        String il = "İstanbul";

        System.out.print(il + 3 + 4 + "\t");


    }
}
