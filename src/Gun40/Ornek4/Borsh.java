package Gun40.Ornek4;

public class Borsh implements Food{
    @Override
    public String taste() {
        return "Denüşük bir tadı var";
    }

    @Override
    public double ucret() {
        return 33;
    }
    public void boil(){
        System.out.println("5 saat pişirildi");
    }
    public void eatTomorrow(){
        System.out.println("Isıtıp afiyetle yiyebilirsiniz");
    }
}
