package methodOverriding;

public class Main {

    public static void main(String[] args) {
        //method overriding = Declaração de um método em uma class herdeira/filha,
        //					  Que já estava presente na class pai
        //  				  O que resulta na classe filha podendo fazer sua propria implementações
        //                    resumindo: reescrever um método


        Dog dog = new Dog();

        Animal animal = new Animal();

        dog.speak();
        animal.speak();
    }

}