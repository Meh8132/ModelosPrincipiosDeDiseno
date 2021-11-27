package App;


public class Primate extends Animal {

    @Override
    public String nombre() {
        return "Gorilla";
    }

    @Override
    public int edad() {
        return 40;
    }

    @Override
    public String comida() {
        return "Hervivoro";
    }

    @Override
    public String mover() {
        return "Caminar";
    }
}