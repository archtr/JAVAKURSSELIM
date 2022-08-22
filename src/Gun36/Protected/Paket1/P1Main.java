package Gun36.Protected.Paket1;

public class P1Main {
    // aynı paketin içinde ki erişim düzeylerini gördük
    public static void main(String[] args) {
        P1Hayvan h=new P1Hayvan();
        h.Ad="karakedi"; // public erişildi
        h.yas=2; // default erişildi
        h.cinsi="tekir"; // protected erişildi
        // h.renk private : sadece kendi classının içinde ulaşa



    }
}
