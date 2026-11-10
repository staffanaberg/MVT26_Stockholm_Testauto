package assignment;

import java.util.HashMap;

public class Converter {

    private HashMap<String, String> map;

    public Converter() {
        map = new HashMap<>();
        map.put("E", ".");
        map.put(".", "E");
        map.put("H", "....");
        map.put("....", "H");
    }

    public String convert(String text) {
        String myText = "";
        for (int i = 0; i < text.length(); i++) {
            String letter = Character.toString(text.charAt(i));
            myText += map.get(letter) + " ";
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