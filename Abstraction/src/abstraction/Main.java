package abstraction;

public class Main {

    public static void main(String[] args) {

        Car car = new Car();
        Bicycle bicycle = new Bicycle();


        car.go();
        bicycle.go();

        car.stop();
        bicycle.stop();



    }
}
