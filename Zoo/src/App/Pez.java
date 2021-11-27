package App;

public class Pez extends Animal {

    @Override
    public String nombre() {
        return "Pez Payaso";
    }

    @Override
    public int edad() {
        return 10;
    }

    @Override
    public String comida() {
        return "Omnivoros";
    }

    @Override
    public String mover() {
        return "Nadar";
    }
}