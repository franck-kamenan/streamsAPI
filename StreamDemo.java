package be.intecbrussel.streams;

import java.util.OptionalInt;
import java.util.Random;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {
        String[] strArray = "This is an array of string that is getting long".split(" ");

        OptionalInt min = IntStream.range(0, 10).min();
        if(min.isPresent()){
            System.out.println(min.getAsInt());
            System.out.println("Is present.");
        } else {
            System.out.println("Is NOT present.");
        }
        System.out.println("\n");
        if(min.isEmpty()){
            System.out.println(min.getAsInt());
            System.out.println("Is empty.");
        } else {
            System.out.println("Is NOT empty.");
        }
        System.out.println("\n");

        OptionalInt OtherMin = IntStream.of().min();
        if(OtherMin.isPresent()){
            System.out.println(OtherMin.getAsInt());
            System.out.println("Is present.");
        } else {
            System.out.println("Is NOT present.");
        }
        System.out.println("\n");
        if(OtherMin.isEmpty()){
            // System.out.println(OtherMin.getAsInt()); //error
            System.out.println("Is empty.");
        } else {
            System.out.println("Is NOT empty.");
        }
        System.out.println("\n");
    }
}
