package Gun04;

public class _03_Ornek1 {
    public static void main(String[] args) {
        // 3 farklı (char,int,boolen) tipi değişken tanımlayınız.
        // değer atayınız ve ekrana yazdırınız.

        int sinifNo=5;
        char subeAdi='B';
        boolean gectiMİ=true;
        String subeAdi2="C";

        System.out.println("sinifNo = " + sinifNo);
        System.out.println("subeAdi = " + subeAdi);
        System.out.println("gectiMİ = " + gectiMİ);

        System.out.println(sinifNo+"-"+subeAdi+":"+gectiMİ); // toplamada içlerinde bir tane string var ise
        // toplama işlemi yan yana birleştirme işlemine dönüşür.

        System.out.println(sinifNo+subeAdi2+":"+gectiMİ);




    }
}
