package Gun37._06_Soru;

public class Daire implements ISekil{
    private int yariCap;
    public Daire(int yariCap) {
        setYariCap(yariCap);
    }
    @Override
    public void alani() {
        System.out.println("Daire Alanı = " +Math.PI*(yariCap*yariCap));
    }
    @Override
    public void cevresi() {
        System.out.println("Daire Çevresi = " +2*Math.PI*yariCap);
    }
    public int getYariCap() {
        return yariCap;
    }
    public void setYariCap(int yariCap) {
        this.yariCap = yariCap;
    }
}
