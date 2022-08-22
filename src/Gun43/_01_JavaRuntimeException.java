package Gun43;

public class _01_JavaRuntimeException {
    public static void main(String[] args) {

        System.out.println("program çalıştı");
        String kelime="";
        kelime.charAt(3);
        System.out.println("program bitti");

        // daha çalışmadan önce oluşmuş eksikliklerden kaynaklı hatalara
        // derleme zamanı yani COMPILE ERROR , Exception diyoruz

        // program çalıştıktan sonra çalışma zamanı içerisindeki hatalara
        // çalışma zamanı yani RUNTİME ERROR ,Exception diyoruz


    }
}
