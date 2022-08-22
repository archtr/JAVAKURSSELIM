package Gun27._03_Ornek;

public class ElektrikHesabi {
    int toplamTuketim=0;
    double birimFiyat=0.7;
    double fatura=0;

    public void tuketimEkle(int tuketim){
        toplamTuketim+=tuketim;
    }
    public void toplamTuketimYaz(){
        System.out.println("Toplam Tüketim = " +toplamTuketim+" Kw");
    }
    public void odenecekTutar(){
        fatura = birimFiyat * toplamTuketim;
        System.out.println("Ödenecek Tutar TL = " +fatura+" TL");
    }
}
