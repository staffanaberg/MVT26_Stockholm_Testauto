package assignment;

import java.util.HashMap;

public class Converter {
    public String convert(String text) {
        HashMap<String, String> map = new HashMap<>();
        map.put("E", ".");
        map.put("H", "....");

        String myText = "";
        for(int i=0;i<text.length();i++) {
            String letter = Character.toString(text.charAt(i));
            myText += map.get(letter) + " ";
        }

        return myText.trim();
    }
}
