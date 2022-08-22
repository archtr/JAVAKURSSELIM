package Gun19;

public class _07_Soru2 {
    public static void main(String[] args) {
        // 2- int Array oluşturun ve elemanları : 12,2,5,15,8
        //En büyük değeri yazdırınız.

        int[] sayilar={12,2,5,15,8};
        int enb=0;

        for (int i=0;i<5;i++){
            if (sayilar[i]>enb){
                 enb=sayilar[i];
            }
        }
        System.out.println("En Büyük Sayı = " +enb);
    }
}
