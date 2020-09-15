package be.intecbrussel.streams;

import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {
        String[] strArray = "This is an array of string that is getting long".split(" ");

        for (String s: strArray) {
            System.out.println(s);
        }

        Stream.of(strArray).forEach(element -> System.out.println(element));
    }
}
