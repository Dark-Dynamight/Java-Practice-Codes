import java.util.HashMap;
import java.util.Map;

public class FindDuplicateCharacters {

    public static void main(String[] murali) {
        String str = "hanuman";
        Map<Character, Integer> map = new HashMap<>();

        for (Character c : str.toCharArray()) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }

        // System.out.println("data :: " + map);
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                // System.out.println(entry.getKey() + " = " + entry.getValue());
                System.out.println(entry.getKey());
            }
        }
    }

}
