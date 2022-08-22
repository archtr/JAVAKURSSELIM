package Gun26._04_Soru;

import java.util.ArrayList;
import java.util.Scanner;

public class Okul {
    public static void main(String[] args) {
        // Öğretmen için not defteri programı yapılması isteniyor.
        // her öğrencinin okulNo(int) , tamAdi(String) ve notu(int) vardır
        // öğretmenden 20 öğrenci için bu bilgileri alınız.
        // bütün sınıfı bir metodda yazdırınız.
        // sınıfın not ortalamasını yine bir metodda yazdırınız.
        // gerekli Classlar için ayrı dosya açın

        ArrayList<Ogrenci> sinif=new ArrayList<>();
        Scanner oku=new Scanner(System.in);
        Scanner okuInt=new Scanner(System.in);

        for(int i=1;i<=3;i++){
            Ogrenci ogr=new Ogrenci();
            System.out.print(+i+ ". Öğrenci Okul No = ");
            ogr.okulNo= okuInt.nextInt();
            System.out.print(+i+ ". Öğrenci Tam Adı = ");
            ogr.tamAdi= oku.nextLine();
            System.out.print(+i+ ". Öğrenci Notu = ");
            ogr.notu= okuInt.nextInt();

            sinif.add(ogr);
        }
        bilgiYazdir(sinif);
        ortalamaYaz(sinif);
    }
    public static void bilgiYazdir(ArrayList<Ogrenci> sinif){
        for (Ogrenci ogr:sinif
             ) {
            System.out.println("Öğrenci Bilgileri = " +ogr.okulNo+" "+ogr.tamAdi+" "+ogr.notu);

        }
    }
    public static void ortalamaYaz (ArrayList<Ogrenci>sinif){
        int toplam=0;
        for (Ogrenci ogr: sinif
             ) {
            toplam=toplam+ ogr.notu;
        }
        System.out.println("Sınıf Ortalaması = " +(toplam/ sinif.size()));
    }
}

class Ogrenci {
    int okulNo;
    String tamAdi;
    int notu;
}
