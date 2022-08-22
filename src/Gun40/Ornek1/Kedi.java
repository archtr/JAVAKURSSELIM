package Gun40.Ornek1;

public class Kedi extends Hayvan{


    public Kedi( String isim, boolean vahsi, String dogumTarihi) {
        super(isim, vahsi, dogumTarihi);
    }

    @Override
    public void setId(int id) {

    }

    @Override
    public void yiyecegi() {
        System.out.println("Peynir");
    }

    @Override
    public void yemekMiktari() {
        System.out.println("100gr");
    }

    @Override
    public void gunlukUykuSuresi() {
        System.out.println("9 saat");
    }

    @Override
    public void sesi() {
        System.out.println("miyav");
    }

}
