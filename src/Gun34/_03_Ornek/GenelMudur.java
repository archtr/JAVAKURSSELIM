package Gun34._03_Ornek;

public class GenelMudur extends Calisan{
    double tazminat;


    public GenelMudur(String isim, double maas, int maasKatSayisi,double tazminat) {
        super(isim, maas, maasKatSayisi);
        this.tazminat=tazminat;
    }

    @Override
    public double maasHesapla() {
        return super.maasHesapla()+tazminat;
    }

    @Override
    public String toString() {
        return "GenelMudur{" +
                "tazminat=" + tazminat +
                '}' +super.toString();
    }
}
