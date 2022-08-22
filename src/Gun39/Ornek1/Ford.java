package Gun39.Ornek1;

public class Ford extends BinekOto{
    @Override
    public String getMarka() {
        return "Ford";
    }

    @Override
    public int getUretimYili() {
        System.out.println("Üretildiği Yıl = ");
        return super.getUretimYili();
    }
}
