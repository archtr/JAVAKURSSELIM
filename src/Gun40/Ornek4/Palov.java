package Gun40.Ornek4;

public class Palov implements Food{
    @Override
    public String taste() {
        return "Harika osmancık pirinci ile hazırlanmış pilav";
    }

    @Override
    public double ucret() {
        return 44;
    }
    public void fry(){
        System.out.println("Tereyağ ile kavrulmuştur");
    }
    public void boil(){
        System.out.println("Kısık ateşte suyunu çekene kadar pişirilmiştir");
    }
}
