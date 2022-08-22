package Gun41;

import org.omg.DynamicAny.DynArray;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class _01_JavaLocalDate {
    public static void main(String[] args) {
        // LocalDate sadece gün,ay,yıl bilgisi tutar

        LocalDate tarih=LocalDate.now();
        System.out.println("tarih = " + tarih);
        System.out.println("tarih.getYear() = " + tarih.getYear());
        System.out.println("tarih.getMonth() = " + tarih.getMonth());
        System.out.println("tarih.getMonthValue() = " + tarih.getMonthValue());
        System.out.println("tarih.getDayOfMonth() = " + tarih.getDayOfMonth());
        System.out.println("tarih.getDayOfYear() = " + tarih.getDayOfYear());
        System.out.println("tarih.getDayOfWeek() = " + tarih.getDayOfWeek());
        System.out.println("tarih.getDayOfWeek().getValue() = " + tarih.getDayOfWeek().getValue());

        System.out.println("tarih.format(DateTimeFormatter.ISO_DATE) = " + tarih.format(DateTimeFormatter.ISO_DATE));
        // isimleri locale göre yazıyor
        System.out.println("tarih.format(short) = " + tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT)));
        System.out.println("tarih.format(medium) = " + tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)));
        System.out.println("tarih.format(long) = " + tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG)));
        System.out.println("tarih.format(full) = " + tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)));
        // localdeki saati aldım Almanyaya göre gösterdim
        System.out.println("Full locale.Germany = " +
                tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).withLocale(Locale.GERMANY)));

        Locale[] kullanilabilirlokaller=Locale.getAvailableLocales();
        for (Locale l:kullanilabilirlokaller
             ) {
            if (l.getDisplayCountry().toLowerCase().contains("new"))
                System.out.println("l.getDisplayCountry()+l = " + l.getDisplayCountry()+" "+l+" "+l.getDisplayLanguage());
        }
        // lokaldeki tarih bilgisi alındı ve zelanda ca ya göre gösterildi
        Locale lokalyeniZelanda=new Locale("en","NZ");
        System.out.println(" = " +tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).withLocale(lokalyeniZelanda)));

        // istediğim formatta gösterim
        System.out.println("tarih = " + tarih);

        DateTimeFormatter ozelFormat1= DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("tarih özel format1 = " + tarih.format(ozelFormat1));

        DateTimeFormatter ozelFormat2= DateTimeFormatter.ofPattern("dd.MM.yyyy");
        System.out.println("tarih özel format2 = " + tarih.format(ozelFormat2));

        DateTimeFormatter ozelFormat3= DateTimeFormatter.ofPattern("EEEE dd/MM/yyyy");
        System.out.println("tarih özel format3 = " + tarih.format(ozelFormat3));

        // Kendimiz bir tarihi nasıl set ederiz , oluşturabiliriz , örn int sayi=5;
        LocalDate tarih1=LocalDate.of(2020,6,1);
        LocalDate tarih2=LocalDate.of(2021, Month.DECEMBER,6);
        System.out.println("tarih1 = " + tarih1.format(ozelFormat2));







    }
}
