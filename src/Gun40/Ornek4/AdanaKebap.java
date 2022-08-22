package Gun40.Ornek4;

public class AdanaKebap implements Food {

    @Override
    public String taste() {
        return "Acılı";
    }

    @Override
    public double ucret() {
        return 55;
    }
    public void marinede(){
        System.out.println("Et 24 saat marine edildi");
    }
    public void grill(){
        System.out.println("Odun közünde orta derecede pişirildi");
    }

}
