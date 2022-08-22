package Gun19;

public class _10_Soru5 {
    public static void main(String[] args) {
        // 5-int Array oluşturun ve elemanları : 5,6,8,12,14,19
        // Eğer sayı çiftse topla, tekse çıkar.
        //        **Örneğin:**
        //  **-5 + 6 + 8 + 12 + 14 - 19 = 16**
        // Toplamlarını yazdırın.

        int[] sayilar={5,6,8,12,14,19};
        int toplam=0;

        for (int i=0;i< sayilar.length;i++){
            if (sayilar[i]%2==0){
                toplam=toplam+sayilar[i];
                }
            else
                toplam=toplam-sayilar[i];
            }
        System.out.println("Sonuç = " +toplam);




    }
}
