package Gun31.FinalModifier.Ornek1;

public class Vatandas {
    String isim;
    final int tcNo; // değiştirilemez
    // sadece 1 kez veri atanabilir


    static int tcNoSayac=1001; // birtanesin

    public Vatandas(String isim) {
        this.isim = isim;
        this.tcNo=++tcNoSayac;
    }

    @Override
    public String toString() {
        return "Vatandas{" +
                " isim = '" + isim + '\'' +
                ", tcNo = " + tcNo +
                '}';
    }
}
