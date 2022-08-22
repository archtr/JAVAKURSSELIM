package Gun41;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Set;

public class _04_ZonedDateTime {
    public static void main(String[] args) {
        // başka zaman bölgelerinin saat dilimlerini alma
        ZonedDateTime zdt=ZonedDateTime.now();
        // şuanda ki bölgenin zamanını verdi yani lokal zaman
        System.out.println("zdt = " + zdt);

        // ZonedDateTime zdtIstanbul=ZonedDateTime.now(ZoneId);
           Set<String > zamanBolgeleri=ZoneId.getAvailableZoneIds();
        for (String z:zamanBolgeleri
             ) {
            if (z.toLowerCase().contains("stan"))
                System.out.println("z = " + z);
        }

        // europe / istanbul asia/istanbul
        // şimdi bu stringden bir zoneıd oluşturalım

        ZoneId zoneLon=ZoneId.of("Europe/London");
        ZonedDateTime zdtLon=ZonedDateTime.now(zoneLon);
        System.out.println("zdtLon = " + zdtLon);

        DateTimeFormatter gosterimSablonu=DateTimeFormatter.ofPattern("EEEE dd.MM.yyyy HH:mm");
        System.out.println("zdt = " + zdtLon.format(gosterimSablonu));
    }
}
