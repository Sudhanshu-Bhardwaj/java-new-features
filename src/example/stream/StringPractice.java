package example.stream;

import java.util.List;

public class StringPractice {
    public static void main(String[] args) {
        List<String> list = List.of("Banana", "Orange", "Mango", "Apple", "Grapes", "Watermelon");

        String s1 = list.stream()
                .map(String::toLowerCase)
                .filter(s -> s.startsWith("b"))
                .findFirst()
                .orElse("Not Found");

        System.out.println(s1);
    }
}
