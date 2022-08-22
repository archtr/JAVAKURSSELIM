package Gun38._01_Soru1;

public class Busdiesel extends Vehicle implements IDiesel{
    public Busdiesel(String model, double engine) {
        super(model, engine);
    }

    @Override
    public String changeDiesel() {
        return "15000 km";
    }

    @Override
    public String drive() {
        return "Auto pilot sürüş özelliği yoktur";
    }
}

