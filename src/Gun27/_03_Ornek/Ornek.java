package Gun27._03_Ornek;

public class Ornek {
    public static void main(String[] args) {
        //1.Adım  :ayrı dosyada olmak üzere Musteri isimli (fields: name) isimli bir class tanımlayınız.
        //2.Adım  :ayrı bir dosyada ElektrikHesabi isimli (fields : toplamTuketim, oran(double), OdenecekTutar)
        //3.Adım  :Musteri a bir ElektrikHesabi ekleyiniz.

        //4.Adım  :1 tane müşteri oluşturunuz
        //5.Adım  :Musteriye ait her ay tüketilen enerjiyi toplayacak bir metod yazınız.
        //         tuketimEkle olasun her verilen aylık rakamı toplayarak biriktirsin.
        //6.Adım  :Ödenecek rakamı  toplam tüketimi  oran(0.7) ile çarparak hesaplatınız yazdırınız.

        //ipucu : hesabı olşuturduktan sonra tuketimEkle metoduna 2,3 ay tüketim ekletiniz, faturayı
        //        ondan sonra toplam alarak çıkartınız

        Musteri m1=new Musteri();
        m1.name="Selim Kınalı";
        m1.eHesabi=new ElektrikHesabi();

        m1.eHesabi.tuketimEkle(100);
        m1.eHesabi.tuketimEkle(200);
        m1.eHesabi.tuketimEkle(150);

        System.out.println("Müşteri İsmi = " +m1.name);
        m1.eHesabi.toplamTuketimYaz();

        m1.eHesabi.odenecekTutar();




    }
}

    // 1. yöntem
    // ElektrikHesabi e1=new ElektrikHesabi();
        // m1.eHesabi=e1;
