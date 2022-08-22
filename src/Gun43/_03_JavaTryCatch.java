package Gun43;

import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;

public class _03_JavaTryCatch {
    public static void main(String[] args) {
        try{ // dene , hatanın başladığı yerin üstüne konur
        System.out.println("program başladı");
        LocalDate tarih=LocalDate.of(2018, Month.JUNE,40);
        System.out.println("işlem tamam");
        } // hata olduğu zaman programı kırma
        catch (Exception hata) // hata isimli değişkende oluşan  hataların bilgisi atanıyor
        {
            System.out.println("şu hata oldu = " +hata.getMessage());
            // hatayı kendine mail att: gelen datayı ve hatayı
            // veri tabanının kalıcı yerine yaz
        }
        System.out.println("program çalışmaya devam etti");
        System.out.println("program bitti");

        try{
        // java çalışmaya devam

        } // anlamadığın yer mi oldu ? kırılmadan devam
        catch (Exception hata){
            // hatanın sebebini anla
            // gereken videoları tekrar izle
            // arkadaşlarına sonra mentöre sonra hocaya mutlaka sor
            // öğren ve kırılmadan devam et
        }

        for (int i=0;i<10;i++){
            Scanner oku=new Scanner(System.in);
            try {
                System.out.print("1. sayıyı giriniz = ");
                int sayi1= oku.nextInt();
                System.out.print("2. sayıyı giriniz = ");
                int sayi2= oku.nextInt();
                System.out.println("bölüm = "+(sayi1/sayi2));
            }
            catch (Exception hata){
                System.out.println();
            }
        }

    }
}
