package Gun34._02_Ornek;

public class Kopek extends Hayvanlar{

    public Kopek(String renk, int kilo, String cinsi) {
        super(renk, kilo, cinsi);
    }

    @Override
    public void konustu() {
        super.konustu();
        System.out.println("Hav hav dedi");
    }
}
