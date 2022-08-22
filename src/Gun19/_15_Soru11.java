package Gun19;

public class _15_Soru11 {
    public static void main(String[] args) {
        // 11- İnt Array oluştur ve elemanları   : 25,30,30,35,100
        // Array in elemanlarının toplamını yazdır.
        // Cevap 220 olmalı.

        int[] sayilar={25,30,30,35,100};
        int toplam=0;

        for (int i=0;i< sayilar.length;i++){
                toplam=toplam+sayilar[i];
            }
        System.out.println("Toplam = " +toplam);




    }
}
