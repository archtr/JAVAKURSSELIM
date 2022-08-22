package Gun07;

import java.util.Locale;

public class _05_StringToLowerCase {
    public static void main(String[] args) {
        // toLowerCase : stringi küçük harfe çevirir.

        String text="Merhaba Dünya";

        System.out.println("orjinal hali = " + text);  // Merhaba Dünya
        System.out.println("text.toLowerCase() = " + text.toLowerCase()); // merhaba dünya
        System.out.println("text büyük veya küçük harf de olsa me ile başlıyormu ? = "
                + text.toLowerCase().startsWith("me"));


    }
}
