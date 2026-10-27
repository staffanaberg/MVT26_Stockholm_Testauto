package inheritance;

public class Bicycle extends Vehicle {

    private int nbr;

    public void nbrOfGears(int nbr) {
        this.nbr = nbr;
    }

    public void increaseSpeed(int force) {
        speed += force*nbr;
    }

}
