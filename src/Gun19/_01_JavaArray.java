package Gun19;

public class _01_JavaArray {
    public static void main(String[] args) {
        // 100 elemanlı bir diziyi random (0-100) doldurduktan sonra ,
        // sadece tek elemanlarını bir başka diziye atayınız.

        int[] dizi = new int[10];
        int adet=0;

        for (int i = 0; i < dizi.length; i++) {
            dizi[i] = (int) (Math.random()*101);
            System.out.println("Random Sayı ["+i+"]= " +dizi[i]);
            if (dizi[i]%2==1){
                adet++;
                int[] dizitek=new int[adet];
                System.out.println("Random Sayılardan Tek olanlar ["+adet+"]= " +dizi[i]);
            }
        }

    }
}
