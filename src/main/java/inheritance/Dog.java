package inheritance;

public class Dog {

    private String name;

    public Dog(String name) {
        this.name = name;
    }

    public void printName() {
        System.out.println("The frogs name is: " +name);
    }

    public void bark() {
        System.out.println("Voff voff!");
    }

}
