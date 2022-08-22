package Gun31.FinalModifier.Ornek2;

public class Sabitler {

    final static int saatSayisi=24;
    final static int dakikaSayisi=60;
    final static int saniyeSayisi=60;

    public static int hesapla (int gun ,int saat, int dakika){
        int toplamSaniye=
                gun*saatSayisi*dakikaSayisi*saniyeSayisi+
                        saat*dakikaSayisi*saniyeSayisi+
                        dakika*saniyeSayisi;
        return toplamSaniye;
    }
}
