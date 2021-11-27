package App;

import java.util.Scanner;

public class Zoo {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Animal[] arrayAnimales = {
            new Aguila(), new Venado(), new Pez(), new Primate(), new Felino()
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
