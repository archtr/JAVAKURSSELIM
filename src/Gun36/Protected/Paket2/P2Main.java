package Gun36.Protected.Paket2;

import Gun36.Protected.Paket1.P1Hayvan;

public class P2Main {
    public static void main(String[] args) {
        P1Hayvan h2=new P1Hayvan();
        h2.Ad="sarı kedi";
        // h2.yas diğer paketten ulaşılamaz
        // h2.cinsi  korumalı durumda sadece P1Hayvan içerisinden ulaşılabilir , yani extend yapılarak


    }
}
