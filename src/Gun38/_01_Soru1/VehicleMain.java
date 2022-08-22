package Gun38._01_Soru1;

import java.util.ArrayList;

public class VehicleMain {
    public static void main(String[] args) {

        TeslaCarelectric tesla1=new TeslaCarelectric("Model 5",310);
        ToyotaPriushybrid toyota1=new ToyotaPriushybrid("Prius",1200);
        Busdiesel bus1=new Busdiesel("IVECO",4500);


        ArrayList<Vehicle> arabalar=new ArrayList<>();
        arabalar.add(tesla1);
        arabalar.add(toyota1);
        arabalar.add(bus1);
        for (Vehicle v:arabalar
             ) {
            System.out.println("-------------------------");
            System.out.println("Class name = " + v.getClass().getSimpleName());
            System.out.println("Model = " + v.getModel());
            System.out.println("Engine = " + v.getEngine());
            
            if (v instanceof TeslaCarelectric){
                System.out.println("Batarya = " + ((TeslaCarelectric) v).changeBattery());
                System.out.println("drive = " + ((TeslaCarelectric) v).drive());
            }
            if (v instanceof ToyotaPriushybrid){
                System.out.println("v = " + ((ToyotaPriushybrid) v).changeBattery());
                System.out.println("Yakıt = " + ((ToyotaPriushybrid) v).changeOil());
                System.out.println("(drive = " + ((ToyotaPriushybrid) v).drive());
            }
            if (v instanceof Busdiesel){
                System.out.println("Yakıt = " + ((Busdiesel) v).changeDiesel());
                System.out.println("drive = " + ((Busdiesel) v).drive());
            }
        }
    }
}
