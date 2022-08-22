package Gun20;

import java.util.Arrays;
import java.util.Scanner;

public class _05_JavaMethod {
    public static void main(String[] args) {
        // Kullanıcıdan 5 elemanlı bir diziyi doldurduktan sonra,
        // dizinin en küçük , en büyük elemanını ve ortalamasını bulduktan sonra
        // bu dizinin bütün elemanlarının karelerini yeni bir diziye atayınız
        // bu dizininde en küçük , en büyük elemanını ve ortalamasını bulunuz.

        int[] dizi=new int[5];
        Scanner oku=new Scanner(System.in);

        for (int i=0;i< dizi.length;i++){
        System.out.print("Bir Sayı Giriniz = ");
        dizi[i]= oku.nextInt();
        }
        enKucukYaz(dizi);
        enBuyukYaz(dizi);
        ortalamaYaz(dizi);

        // 2. kısım karesi bölümü
        int[] dizi2=new int[5];
        for (int i=0;i< dizi.length;i++){
            dizi2[i]=dizi[i]*dizi[i];
        }
        enKucukYaz(dizi2);
        enBuyukYaz(dizi2);
        ortalamaYaz(dizi2);
    }
    public static void enKucukYaz(int[] dizi){
        Arrays.sort(dizi); // diziyi küçükten büyüğe sıraladık
        System.out.println("En Küçük Sayı = " +dizi[0]); // en küçük sayı
    }
    public static void enBuyukYaz(int[] dizi){
        Arrays.sort(dizi); // diziyi küçükten büyüğe sıraladık
        System.out.println("En Büyük Sayı = " +dizi[dizi.length-1]); // en büyük sayı
    }
    public static void ortalamaYaz(int[] dizi){
        int toplam=0;
        for (int i=0;i< dizi.length;i++){
            toplam=toplam+dizi[i];
        }
        int ort=toplam/ dizi.length;
        System.out.println("Ortalama = " +ort);
    }

}
