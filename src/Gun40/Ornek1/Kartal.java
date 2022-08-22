package Gun40.Ornek1;

public class Kartal extends Hayvan{

    public Kartal(String isim, boolean vahsi, String dogumTarihi) {
        super(isim, vahsi, dogumTarihi);

    }

    @Override
    public void setId(int id) {

    }

    @Override
    public void yiyecegi() {
        System.out.println("et");
    }

    @Override
    public void yemekMiktari() {
        System.out.println("2 kg");
    }

    @Override
    public void gunlukUykuSuresi() {
        System.out.println("5 saat");
    }

    @Override
    public void sesi() {
        System.out.println("Gaaak");
    }


}
