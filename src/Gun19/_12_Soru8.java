package Gun19;

public class _12_Soru8 {
    public static void main(String[] args) {
        // 8- int Array oluşturun ve elemanları : 12, 14 , 21 ,23 , 10 ,4
        // Array'in ortalamasını alınız.

        int[] sayilar={12,14,21,23,10,4};
        int toplam=0;

        for (int i=0;i< sayilar.length;i++){
            toplam=toplam+sayilar[i];
        }
        System.out.println("Ortalama = " +(toplam/ sayilar.length));



    }
}
