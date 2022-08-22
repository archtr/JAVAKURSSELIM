package Gun33.EnumEk;

public class AylarMain {
    public static void main(String[] args) {

        Aylar ay=Aylar.AGUSTOS;

        switch (ay){
            case SUBAT: System.out.println(28); break;
            case OCAK:
            case MART:
            case MAYIS:
            case TEMMUZ:
            case AGUSTOS:
            case EKIM:
            case ARALIK: System.out.println(31); break;
            case NISAN:
            case HAZIRAN:
            case EYLUL:
            case KASIM: System.out.println(30); break;
        }

        // yeni nesil yöntemler
        System.out.println("ay.ayNo = " +ay.ayNo);
        System.out.println("ay.gunMiktar = " +ay.gunMiktar);
        System.out.println("ay.isim = " +ay.isim);


    }
}
