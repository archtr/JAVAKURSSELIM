package Gun42.StringIslemleri;

public class _01_StringKarsilastirma {
    public static void main(String[] args) {
        String cumle1="bugün hava çok güzel";
        String cumle2="bugün hava çok güzel";
        String cumle3=new String("bugün hava çok güzel");
        String cumle4=new String("bugün hava çok güzel");

        if (cumle1==cumle2)
            System.out.println("Cumle1 Cumle2 ye eşit");// ilkel tipler için DEĞERLERİ aynı mı ? nesneler için aynı nesne mi
        else
            System.out.println("Cumle1 Cumle2 ye eşit değil");


        if (cumle1.equals(cumle2))
            System.out.println("Cumle1 Cumle2 ye eşit");// ilkel tipler ve nesneler için DEĞERLERİ aynı mı ?
        else
            System.out.println("Cumle1 Cumle2 ye eşit değil");

        // ***** nesneler için sonuçlar *******//

        if (cumle3==cumle4)
            System.out.println("Cumle3 Cumle4 ye eşit");// ilkel tipler için DEĞERLERİ aynı mı ? nesneler için aynı nesne mi
        else
            System.out.println("Cumle3 Cumle4 ye eşit değil");


        if (cumle3.equals(cumle4))
            System.out.println("Cumle3 Cumle4 ye eşit");// ilkel tipler ve nesneler için DEĞERLERİ aynı mı ?
        else
            System.out.println("Cumle3 Cumle4 ye eşit değil");



    }
}
