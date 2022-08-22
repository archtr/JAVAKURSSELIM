package Gun19;

public class _06_Soru1 {
    public static void main(String[] args) {
        // 1- String array oluşturun ve elemanları : Apple , Orange , Banana , Pineapple
        // Apple elemanının bu Array'a ait olup olmadığını kontrol edin.
        // Eğer aitse "true" çevirin.

        String[] kelimeler= {"Apple","Orange","Banana","Pineapple"};

        for (int i=0;i<4;i++){
            if (kelimeler[i].contains("Apple")){
                System.out.println("True");break;
            }
            else System.out.println("False");
        }



    }
}
