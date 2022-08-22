package Gun34._02_Ornek;

public class Kedi extends Hayvanlar{

    public Kedi(String renk, int kilo, String cinsi) {
        super(renk, kilo, cinsi);
    }

    @Override
    public void konustu() {
        super.konustu();
        System.out.println("Miyav dedi");
    }
}
