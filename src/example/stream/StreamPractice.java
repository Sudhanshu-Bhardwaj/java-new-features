package example.stream;

import java.util.List;

public class StreamPractice {
    public static void main(String[] args) {
        List<Integer> l1 = List.of(5, 8, 7, 9, 10, 4, 15, 2, 27, 1, 3);

        List<Integer> evenList = l1.stream()
                .filter(e -> e % 2 == 0)
                .sorted()
                .toList();

        System.out.println(evenList);
    }
}
