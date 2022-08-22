package Gun37._06_Soru;

public class Dikdortgen implements ISekil{
    private int kisaKenar;
    private int uzunKenar;
    @Override
    public void alani() {
        System.out.println("Dikdörtgen Alanı = " +kisaKenar*uzunKenar);
    }
    @Override
    public void cevresi() {
        System.out.println("Dikdörtgen Çevresi = " +2*(kisaKenar+uzunKenar));
    }
    public Dikdortgen(int kisaKenar, int uzunKenar) {
        setKisaKenar(kisaKenar);
        setUzunKenar(uzunKenar);
    }
    public int getKisaKenar() {
        return kisaKenar;
    }
    public void setKisaKenar(int kisaKenar) {
        this.kisaKenar = kisaKenar;
    }
    public int getUzunKenar() {
        return uzunKenar;
    }
    public void setUzunKenar(int uzunKenar) {
        this.uzunKenar = uzunKenar;
    }

}
