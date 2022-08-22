package Gun39.Ornek2;

public class Geometri {
    public static void main(String[] args) {
        
        Dikdortgen dk1=new Dikdortgen(5,4);
        dk1.setName("Dikdörtgen");
        System.out.println("dk1 = " + dk1);
        dk1.ciz();
        
        Daire dr1=new Daire(5);
        dr1.setName("Yeni Daire");
        System.out.println("dr1 = " + dr1);
        dr1.ciz();


        
        
    }
}
