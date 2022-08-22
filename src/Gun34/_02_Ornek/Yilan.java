package Gun34._02_Ornek;

public class Yilan extends Hayvanlar{
    int uzunluk;


    public Yilan(String renk, int kilo, String cinsi , int uzunluk) {
        super(renk, kilo, cinsi);
        this.uzunluk=uzunluk;
    }

    @Override
    public void konustu() {
        super.konustu();
        System.out.println("Tıss dedi");
    }
}
