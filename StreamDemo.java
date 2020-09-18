package be.intecbrussel.streams;

import java.util.Random;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {
        String[] strArray = "This is an array of string that is getting long".split(" ");

        int sum = IntStream.range(0, 10).sum();
        int sumClosed = IntStream.rangeClosed(0, 10).sum();
        System.out.println("\n" + sum);
        System.out.println("\n" + sumClosed);


    }
}
