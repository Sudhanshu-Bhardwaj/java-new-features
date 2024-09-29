package example.stream;

import java.util.HashMap;
import java.util.Map;

public class CountCharsInString {
    public static void main(String[] args) {
        String s = "lggbbbad";
        Map<Character, Integer> count = new HashMap<>();

        for(char c : s.toCharArray()) {
            count.put(c, count.getOrDefault(c, 0) + 1);
        }

        for(Map.Entry<Character, Integer> entry: count.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}
