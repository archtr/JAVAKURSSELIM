package Gun35._01_Ornek;

public class Otobus extends Arac{
    private int yolcuSayisi;

    public Otobus(String renk, int motor, String marka ,int yolcuSayisi , int kapiSayisi ) {
        super(renk, motor, marka , kapiSayisi);
        setYolcuSayisi(yolcuSayisi);
    }

    public int getYolcuSayisi() {
        return yolcuSayisi;
    }

    public void setYolcuSayisi(int yolcuSayisi) {
        this.yolcuSayisi = yolcuSayisi;
    }

    @Override
    public String toString() {
        return "Otobus{" +
                "yolcuSayisi=" + yolcuSayisi +
                '}'+super.toString();
    }
}
