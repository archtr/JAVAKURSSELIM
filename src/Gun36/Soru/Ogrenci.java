package Gun36.Soru;

public class Ogrenci extends Kisi{

    private int subesi;

    public Ogrenci(String ad, String soyad, String gorevi, int subesi) {
        super(ad, soyad, gorevi);
        setSubesi(subesi);
    }

    public int getSubesi() {
        return subesi;
    }

    public void setSubesi(int subesi) {
        this.subesi = subesi;
    }

    @Override
    public void kimlikBelgesi() {
        super.kimlikBelgesi();
        System.out.println("Şubesi = " +getSubesi());
    }
}
