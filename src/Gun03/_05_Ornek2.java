package Gun03;

public class _05_Ornek2 {
    public static void main(String[] args) {

        // Ornek Soru : yarıçapı(r) verilen bir dairenin çevresini ve alanını bulunuz
        // alan= pi*r*r   çevre = 2*pi*r  pi=3.14

        float PI=3.14F;
        int r=5;

        float cevre= 2*PI*r;
        float alan=PI*r*r;

        System.out.println("alan = " + alan);
        System.out.println("cevre = " + cevre);


    }
}
