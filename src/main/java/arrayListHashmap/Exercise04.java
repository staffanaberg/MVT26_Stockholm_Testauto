package arrayListHashmap;

import java.util.HashMap;
import java.util.Scanner;

public class Exercise04 {

    public static void main(String[] args) {

        String alfabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String symbols = "!?+#¤%&/()=@£${[]}^¨~<>|;:";
        String[] morse = {".-", "...", "---"};

        HashMap<String, String> map = new HashMap<>();
        for (int i = 0; i < alfabet.length(); i++) {
            String letter = Character.toString(alfabet.charAt(i));
            String symbol = Character.toString(symbols.charAt(i));
            map.put(letter, symbol);
            map.put(symbol, letter);
        }
        //map.put("A", ".-");

        //Låt användaren läsa in ett ord med stora bokstäver


        // och konvertera dem enligt listan i symbols genom
        // att hämta dem en efter en ifrån hashmappen.
        // Du kan använda charAt igen och System.out.print
        // (istället för println) för att skriva ut den konverterade texten

        //Läs in text istället
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();

        String[] words = text.split(" ");

        for(int i=0; i< words.length; i++) {
            System.out.println(words[i]);
        }

        for (int i = 0; i < text.length(); i++) {
            System.out.print(map.get(Character.toString(text.charAt(i))));
        }

    }

}
