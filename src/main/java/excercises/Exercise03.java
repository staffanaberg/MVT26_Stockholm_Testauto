package excercises;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise03 {

    public static void main(String[] args) {
        //9. Skriv ett program som läser in heltal med Scanner-metoden nextInt().
        // Fånga InputMismatchException om användaren skriver något som inte
        // är ett heltal

        Scanner scan = new Scanner(System.in);
        int[] numbers = new int[5];
        while(true) {
            try {
                System.out.println("Skriv in fem heltal");
                for (int i = 0; i < 5; i++) {
                    int number = scan.nextInt();
                    numbers[i] = number;
                }
                System.out.println("Välj ett index 0-4");
                int index = scan.nextInt();
                System.out.println("Index " + index + " har talet: " + numbers[index]);

            } catch (InputMismatchException e) {
                System.out.println("Du skrev inte in ett heltal " + e);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Du måste ange ett tal från 0-4");
            }
        }

        //10. Läs in fem heltal och lägg dem i en array.
        // Se till att inläsningen pågår tills det att användaren
        // har fyllt i fem heltal. Användaren ska få ett tydligt felmeddelande
        // om den skriver fel.

        //11. Låt användaren välja vilket index de vill se av heltalen.
        // Hantera ArrayIndexOutOfBoundsException.
        // Användaren ska kunna använda denna funktionalitet i all oändlighet.
    }

}
