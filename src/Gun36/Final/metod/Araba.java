package Gun36.Final.metod;

public class Araba extends Tasit{

    private String renk;
    public Araba(String model) {
        super(model);
        setRenk(renk);
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public void arabaYazdir(){
        System.out.println("renk = " +renk);
    }

    // @Override
    // public String toString() { // miras alınan classtaki final metodları değiştiremeyiz
       // return super.toString();
    // }


}
