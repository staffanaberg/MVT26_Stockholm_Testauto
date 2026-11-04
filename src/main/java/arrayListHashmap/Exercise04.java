package arrayListHashmap;

import java.util.HashMap;

public class Exercise04 {

    public static void main(String[] args) {

        String alfabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String symbols = "!?+#¤%&/()=@£${[]}^¨~<>|;:";

        HashMap<String, String> map = new HashMap<>();
        for(int i=0; i<alfabet.length(); i++) {
            String letter = Character.toString(alfabet.charAt(i));
            String symbol = Character.toString(symbols.charAt(i));
            map.put(letter, symbol);
            map.put(symbol, letter);
        }

        //stoppa in A och få ut ! från vår HashMap
        System.out.print(map.get("A"));
        System.out.print(map.get("Z"));
        System.out.print(map.get("M"));
        System.out.println(map.get("Q"));
        System.out.print(map.get("!"));
        System.out.print(map.get(":"));
        System.out.print(map.get("£"));
        System.out.print(map.get("]"));

    }

}
