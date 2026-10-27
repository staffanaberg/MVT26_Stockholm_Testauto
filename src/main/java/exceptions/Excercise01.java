package exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Excercise01 {

    public static void main(String[] args) {
        String[] names = {"Ada", "Beda", "Cålle"};

        //Läs in ett tal som beskriver vilket namn
        //man skall skriva ut i ordningen. Fånga eventuella exceptions

        Scanner scan = new Scanner(System.in);
        try {
            int number = scan.nextInt(); //Integer.parseInt(scan.nextLine());
            System.out.println(names[number]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Not 0-2" +e);
        } catch(InputMismatchException e) {
            System.out.println("Not a number");
        }


    }

}
