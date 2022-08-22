package Gun36.Soru;

public class Calisan extends Kisi{
    private String departmanı;

    public Calisan(String ad, String soyad, String gorevi, String departmanı) {
        super(ad, soyad, gorevi);
        setDepartmanı(departmanı);
    }

    public String getDepartmanı() {
        return departmanı;
    }

    public void setDepartmanı(String departmanı) {
        this.departmanı = departmanı;
    }

    @Override
    public void kimlikBelgesi() {
        super.kimlikBelgesi();
        System.out.println("Departmanı = " +getDepartmanı());
    }
}
