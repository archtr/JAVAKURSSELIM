package Gun38._01_Soru1;

public class TeslaCarelectric extends Vehicle implements IElectric{


    public TeslaCarelectric(String model, double engine) {
        super(model, engine);
    }

    @Override
    public String changeBattery() {
        return "Batarya ömrü 50 yıldır";
    }

    @Override
    public String drive() {
        return "Auto pilot sürüş özelliği vardır";
    }
}


