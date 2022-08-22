package Gun31.StaticModifier.Ornek2;

public class School {
    public static void main(String[] args) {
        // Student (id,name,surName)
        // yukarıdaki gibi 5 öğrenci tanımlayınız
        // her öğrencinin bir numarası olmalı
        // ve en son kaç öğrenci olduğunu bulabilmeliyim

        Student std1=new Student("Selim","Kınalı");
        System.out.println("std1 = " +std1);
        Student std2=new Student("Uğur","Demir");
        System.out.println("std2 = " +std2);
        Student std3=new Student("İsmet","Temur");
        System.out.println("std3 = " +std3);
        Student std4=new Student("Mehmet","Yılmaz");
        System.out.println("std4 = " +std4);
        Student std5=new Student("Ahmet","Kaya");
        System.out.println("std5 = " +std5);

        System.out.println("Öğrenci Sayısı = " +Student.sayac);



    }
}
