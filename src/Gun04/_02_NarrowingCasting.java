package Gun04;

public class _02_NarrowingCasting {
    public static void main(String[] args) {
        double oran=3.2;
        int sayi=5;

        sayi=(int) oran;  // double tipindeki 3.2 değeri int tipine atıldı.
        // bu tip dönüşüme daraltma yönünde olduğundan Narrowing Casting denir.
        // diğer adıyla ekstra işlem yapıldığından manuel dönüşüm denir.

        System.out.println("sayi = " + sayi);

    }
}
