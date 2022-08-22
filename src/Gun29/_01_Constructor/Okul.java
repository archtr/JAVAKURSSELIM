package Gun29._01_Constructor;

public class Okul {
    public static void main(String[] args) {
        // bir student sınıfı oluşturunuz (id,name,surname,classroom(int)) ve
        // bundan 3 adet öğrenci oluşturunuz

        Student ogr1=new Student(); // () parametre yeri
        ogr1.id=1;
        ogr1.name="Selim";
        ogr1.surname="Kınalı";
        ogr1.classroom=9;
        System.out.println("ogr1 = " +ogr1.name);

        Student ogr2=new Student();
        ogr2.id=2;
        ogr2.name="İsmet";
        ogr2.surname="Temur";
        ogr2.classroom=9;
        System.out.println("ogr2 = " +ogr2.name);


        // 2. yöntem
        Student ogr3=new Student(3,"Yasin","Yılmaz",9);
        System.out.println("ogr3 = " +ogr3.name);

        Student ogr4=new Student(4,"Yasin","Yılmaz",9);
        Student ogr5=new Student(5,"Murat","Yılmaz");
        Student ogr6=new Student(6,"İsa","Yılmaz",9);
        Student ogr7=new Student(7,"Onur","Yılmaz",9);





    }
}
