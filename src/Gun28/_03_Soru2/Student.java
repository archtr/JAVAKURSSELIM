package Gun28._03_Soru2;

import java.util.ArrayList;

public class Student {
    String Sname;
    int maxCredit;
    ArrayList<Lesson> dersleri=new ArrayList<>();

    public void dersEkle(Lesson ders){
        // gelen dersin kredisi artı var olan krediyi
        // toplayıp kontrol edeceğiz

        int toplamAlinanKredi=0;
        for (Lesson l:dersleri
             ) {
            toplamAlinanKredi+=l.credit;
    }
        System.out.println("Toplam Alınan Kredi = " +toplamAlinanKredi);

        if (toplamAlinanKredi+ders.credit<=maxCredit){
            dersleri.add(ders);
            System.out.println("Eklenen Ders = " +ders.Lname);
        }
        else
            System.out.println("Alınabilecek Kredi Miktarı Aşıldı -" +ders.Lname +"- Eklenemedi");



}
}
