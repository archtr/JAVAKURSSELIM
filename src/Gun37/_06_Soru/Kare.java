package Gun37._06_Soru;

public class Kare extends Dikdortgen {
    public Kare(int kisaKenar) {
        super(kisaKenar,kisaKenar);
    }

    @Override
    public void alani() {
        System.out.println("Kare Alanı = " +getKisaKenar()*getKisaKenar());

    }

    @Override
    public void cevresi() {
        System.out.println("Kare Çevresi = " +getKisaKenar()*4);

    }

}
