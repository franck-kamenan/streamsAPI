package be.intecbrussel.streams;

import java.util.stream.IntStream;

public class StreamDemo2 {

    public static void main(String[] args) {

        IntStream.rangeClosed(1, 20)
                 .filter(e -> e % 2 == 0)
                 .filter(e -> e % 3 == 0)
                 .forEach(e -> System.out.println(e));
    }
}
