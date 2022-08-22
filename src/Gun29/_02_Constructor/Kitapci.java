package Gun29._02_Constructor;

public class Kitapci {
    public static void main(String[] args) {
        // Book class yazınız.fields: name,publishYear,autor.
        // 3 adet Consructor ekleyiniz.
        // Kitapların özelliklerini tek bir satırda yazdıran bir metod ekleyiniz.
        // 3 adet kitabı farklı constructor la oluşturup, mainde yazdırınız.


        // 1. ekleme yöntemi
        // 1. Constructor
        BookClass kitap1=new BookClass();
        kitap1.name="Vadide ki zambak";
        kitap1.publishYear=1920;
        kitap1.author="Balzac";

        // 2. ekleme yöntemi
        // 2. Constructor
        BookClass kitap2=new BookClass("Çalı kuşu",1935,"R. N. Güntekin");

        // 3. Constructor
        BookClass kitap3=new BookClass("Sefiller",1913);
        // bilerek eksik bırakıldı


        kitap1.bilgiYazdir();
        System.out.println();
        kitap2.bilgiYazdir();
        System.out.println();
        kitap3.bilgiYazdir();

        // yazdırma için 2. yöntem
        System.out.println("Kitap1 = " +kitap1);
        // zaten herzaman yazacağı zaman toString metodunu arar




    }
}
