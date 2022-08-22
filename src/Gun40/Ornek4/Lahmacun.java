package Gun40.Ornek4;

public class Lahmacun implements Food{
    @Override
    public String taste() {
        return "Çıtır hamur üzeri Antep usulü";
    }

    @Override
    public double ucret() {
        return 33;
    }
    public void dough(){
        System.out.println("Çıtır pişmiş Hamur");
    }
    public void addMeat(){
        System.out.println("Baharatlar ile çeşnilenmiş zırh çekimi et");
    }
    public void bake(){
        System.out.println("Odun ateşinde taş fırın da pişirildi");
    }
}
