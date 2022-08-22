package Gun03;

public class _06_ScopeInceleme {
    public static void main(String[] args) {
        int a=5;  // a değeri aşağıdaki parantez bölgesinde geçerli olur
        // çünkü dışardaki içeriye erişebilir
        // {} bu parantezler arası kendine özel bölge oluşturur ve buradaki tanımlanan
        // değişkenler sadece burada geçerli olur. Kullanım amacı karışıklığı azaltmak.


        {
            int b = 5;
            b = 77;
            a=b;
            System.out.println("b = " + b);

        }

        int b=7;
        //System.out.println("b = " + b); b değişkenine sadece özel bölgede erişilebilir
        // bunun da adına SCOPE denir

        System.out.println("a = " + a);

    }
}
