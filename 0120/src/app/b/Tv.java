package app.b;

public class Tv{
    String model;
    int inch;

    public Tv(String model, int inch) {
        this.model = model;
        this.inch = inch;
    }

    @Override
    public String toString() {
        return "Tv [inch=" + inch + ", model=" + model + "]";
    }


}