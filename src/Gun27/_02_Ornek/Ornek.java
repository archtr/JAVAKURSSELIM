package Gun27._02_Ornek;

public class Ornek {
    public static void main(String[] args) {
        // 1-Adım :Rectangle isminde ayrı bir dosyada olmak üzere sınıf yazınız.fields: width, length
        // 2-Adım :Çevre bulmak üzere Cevre isminde bir metod yazınız.
        // 3-Adım :Dikdörtgenin alanını bulan Alan isimli bir metod yazınız.
        // 4-Adım :1 tane nesne ye deger vererek metodların sonuçları yazdırınız.

        Rectangle dikDörtgen1=new Rectangle();
        dikDörtgen1.lenght=4;
        dikDörtgen1.width=5;

        dikDörtgen1.alan();
        dikDörtgen1.cevre();

        // extra return gerekseydi main içinde
        int alan=dikDörtgen1.Alan2();
        System.out.println("Alan2 = " +alan);

    }
}
