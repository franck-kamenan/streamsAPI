package be.intecbrussel.streams;

import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.Random;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {

        int rangeClosedObject = IntStream.rangeClosed(1, 4).reduce(1, (accumulatie, e) -> accumulatie * e);
        System.out.println(rangeClosedObject);

        String[] strArray = "This is an array of string that is getting long".split(" ");
        String sentence = Stream.of(strArray).reduce("",(acc, e) -> acc + e + " ");
        System.out.println(sentence);
    }
}
