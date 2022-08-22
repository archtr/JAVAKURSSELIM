package Gun04;

public class _05_Ornek3 {
    public static void main(String[] args) {
        // kişinin ağırlığını double , boyunu int olarak değerler veriniz.
        // ve bir satırda boyunuz ... ve kilonuz ... şeklinde yazdırınız.
        // vücut kitle ındexini de bularak yazdırınız (kg/boy+boy)

        double kilo=74.5;
        int boy=180;

        double kitleIndexi1=kilo/(boy*boy);
        int kitleIndexi2= (int)kilo/(boy*boy);


        System.out.println("boyunuz = " + boy);
        System.out.println("kilonuz = " + kilo);

        System.out.println("kitleIndexi1 = " + kitleIndexi1);
        System.out.println("kitleIndexi2 = " + kitleIndexi2);


    }
}
