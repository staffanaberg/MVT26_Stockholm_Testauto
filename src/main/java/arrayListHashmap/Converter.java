package arrayListHashmap;

import java.util.HashMap;

public class Converter {

    public int toAge(String name) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("staffan", 44);
        map.put("johan", 53);
        map.put("charlie", 29);
        map.put("bo", 40);

        return map.get(name.toLowerCase());
    }

}
