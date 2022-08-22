package Gun30.Soru1;

public class Banka {
    public static void main(String[] args) {
        // Hesap (yatan , cekilen , bakiye(direk erişim olmamalı))
        // Müşteri (hesapID, ad ,soyad, MusteriHesap(Hesap tipinde))
        // bir banka uygulaması için 1 müşteri tanımlayınız
        // müşteri hesabına sırasıyla 100tl , 200 tl yatırınız,
        // sonra 50 tl çekiniz. müşterinin kalan bakiyesini yazdırınız
        // bakiyeye direk para atanamadığını kontrol ediniz

        Musteri mus1=new Musteri();
        mus1.hesapID=1;
        mus1.ad="Selim";
        mus1.soyad="Kınalı";
        mus1.musteriHesap=new Hesap();

        mus1.musteriHesap.paraYatir(100);
        mus1.musteriHesap.paraYatir(200);
        mus1.musteriHesap.paraCek(50);

        System.out.println("Extre = " +mus1.musteriHesap);
        // mus1.musteriHesap.bakiye ulaşılamıyor , testi geçti

    }
}
