package Gun35._03_Ornek;

public class Ogrenci {



    private int id;
    private String isim;
    private String tipi;

    private static int sayac=0;

    public Ogrenci(String isim, String tipi) {
        setId(id);
        setIsim(isim);
        setTipi(tipi);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = ++sayac;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getTipi() {
        return tipi;
    }

    public void setTipi(String tipi) {
        this.tipi = tipi;
    }

    @Override
    public String toString() {
        return "Ogrenci{" +
                "id=" + id +
                ", isim='" + isim + '\'' +
                ", tipi='" + tipi + '\'' +
                '}';
    }

}
