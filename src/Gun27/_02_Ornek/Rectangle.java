package Gun27._02_Ornek;

public class Rectangle {
    int width;
    int lenght;

    public void cevre(){
        System.out.println("Çevresi = "+(width+lenght)*2);
    }
    public void alan(){
        System.out.println("Alanı = " +(width*lenght));
    }
    public int Alan2(){
        return (width*lenght);
    }
}
