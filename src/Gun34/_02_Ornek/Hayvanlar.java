package Gun34._02_Ornek;

public class Hayvanlar { // dede
    String renk;
    int kilo;
    String cinsi;


    public Hayvanlar(String renk, int kilo, String cinsi) {
        this.renk = renk;
        this.kilo = kilo;
        this.cinsi = cinsi;
    }

    public void konustu(){
        System.out.println("Hayvan Konuştu");
    }
}
