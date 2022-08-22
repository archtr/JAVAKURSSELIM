package Gun19;

public class _08_Soru3 {
    public static void main(String[] args) {
        // 3- int Array oluşturun ve elemanları : 14 , 19 , 5 , 21
        // En küçük (minimum) sayıyı yazdırınız.

        int[] sayilar={14,19,5,21};
        int enk=100;

        for (int i=0;i<4;i++){
            if (sayilar[i]<enk){
                enk=sayilar[i];
            }
        }
        System.out.println("En Küçük Sayı = " +enk);

    }
}
