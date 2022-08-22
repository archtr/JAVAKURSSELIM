package Gun33._02_Encapsulation;

public class ArabaMain {
    public static void main(String[] args) {

        Araba araba1=new Araba();
        araba1.setRenk("Kırmızı");
        araba1.setModel("Sedan");
        araba1.setMotorHacmi(1800);
        araba1.setKapiSayisi(4);

        System.out.println("araba1 = " +araba1);
        System.out.println("Model = " +araba1.getModel());

        // KURAL : Genel yazılım kuralıdır
        // bütün değişkenler private yapılır
        // yani kapsülleme ile kullanılır
        // Eğer gerekiyorsa private kaldırılır



    }
}
