package Gun07;

public class _06_StringUpperCase {
    public static void main(String[] args) {
        // To Upper Case :  stringi büyük harfe çevirir.

        String text="Merhaba Dünya";

        System.out.println("orjinal hali = " + text); // Merhaba Dünya
        System.out.println("text in büyük hali = " + text.toUpperCase()); // MERHABA DÜNYA

        // büyük veya küçük harf farketmeksizin ya ile bitiyor mu ?

        System.out.println("sonuç = "+ text.toUpperCase().endsWith("YA") ); // true




    }
}
