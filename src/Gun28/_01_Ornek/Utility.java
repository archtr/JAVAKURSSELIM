package Gun28._01_Ornek;

import java.security.SecureRandom;

public class Utility {


    // 2. yöntem : nesneye ait metodlar
    public String getString(int sayi){
        return String.valueOf(sayi);
    }

    public int getInt(String strRakam){
        return Integer.parseInt(strRakam);
    }

    // 3. yöntem : classa ait metodlar
    public static String getString2(int sayi){
        return String.valueOf(sayi);
    }

    public static int getInt2(String strRakam){
        return Integer.parseInt(strRakam);
    }

}
