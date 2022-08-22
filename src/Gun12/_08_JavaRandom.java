package Gun12;

public class _08_JavaRandom {
    public static void main(String[] args) {
        // soru : 0 ile 6 arasında random sayı üreten programı yazınız.

        // Math.random() -> 0.0000 - 0.99999 arası sayı üretir.

        double doubleRandomSayi=Math.random();
        System.out.println("doubleRandomSayi = " +doubleRandomSayi);

        int tamSayi=(int)(doubleRandomSayi * 6); // 0-5 arası veriyor.
        System.out.println("tamSayi = " +tamSayi);

        System.out.println("tamSayi = " +(int)(Math.random()*6));


    }
}
