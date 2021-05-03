package interFace;

public class Main {

    public static void main(String[] args) {
        // interface = template que pode ser atribuido a uma class
        //			   similar a um inheritance, mas especifica o que a class deve fazer
        // 			   classes podem aplicar mais de uma interface, inheritance está limitada a um super

		/*Rabbit rabbit = new Rabbit();
		Hawk hawk = new Hawk();

		rabbit.flee();
		hawk.hunt();*/

        Fish fish = new Fish();
        fish.hunt();
        fish.flee();

    }

}