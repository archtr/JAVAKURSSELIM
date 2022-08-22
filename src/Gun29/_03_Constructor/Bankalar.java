package Gun29._03_Constructor;

public class Bankalar {
    public static void main(String[] args) {
        // Bir banka class ı tanımlayınız.
        // 3 adet field ekleyiniz.(adi, subeSayisi, kurulusYili)
        // 3 adet constructor ekleyin.
        // toString metodu oluşturun.
        // 3 tane nesne oluşturup mainde yazdırınız.

        Banka bnk1=new Banka("Garanti",120,1985);
        Banka bnk2=new Banka("Ziraat",12,1923);
        Banka bnk3=new Banka("Vakıfbank",20,1935);

        System.out.println("bnk1 = " +bnk1);
        System.out.println("bnk2 = " +bnk2);
        System.out.println("bnk3 = " +bnk3);

    }
}
