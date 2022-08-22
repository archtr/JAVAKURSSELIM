package Gun37._03_Ornek3;

public class Geometri {
    public static void main(String[] args) {
        // bir interface in birden fazla class
        // tarafından implemente edilmesi

        Cember c=new Cember(); // bütün metodlara erişim var
        c.ciz();

        Dikdortgen d=new Dikdortgen();
        d.ciz();

        // interface lerden nesne üretilme fakat referans
        // tipi oluşturulabilir. bu bize polymorphism sağladı.
        ICizdirir c2=new Cember(); // direk olarak sadece interfacedeki metodlara erişebilirsin
        c2.ciz();

    }
}
