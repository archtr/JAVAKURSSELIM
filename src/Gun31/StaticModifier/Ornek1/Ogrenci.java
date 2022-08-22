package Gun31.StaticModifier.Ornek1;

public class Ogrenci {
    String ad;
    String soyad;

    static String OkulAd="Yıldırım Ortaokulu";
    // hepsi için geçerli tek bir tane eleman
    // tekrarlayan ve tüm nesneler için kullanılacak
    // değişkenler için Static kullanıyoruz
    // static=sen bir tanesin
    // static varsa hafızadan tasarruf sağlar


    public Ogrenci(String ad , String soyad){
        this.ad=ad;
        this.soyad=soyad;
    }

    @Override
    public String toString() {
        return "Ogrenci{" +
                "ad='" + ad + '\'' +
                ", Soyad='" + soyad + '\'' +
                ", OkulAd='" + OkulAd + '\'' +
                '}';
    }

}
