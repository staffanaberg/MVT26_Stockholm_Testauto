package arrayListHashmap;

import java.util.ArrayList;
import java.util.Scanner;

public class Excercise02 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        ArrayList<String> names = new ArrayList<>();
        System.out.println("Skriv ett namn som sparas i vår lista");
        String name = scan.nextLine();

        while (!name.equals("stop")) {
            names.add(name);

            System.out.println("Skriv ett namn som sparas i vår lista");
            name = scan.nextLine();
        }

        System.out.println("Skriv över med ett nytt namn på första platsen i listan");
        name = scan.nextLine();
        names.set(0, name);

        String first = names.get(0);
        String last = names.get(names.size()-1);

        names.set(0, last);
        names.set(names.size()-1, first);

        for(int i=0; i<names.size(); i++) {
            System.out.println(names.get(i));
        }

    }

}
