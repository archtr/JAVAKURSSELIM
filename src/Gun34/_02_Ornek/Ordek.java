package Gun34._02_Ornek;

public class Ordek extends Hayvanlar{
    // baba , dededen miras aldı
    int kanatAcikligi;

    public Ordek(String renk, int kilo, String cinsi , int kanatAcikligi) {
        super(renk, kilo, cinsi); // süper üst classı gösterir
        this.kanatAcikligi= kanatAcikligi;
    }

    @Override
    public void konustu() {
        super.konustu();// aynen kullanıyor
        System.out.println("Vak Vak dedi"); // değiştirip kullanıyor
    }
}
