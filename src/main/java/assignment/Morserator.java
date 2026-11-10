package assignment;

import java.util.Scanner;

public class Morserator {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Converter converter = new Converter();
        System.out.println("Skriv in morsekod");
        String morse1 = scan.nextLine();
        String text1 = converter.convertMorse(morse1);
        System.out.println(text1);

        System.out.println("Skriv in engelska");
        String text2 = scan.nextLine();
        String morse2 = converter.convert(text2);
        System.out.println(morse2);

    }

}
