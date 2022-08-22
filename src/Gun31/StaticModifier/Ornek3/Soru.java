package Gun31.StaticModifier.Ornek3;

public class Soru {
        int a; // nesneye ait

        static int b=0; // sen bir tanesin

        void artir(){
            a++;
            b++;
        }

    public static void main(String[] args) {
        Soru s1=new Soru();
        s1.a=5;  // bu değişken nesneye ait , nesne oluşturmadan ulaşamam

        Soru s2=new Soru();
        s2.a=7;

        // a nın değeri kaç oldu şu an : burada verilecek cevap
        // hangi a yı soruyorsunuz olmalı , s1 ve s2 nin a değerleri farklı

        System.out.println("s1.a = " +s1.a);
        System.out.println("s2.a = " +s2.a);


        // b nin değeri kaçtır
        Soru.b=6; // class a ait direk class ın ismi ile ulaşabilirim
        Soru.b=8;

        System.out.println("Soru.b = " +Soru.b); // 8 -> tek bir değeri vardır , son atanan değer , çünkü static

        // a ve b nin en son değeri kaçtır , s1a= 6
        s1.artir(); // s1 a= 6  , b=9
        s2.artir(); // s2 a= 8  , b=10

        System.out.println("s1.a = " +s1.a);
        System.out.println("s2.a = " +s2.a);
        System.out.println("Soru.b = " +Soru.b);
    }



}
