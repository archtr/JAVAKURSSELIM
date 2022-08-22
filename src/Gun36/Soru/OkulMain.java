package Gun36.Soru;

public class OkulMain {
    public static void main(String[] args) {

        Kisi ogr1=new Ogrenci("selim","kınalı","öğrenci",1);
        Kisi calisan1=new Calisan("ismet","temur","öğretmen","java");

        KisiKimlikBelgesi(ogr1);
        KisiKimlikBelgesi(calisan1);






    }
    public static void KisiKimlikBelgesi(Kisi k){
        k.kimlikBelgesi();
    }
}
