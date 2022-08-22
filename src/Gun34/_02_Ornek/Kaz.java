package Gun34._02_Ornek;

public class Kaz extends Ordek{
    public Kaz(String renk, int kilo, String cinsi, int kanatAcikligi) {
        super(renk, kilo, cinsi, kanatAcikligi);
    } // torun

    @Override
    public void konustu() {
        super.konustu();
        System.out.println("Vik vik dedi");
    }
}
