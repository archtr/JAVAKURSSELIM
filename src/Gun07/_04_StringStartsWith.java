package Gun07;

public class _04_StringStartsWith {
    public static void main(String[] args) {
        // StartsWith : ... ile bitiyor mu ? sonu. boolean olarak döner.

        String text="HCL Teknoloji";

        System.out.println("HC ile başlıyor mu = " + text.startsWith("HC")); // true
        System.out.println("Me ile başlıyor mu = " + text.startsWith("Me"));  // false
        System.out.println("M ile başlıyor mu = " + text.startsWith("M"));  // false
        System.out.println("h ile başlıyor mu = " + text.startsWith("h"));  // false
        System.out.println("hc ile başlıyor mu = " + text.startsWith("hc"));  // false



    }
}
