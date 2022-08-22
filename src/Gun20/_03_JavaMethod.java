package Gun20;

public class _03_JavaMethod {
    public static void main(String[] args) {
        merhabaYaz();

        ozelmerhabaYaz("İsmet");
        ozelmerhabaYaz("Mehmet");
        ozelmerhabaYaz("Melike");
    }

    public static void merhabaYaz(){
        System.out.println("Merhaba");
    }
    public static void ozelmerhabaYaz(String isim){
        System.out.println("Merhaba "+isim+ " Hoşgeldin");
    }

}
