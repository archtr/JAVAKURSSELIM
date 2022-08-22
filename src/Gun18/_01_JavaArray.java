package Gun18;

public class _01_JavaArray {
    public static void main(String[] args) {
        // 50 elemanlı bir dizi tanımlayınız, 10 a kadar olan sayılardan Random atayarak
        // doldurunuz. Sonrasında ayrı bir döngü ile tek olanlar 1 çift olanlara 2 atayınız  yazdırınız.


        int[] dizi = new int[50];

        for (int i = 0; i < dizi.length; i++) {
            dizi[i] = (int) (Math.random()*11);
            System.out.println("Random Sayı ["+i+"]= " +dizi[i]);

            if (dizi[i] % 2 == 1) {
                dizi[i] = 1;
                System.out.println("Dizi ["+i+"] Tek Sayı = " + dizi[i]);
            }

            if (dizi[i] % 2 == 0) {
                dizi[i] = 2;
            System.out.println("Dizi ["+i+"] Çift Sayı = " + dizi[i]);
            }

        }

    }
}
