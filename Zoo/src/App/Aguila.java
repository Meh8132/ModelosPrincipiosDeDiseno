package App;

public class Aguila extends Animal {
    @Override
    public String nombre() {
        return "Aguila Real";
    }

    @Override
    public int edad() {
        return 20;
    }

    @Override
    public String comida() {
        return "Carnivoro";
    }

    @Override
    public String mover() {
        return "Volar";
    }
}
