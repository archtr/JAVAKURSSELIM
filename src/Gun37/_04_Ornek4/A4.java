package Gun37._04_Ornek4;

public class A4 implements IGosterir,IYazdirir{
    @Override
    public void goster() {
        System.out.println("Gösterdi");
    }

    @Override
    public void yaz() {
        System.out.println("Yazdırdı");
    }
}
