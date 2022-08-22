package Gun43;

public class _04_JavaTryCatch {
    public static void main(String[] args) {
        System.out.println("program başladı");
        String  str="";
        int a=5;
        int b=0;
        int c=0;

        try {
            System.out.println("1. adım");
            char ilkHarf =str.charAt(0); // ilk hatayı bulduğunda break yapıp uygun catche gider
            System.out.println("2. adım");
            c=a/b; // sıra buraya gelene kadar hata yoksa burda ki hatayı bulur ve uygun catche gider
            System.out.println("3. adım");
        }
        catch (StringIndexOutOfBoundsException hata){ // beklenilen hata
            System.out.println("kelime boş olduğu için harf alınamadı");
        }
        catch (ArithmeticException hata){ // beklenilen hata
            System.out.println("sayı sıfıra bölünemez");
        }
        catch (Exception hata){
            System.out.println(hata.getMessage()); // beklenmeyenler için genel hata alır ve mesaj atar
        }
        System.out.println("program sonu");

    }
}
