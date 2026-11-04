package arrayListHashmap;

import java.util.HashMap;
import java.util.Scanner;

public class Exercise03 {

    public static void main(String[] args) {
        //Namn och ålder i en HashMap
        //Staffan - 44
        //String  - Integer
        Converter converter = new Converter();

        //charlie, CHARLIE, ChARliE
        Scanner scan = new Scanner(System.in);
        System.out.println("Skriv ett namn för att ta reda på åldern");
        String name = scan.nextLine();

        System.out.println(name +" är " +converter.toAge(name) +" år gammal");
    }

}
