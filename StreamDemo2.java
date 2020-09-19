package be.intecbrussel.streams;

import java.util.stream.IntStream;

public class StreamDemo2 {

    public static void main(String[] args) {

        IntStream.rangeClosed(0, 10).filter(e -> e % 2 == 0).forEach(e -> System.out.println(e));
    }
}
