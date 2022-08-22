package Gun35._02_Ornek;

public class Main {
    public static void main(String[] args) {

        Daire daire1=new Daire(3);
        System.out.println("daire alanı = "+daire1.getAlan());
        System.out.println("daire çevresi = " +daire1.getCevre());

        Dikdortgen dikdortgen1=new Dikdortgen(5,4);
        System.out.println("dikdörtgen alanı = " +dikdortgen1.getAlan());
        System.out.println("dikdörtgen çevresi = " +dikdortgen1.getCevre());

        Kare kare1=new Kare(4);
        System.out.println("kare alanı = " +kare1.getAlan());
        System.out.println("kare alanı = " +kare1.getCevre());

    }
}
