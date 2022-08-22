package Gun34._03_Ornek;

public class SirketMain {
    public static void main(String[] args) {
        Calisan calisan1=new Calisan("selim",5000,2);
        System.out.println("calisan1.maasHesapla() = " +calisan1.maasHesapla());
        System.out.println("calisan1 = " +calisan1);
        GenelMudur genelMudur1=new GenelMudur("ismet",10000,2,5000);
        System.out.println("genelMudur1.maasHesapla() = " +genelMudur1.maasHesapla());
        System.out.println("genelMudur1 = " +genelMudur1);
    }
}
