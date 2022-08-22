package Gun38._01_Soru1;

public class ToyotaPriushybrid extends Vehicle implements IElectric,IGas{
    public ToyotaPriushybrid(String model, double engine) {
        super(model, engine);
    }


    @Override
    public String changeBattery() {
        return "Batarya ömrü 50 yıldır";
    }

    @Override
    public String changeOil() {
        return "Bir depo yakıt ile 300km gidebilir";
    }

    @Override
    public String drive() {
        return "Auto pilot sürüş özelliği vardır";
    }
}
