package Gun28._03_Soru2;

public class Soru2 {
    public static void main(String[] args) {
        // Bir Üniversitede öğrencilere ders kaydı yapılacaktır.
        // 1- Ders Class : adı: Lesson , fields : name, credit (1-10 arasında değer alıyor)
        // 2- Öğrenci Class: adı: Student, fields : name, maxCredit, dersleri listesini
        //    tutacak bir liste
        // 3- 3 adet ders oluşturunuz.
        // 4- 1 adet öğrenci tanımlayınız alabileceği maxCredi si 10 olsun.
        // 5- Bu öğrencinin ders listesine açılmış dersleri ekleyiniz.
        //    ders eklerken max alabileceği Crediyi geçmemeli, geçerse
        //    uyarı versi, alabileceğiniz max credi doldu şeklinde.

        Lesson ders1=new Lesson();
        ders1.Lname="Mat101";
        ders1.credit=4;

        Lesson ders2=new Lesson();
        ders2.Lname="Java101";
        ders2.credit=3;

        Lesson ders3=new Lesson();
        ders3.Lname="Algoritma101";
        ders3.credit=6;

        Student ogr=new Student();
        ogr.Sname="Selim Kınalı";
        ogr.maxCredit=10;

        // bu dersleri sırasıyla ekleyeceğiz alabileceği toplam krediyi geçene kadar

        ogr.dersEkle(ders1);
        ogr.dersEkle(ders2);
        ogr.dersEkle(ders3);



    }
}
