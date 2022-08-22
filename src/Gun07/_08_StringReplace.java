package Gun07;

public class _08_StringReplace {
    public static void main(String[] args) {
        // Replace : bir stringin içinde ki istenen karakter(ler)in hepsini
        // verilen yenisi ile değiştirir.

        String text="Merhaba Dünya";
        System.out.println("textin orjinal hali = " + text);
        System.out.println("a ların e olarak değişmiş hali = " + text.replace("a","e"));
        System.out.println("ba -> de = " + text.replace("ba","de"));
        System.out.println("Dünya -> Java = " + text.replace("Dünya","Java"));
        System.out.println("a -> a ları silelim = " + text.replace("a",""));


    }
}
