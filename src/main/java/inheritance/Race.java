package inheritance;

public class Race {

    public static void main(String[] args) {

        Car car = new Car();
        car.increaseSpeed(20);
        car.increaseSpeed(30);
        car.showSpeed();
        Bicycle bicycle = new Bicycle();
        bicycle.nbrOfGears(21);
        bicycle.increaseSpeed(2);
        bicycle.showSpeed();

    }
}
