package Gun19;

public class _09_Soru4 {
    public static void main(String[] args) {
        // 4- int Array oluşturun ve elemanları : 15 , 25, 22, 18, 30
        //Arraydaki en büyük 2. elemanı yazdıran bir program yazın.

        int[] sayilar={15,25,22,18,30};
        int enb=0;
        int enb2=0;

        for (int i=0;i<5;i++){
            if (sayilar[i]>enb){
                enb2=enb;
                enb=sayilar[i];
            }
            else
                if (sayilar[i]>enb2){
                    enb2=sayilar[i];
                }
        }
        System.out.println("En Büyük 2. Sayı = " +enb2);



    }
}
