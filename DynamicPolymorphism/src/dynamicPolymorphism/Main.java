package dynamicPolymorphism;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Polymorphism = many shapes/forms
        // dynamic = depois de compilar (durante a leitura)

        // ex.: Corsa é um : Corsa, mas também é um car, e um vehicle, e um object

        Scanner scanner = new Scanner(System.in);
        Animal animal;

        System.out.println("What animal do you want?");
        System.out.println("( 1 = dog ) or ( 2 = cat ):");
        int choice = scanner.nextInt();

        if (choice == 1) {
            animal = new Dog();
            animal.speak();
        }
        else if (choice == 2) {
            animal = new Cat();
            animal.speak();
        }
        else {
            animal = new Animal();
            System.out.println("that choice was invalid");
            animal.speak();
        }


    }

}