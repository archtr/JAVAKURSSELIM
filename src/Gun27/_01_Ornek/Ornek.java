package Gun27._01_Ornek;

public class Ornek {
    public static void main(String[] args) {
        // 1- Adım : Person isimli bir class tanımlayınız : name , surname , age
        // 2- Adım : mainde 2 tane bu sınıftan nesne oluşturup değer atayınız
        // 3- Adım : bu değerleri yazdırınız
        // 4- Adım : getBirthYear isiminde Person a ait bir method yazınız
        // çalıştığında kişinin doğum yılını versin
        // 5- Adım : getInitials isminde kişiniz adının ilk harfi , soyadının ilk harfi
        // şeklinde (Büyük Harf) veren metodu yazınız. örnek ahmet demir : A.D.



        Person kisi1=new Person();
        kisi1.name="Hatice";
        kisi1.surName="Namlı";
        kisi1.age=20;

        Person kisi2=new Person();
        kisi2.name="Vasif";
        kisi2.surName="Zeynalov";
        kisi2.age=25;

        // 1. yöntem
        System.out.println("Kişi 1 = " +kisi1.name);
        System.out.println("Kişi 1 = " +kisi1.surName);
        System.out.println("Kişi 1 = " +kisi1.age);

        System.out.println("Kişi 2 = " +kisi2.name);
        System.out.println("Kişi 2 = " +kisi2.surName);
        System.out.println("Kişi 2 = " +kisi2.age);

        System.out.println();
        // 2. yöntem
        BilgiYazdir(kisi1);
        BilgiYazdir(kisi2);

        System.out.println();
        // 3. yöntem
        kisi1.BilgiYazdir();
        kisi2.BilgiYazdir();

        System.out.println();
        kisi1.getBirthYear();
        kisi2.getBirthYear();

        System.out.println();
        kisi1.getInitials();
        kisi2.getInitials();




    }
    public static void BilgiYazdir(Person kisi){
        System.out.println("Kişi  = " +kisi.name);
        System.out.println("Kişi  = " +kisi.surName);
        System.out.println("Kişi  = " +kisi.age);
    }
}

