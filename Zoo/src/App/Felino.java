package App;

public class Felino extends Animal {

    @Override
    public String nombre() {
        return "Pantera";
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
        return "Caminar";
    }
}
