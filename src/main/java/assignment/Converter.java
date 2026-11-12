package assignment;

import java.util.HashMap;
import java.util.Objects;

public class Converter {

    private HashMap<String, String> map;

    public Converter() {
        String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String[] morseCodes = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
        map = new HashMap<>();

        for(int i=0; i<letters.length(); i++) {
            String letter = Character.toString(letters.charAt(i));
            String morseCode = morseCodes[i];

            map.put(letter, morseCode);
            map.put(morseCode, letter);
        }
    }

    /*public String convert(String text) {
        //Om texten är på engelska
        if(text.equals("E")) {
            return convertEnglish(text);
        } else {
            return convertMorse(text);
        }

    }*/


    public String convert(String text) {
        String myText = "";

        text = text.trim();
        //Om text är tom
        if (text.isEmpty()) {
            myText = "No input";
        }

        for (int i = 0; i < text.length(); i++) {
            String letter = Character.toString(text.charAt(i));
            String morse = map.get(letter);

            if (morse == null) {
                return "Invalid input";
            } else {
                myText += morse + " ";
            }
        }

        return myText.trim();
    }

    public String convertMorse(String text) {

        String myText = "";

        String[] texts = text.split(" ");
        for (int i = 0; i < texts.length; i++) {
            myText += map.get(texts[i]);
        }

        return myText;
    }
}