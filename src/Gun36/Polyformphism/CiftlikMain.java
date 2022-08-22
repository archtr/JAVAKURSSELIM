package Gun36.Polyformphism;

public class CiftlikMain {
    public static void main(String[] args) {

        Kopek kopek1=new Kopek("karabaş");
        Kedi kedi1=new Kedi("köpük");

        Hayvan kopek2=new Kopek("rodi");
        Hayvan kedi2=new Kedi("tekir");

        kopek1.ses(); // gerçekten köpek
        kopek1.kokladi(); // gerçekten köpek

        kopek2.ses(); // hayvan gibi görünüyor , ama köpek
        ((Kopek)kopek2).kokladi(); // köpek cinsinden veri alabildik
        System.out.println("--------");

        hayvanSes(kopek1);
        hayvanSes(kedi1);

    }
    public static void hayvanSes(Hayvan h){
        h.ses();
    }
}
