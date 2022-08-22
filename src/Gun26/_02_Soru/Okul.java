package Gun26._02_Soru;

import java.util.ArrayList;
import java.util.Scanner;

public class Okul {
    public static void main(String[] args) {
        // Bir okulda kayıt programı için Öğrenci bilgilerini alan  modül
        // yazılacaktır. Öğrenciye ait bilgiler (adı , soyadı , sınıfı ve adres)
        // Kullanıcıdan 3 adet öğrenci bilgileri alarak doldurunuz.
        // Daha sonra bunların bilgilerini yazdırınız.

        ArrayList<Ogrenci> snf=new ArrayList<>();
        Scanner oku=new Scanner(System.in);
        Scanner okuInt=new Scanner(System.in);

        for(int i=1;i<=3;i++){
            Ogrenci ogrenci=new Ogrenci();
            System.out.print(+i+ ". Öğrenci Adı = ");
            ogrenci.ad= oku.nextLine();
            System.out.print(+i+ ". Öğrenci SoyAdı = ");
            ogrenci.soyad= oku.nextLine();
            System.out.print(+i+ ". Öğrenci Sınıfı = ");
            ogrenci.sinif= okuInt.nextInt();
            System.out.print(+i+ ". Öğrenci Adresi = ");
            ogrenci.adres= oku.nextLine();

            snf.add(ogrenci);
        }

        for (Ogrenci ogrenci:snf
             ) {
            System.out.println("ogrenci.ad = " +ogrenci.ad);
            System.out.println("ogrenci.soyad = " +ogrenci.soyad);
            System.out.println("ogrenci.sinif = " +ogrenci.sinif);
            ArrayList<Ogrenci> snf1=new ArrayList<>();
            Scanner oku1=new Scanner(System.in);
            Scanner okuInt1=new Scanner(System.in);

            for(int i=1;i<=3;i++){
                Ogrenci ogrenci1=new Ogrenci();
                System.out.print(+i+ ". Öğrenci Adı = ");
                ogrenci1.ad= oku1.nextLine();
                System.out.print(+i+ ". Öğrenci SoyAdı = ");
                ogrenci1.soyad= oku1.nextLine();
                System.out.print(+i+ ". Öğrenci Sınıfı = ");
                ogrenci1.sinif= okuInt1.nextInt();
                System.out.print(+i+ ". Öğrenci Adresi = ");
                ogrenci1.adres= oku1.nextLine();

                snf.add(ogrenci);
            }

            for (Ogrenci ogrenci1:snf
            ) {
                System.out.println("ogrenci.ad = " +ogrenci.ad);
                System.out.println("ogrenci.soyad = " +ogrenci.soyad);
                System.out.println("ogrenci.sinif = " +ogrenci.sinif);
                System.out.println("ogrenci.adres = " +ogrenci.adres);
            }
            System.out.println("ogrenci.adres = " +ogrenci.adres);
        }

    }
}

class Ogrenci {
    String ad;
    String soyad;
    int sinif;
    String adres;
}
