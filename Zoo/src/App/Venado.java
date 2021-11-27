package App;

public class Venado extends Animal {

    @Override
    public String nombre() {
        return "Venado cola blanca";
    }

    @Override
    public int edad() {
        return 25;
    }

    @Override
    public String comida() {
        return "hervivoro";
    }

    @Override
    public String mover() {
        return "Caminar";
    }
}
