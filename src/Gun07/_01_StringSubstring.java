package Gun07;

public class _01_StringSubstring {
    public static void main(String[] args) {
        // stringin belli bir bölümünü alma işlemini yapar

                // 0123456789012345678
        String s1="Merhaba arkadaşlar";

        String  parca1= s1.substring(2, 6); // 2 nolu indexten 6 ya kadar alır.  6 dahil değildir.
        System.out.println("parca1 = " + parca1);

        System.out.println(" 2.bolum arkadaş = " + s1.substring(8, 15) );

        System.out.println(" 3.bolum arkadaşlar " + s1.substring(8) );
        // verilen yerden başlayarak Stringin sonuna kadar ki kısmı alır.




    }
}
