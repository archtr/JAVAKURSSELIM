package Gun30.DigerErisimler.Iki;

import Gun30.DigerErisimler.Bir.Kitap;

public class AmazonStore {
    public static void main(String[] args) {
        // Kitap kit1=new Kitap();
        // erişilemedi
        // kit1.name="Yeni Java Kitabı";
        // erişilemedi
        // başka paketten bu yapıcı metoda ve fielda erişemedik
        // çünkü erişim belirteci default

        Kitap kit2=new Kitap("Algoritma Kitabı"); // erişti
    }
}
