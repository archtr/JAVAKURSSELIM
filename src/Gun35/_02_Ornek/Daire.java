package Gun35._02_Ornek;

public class Daire extends Sekil{

    private int yariCap;

    public Daire(int yariCap) {
        setYariCap(yariCap);
    }

    public int getYariCap() {
        return yariCap;
    }

    public void setYariCap(int yariCap) {
        this.yariCap = yariCap;
    }
    public double getAlan(){
        return Math.PI*this.yariCap*this.yariCap;
    }
    public double getCevre(){
        return 2*Math.PI*this.yariCap;
    }

    @Override
    public String toString() {
        return "Daire{" +
                "yariCap=" + yariCap +
                '}';
    }
}
