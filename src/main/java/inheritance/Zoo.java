package inheritance;

import java.util.Scanner;

public class Zoo {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Ge grodan ett namn");
        String name = scan.nextLine();
        try {
            System.out.println("Hur gammal är den?");
            int age = Integer.parseInt(scan.nextLine());

            System.out.println("Hur långt hoppar den?");
            int length = Integer.parseInt(scan.nextLine());

            System.out.println("Hur många hopp ska den göra?");
            int numberOfJumps = Integer.parseInt(scan.nextLine());

            Frog frog1 = new Frog(name, age);
            //Frog frog2 = new Frog("Kermit", 25);

            frog1.printName();
            //frog2.printName();

            //frog2.jump(10, 3);
            frog1.jump(length, numberOfJumps);
        } catch (Exception e) {
            System.out.println("Du skrev fel!");
        }


    }

}
