import java.util.Scanner;

public class Zoo {


    static  abstract class Animal {

        abstract String nombre();

        abstract int edad();

        abstract String comida();

        abstract String mover();
    }

    static class Aguila extends Animal {
        @Override
        String nombre() {
            return "Aguila Real";
        }

        @Override
        int edad() {
            return 20;
        }

        @Override
        String comida() {
            return "Carnivoro";
        }

        @Override
        String mover() {
            return "Volar";
        }
    }

    static class Venado extends Animal {

        @Override
        String nombre() {
            return "Venado cola blanca";
        }

        @Override
        int edad() {
            return 25;
        }

        @Override
        String comida() {
            return "hervivoro";
        }

        @Override
        String mover() {
            return "Caminar";
        }
    }

    static class pez extends Animal {

        @Override
        String nombre() {
            return "Pez Payaso";
        }

        @Override
        int edad() {
            return 10;
        }

        @Override
        String comida() {
            return "Omnivoros";
        }

        @Override
        String mover() {
            return "Nadar";
        }
    }

    static class primate extends Animal {

        @Override
        String nombre() {
            return "Gorilla";
        }

        @Override
        int edad() {
            return 40;
        }

        @Override
        String comida() {
            return "Hervivoro";
        }

        @Override
        String mover() {
            return "Caminar";
        }
    }

    static class felino extends Animal {

        @Override
        String nombre() {
            return "Pantera";
        }

        @Override
        int edad() {
            return 20;
        }

        @Override
        String comida() {
            return "Carnivoro";
        }

        @Override
        String mover() {
            return "Caminar";
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Animal[] arrayAnimales = {
            new Aguila(), new Venado(), new pez(), new primate(), new felino()
        };

        System.out.println("Ingresar el numero de la opcion: ");

        for (int i = 0; i < arrayAnimales.length; i++) {
            System.out.println( i + 1 +". " + arrayAnimales[i].nombre());
            if (i == (arrayAnimales.length - 1)) {
                System.out.println(arrayAnimales.length + 1 + ". Imprimir todos");
            }
        }

        System.out.println("Opcion: ");

        int menu = input.nextInt();


        if (menu != arrayAnimales.length + 1 ) {
            imprimirAnimal(arrayAnimales[menu - 1]);
        } else {
            for (Animal animal : arrayAnimales) {
                imprimirAnimal(animal);
                System.out.println("\n");
            }
        }
    }

    public static void imprimirAnimal(Animal animal) {
        System.out.println("Animal: " + animal.nombre());
        System.out.println("Logevidad: " + animal.edad() + " años");
        System.out.println("Alimentacion: " + animal.comida());
        System.out.println("Tipo de desplazamiento: " + animal.mover());
    }
}
