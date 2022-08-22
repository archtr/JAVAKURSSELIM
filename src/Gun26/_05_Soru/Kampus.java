package Gun26._05_Soru;

import java.util.ArrayList;
import java.util.Scanner;

public class Kampus {
    public static void main(String[] args) {
        // Bir kampüs programı için aşağıda ki özellikte bilgilerin
        // kaydedileceği classları yazınız.
        // Okul : adı,müdürAdi,ücreti(double)
        // Oğrenci : okulNo , tamAd ,okul
        // bu şekilde 1 öğrenci tanımlayıp bütün bilgileri kendiniz atayıp
        // yazdırınız


        Ogrenci ogr=new Ogrenci();

        ogr.okulNo=1453;
        ogr.tamAdi="Selim Kınalı";



        Okul okulBilgi=new Okul();

        okulBilgi.okulAdi="Gauu";
        okulBilgi.mudurAdi="İsmet Temur";
        okulBilgi.ucret=1.001;

        System.out.println("Okul ve Öğrenci Bilgileri = " +ogr.okulNo+" "+ogr.tamAdi+" "+okulBilgi.okulAdi+" "+okulBilgi.mudurAdi+" "+okulBilgi.ucret);









    }

}

class Okul {
    String okulAdi;
    String mudurAdi;
    double ucret;
}
class Ogrenci {
    int okulNo;
    String tamAdi;
    String okulu;
}
