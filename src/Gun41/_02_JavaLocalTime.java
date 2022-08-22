package Gun41;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class _02_JavaLocalTime {
    public static void main(String[] args) throws InterruptedException {
        // tarih içermez sadece saat,dak,san,nano san içerir
        LocalTime saat=LocalTime.now();
        System.out.println("saat = " + saat);
        System.out.println("saat = " + saat.getHour());
        System.out.println("saat = " + saat.getMinute());
        System.out.println("saat = " + saat.getSecond());
        System.out.println("saat = " + saat.getNano());

        // kendimize özel format oluşturma
        DateTimeFormatter ozelFormat1=DateTimeFormatter.ofPattern("hh:mm");
        System.out.println("saat = " + saat.format(ozelFormat1));

        // canlı saat
        DateTimeFormatter ozelFormat2=DateTimeFormatter.ofPattern("hh:mm:ss");
        System.out.println("saat = " + saat.format(ozelFormat2));

        while (true){
            saat=LocalTime.now();
            System.out.print("\rsaat = " + saat.format(ozelFormat2));

            Thread.sleep(1000); // 1sn bekleyecek
        }


    }
}
