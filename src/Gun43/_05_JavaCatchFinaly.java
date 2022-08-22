package Gun43;

public class _05_JavaCatchFinaly {
    public static void main(String[] args) {

        long startTime=0;
        String str="";

        try {
            startTime=System.currentTimeMillis();
        System.out.println("Hatadan önceki nokta");
        char ilkHarf=str.charAt(0);
        System.out.println("Hatadan sonra ki nokta");
        }
        catch (Exception hata){
            System.out.println("catch bloğu çalıştı");
        }
        finally { // try-catch in finali
            long gecenSure=System.currentTimeMillis()-startTime;
            System.out.println("gecenSure = " + gecenSure);
            System.out.println("try-catc bloğuyla ilgili son yapılacaklar");
            // hata olsun veya olmasın çalışacak final bölümü
            // herzaman çalışır
            // kullanım sebebi: try catch in içinde yapılmış
            // işlemlerde arta kalan kapama gibi bu bölüme ait işlemler
            // yapılarak kod düzeni sağlanmış olur
        }
        System.out.println("try-catc bloğundan sonra çalışan kısım");

    }
}
