package inheritance;

public class Frog {
    private String name;
    private int age;

    public Frog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void printName() {
        System.out.println("The frogs name is: " +name);
    }

    public void jump(int length, int numberOfJumps) {
        for(int i=0; i<numberOfJumps; i++) {
            System.out.println("Wee!");
        }
        System.out.println("The frog jumps! " + (length*numberOfJumps)*(100-age)/100 +" cm");
    }

}
