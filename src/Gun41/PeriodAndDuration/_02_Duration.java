package Gun41.PeriodAndDuration;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class _02_Duration {
    public static void main(String[] args) {
        // Local time ve Local DateTime Lar için kullanılır
        // ikisinin arasında ki farkı gösterir
        LocalTime geceYarisi=LocalTime.of(0,0);
        LocalTime ogleVakti=LocalTime.of(13,3,2);
        
        Duration fark=Duration.between(geceYarisi,ogleVakti);

        System.out.println("fark = " + fark);
        System.out.println("fark.toHours() = " + fark.toHours());// farkın toplam saat hali
        System.out.println("fark.toMinutes() = " + fark.toMinutes());// farkın toplam dakika hali
        System.out.println("fark.toMillis() = " + fark.toMillis());// farkın toplam milisaniye hali

        // LocalDateTime ***2 zaman farkı***
        LocalDateTime from= LocalDateTime.of(2020,10,4,10,20,55);
        LocalDateTime to= LocalDateTime.of(2020,11,15,11,21,56);
        Duration farkzaman=Duration.between(from,to);
        System.out.println("farkzaman = " + farkzaman);
        System.out.println("farkzaman.toDays() = " + farkzaman.toDays());
        System.out.println("farkzaman.toHours() = " + farkzaman.toHours());
        System.out.println("farkzaman.toMinutes() = " + farkzaman.toMinutes());
        System.out.println("farkzaman.toMillis() = " + farkzaman.toMillis());
    }
}
