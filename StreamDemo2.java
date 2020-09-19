package be.intecbrussel.streams;

import java.util.stream.IntStream;

public class StreamDemo2 {

    public static void main(String[] args) {

        IntStream.rangeClosed(1, 50)
                 .filter(e -> e % 2 == 0)
                 .filter(e -> e % 3 == 0)
                 .filter(e -> e > 20)
                 .limit(2)
                 .map(e -> e * 5)
                 .mapToDouble(e -> e / 1.5)
                 .forEach(e -> System.out.println(e));
    }
}
