package Gun44;

public class OCAsoruları6 {
    public static void main(String[] args) {

        int sayi=5; // short,byte, int , long , float , double ,char , boolean primitive(basit) tipler
        Integer rakam=5; // nesne veri tipleri class , hafızada daha fazla yer kaplıyor
        rakam.toString(); // stringe çeviriyor
        String.valueOf(sayi); // stringe çeviriyor

        // referans tipler. adresi olan tipler

        int[] dizi1={1,2,3};
        int[] dizi2={4,5};
        dizi1=dizi2;
        dizi2[0]=56;
        System.out.println("dizi1 = " + dizi1[0]);
        System.out.println("dizi2 = " + dizi2[0]);
        dizi1[0]=86;
        System.out.println("dizi1 = " + dizi1[0]);
        System.out.println("dizi2 = " + dizi2[0]);

        // string tiplerin durumu farklı: referans tip
        String isim="ismet";
        String ad="mehmet";
        isim=ad;
        isim="ali"; // yeni oluşturduğu için herzaman farklı oluyor
        System.out.println("ad = " + ad);
        System.out.println("isim = " + isim);
        ad.replace("e","a");
        System.out.println("ad = " + ad);
        ad="mahmet"; // yeniden oluşturma , çünkü eski değerde değişiklik yapamıyor



    }
}
