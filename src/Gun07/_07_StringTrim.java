package Gun07;

public class _07_StringTrim {
    public static void main(String[] args) {
        // trim : stringin başındaki veya sonunda ki boşluk karakterlerini temizler.

        String text="   Merhaba Dünya   ";

        System.out.println("textin orjinal hali = ->" + text +"<-");
        System.out.println("textin trimlenmiş hali = ->" + text.trim() +"<-");


    }
}
