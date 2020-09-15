package be.intecbrussel.streams;

import java.util.Random;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {
        String[] strArray = "This is an array of string that is getting long".split(" ");

        for (String s: strArray) {
            System.out.println(s);
        }

        Stream<String> stream = Stream.of(strArray);
        stream.forEach(e -> System.out.println(e));

        Stream.generate(() -> new Random().nextInt(10)).limit(10).forEach(e -> System.out.println(e));
    }
}
