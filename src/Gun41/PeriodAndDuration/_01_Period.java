package Gun41.PeriodAndDuration;

import java.time.LocalDate;
import java.time.Period;

public class _01_Period {
    public static void main(String[] args) {
        // 2 tarih arasında ki farkı gösterir
        // Local Date ler için kullanılır
        LocalDate dogumTarihi=LocalDate.of(1984,9,22);
        LocalDate buGun=LocalDate.now();
        Period fark=Period.between(dogumTarihi,buGun);
        System.out.println("fark = " + fark);
        System.out.println("fark.getYears() = " + fark.getYears());
        System.out.println("fark.getMonths() = " + fark.getMonths());
        System.out.println("fark.getDays() = " + fark.getDays());

        //*******************//
        Period period3Gun=Period.ofDays(3);
        Period period3Ay=Period.ofMonths(3);

        LocalDate ucGunSonra=buGun.plus(period3Gun);
        LocalDate ucAySonra=buGun.plus(period3Ay);

        System.out.println("ucGunSonra = " + ucGunSonra);
        System.out.println("ucAySonra = " + ucAySonra);

        // Örnek kursun süresi
        LocalDate kursunBaslangici=LocalDate.of(2022,4,18);
        Period kursSure=Period.ofMonths(6);
        LocalDate kursBitis=kursunBaslangici.plus(kursSure);
        System.out.println("kursBitis = " + kursBitis);
        System.out.println("kursBitis.getDayOfWeek() = " + kursBitis.getDayOfWeek());
        Period kalanGun=Period.between(buGun,kursBitis);
        System.out.println("kalanGun = " + kalanGun);


    }
}
