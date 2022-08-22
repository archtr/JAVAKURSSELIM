package Gun09;

public class _05_JavaAssigmentOperators {
    public static void main(String[] args) {
        int a=10;
        int b=2;

        a=a+5; // a nın değerini 5 arttırır.
        a+=5;  // bu da aynı , a nın artış değer 5 eşit, aynı.

        a=a-5; // anın değerini 5 azaltır.
        a-=5; // bu da aynı , kısa yazılışı.

        a=a*5; // a nın değerini 5 ile çarpar.
        a*=5;  // bu da aynı.

        a=a/5;  // a nın değerini 5 e böler.
        a/=5;  // bu da aynı.

        // atama operatörleri denir bunlara.

        int x = -12, y = -5;
        int z=x/y;

        System.out.print("Büyük olan Sayı = " +Math.max(x,y));
        System.out.println(z);




    }
}
