package Gun43;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class _07_JavaCheckedAndUncheckedException {
    public static void main(String[] args) throws FileNotFoundException {
        // checked ve unchecked exception
        // java derki yani yazılımcı bıraktığı hatalara unchecked exception
        // ama öyle komutlar var ki bana ait : bunları hata kontrolü yapmadan
        // yani try-catch e almadan kullanmana izin VERMEM. bu gibi hata durumlarına
        // CHECKED yani kontrol ettiğim hatalar denir

        FileInputStream file=new FileInputStream("liste.txt");
        // bu komut dosya okuma işlemini başlatır.dosyayı açar
        dosyaAc();
    }
    public static void dosyaAc() throws FileNotFoundException {
        FileInputStream file=new FileInputStream("liste.txt");
    }
}
