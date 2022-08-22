package Gun09;

public class _02_JavaArithmeticOperators {
    public static void main(String[] args) {
        int sayac=0;

        sayac=sayac+1; // sayacın değerini 1 arttırır. sayaç=1 olur.
        sayac++; // sayacın değerini 1 arttırır. sayaç=2 olur.
        ++sayac ; // sayacın değerini 1 arttırır. sayaç=3 olur.

        sayac=sayac-1; // sayacın değerini 1 azaltır. sayaç=2 olur.
        sayac--; // sayacın değerini 1 azaltır. sayaç=1 olur.
        --sayac; // sayacın değerini 1 azaltır. sayaç=0 olur.

        int sonuc=0;
        sonuc=sayac++; // önce işlem yapılır, sonra sayacın değeri 1 arttırılır.
                       // bu duruma göre sonuc=sayac ; sayac=sayac+1; olur
                       // sonuc=0 sayac=1
        sayac=0;
        sonuc = ++sayac; // önce ++ (arttırma) işlemi yapılır , sonra diğer işleme geçilir.
                         // sayac=sayac+1;  sonuc=sayac;








    }
}
