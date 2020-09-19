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
        OptionalDouble OtherMax = IntStream.of().average();
        if(OtherMax.isPresent()){
            System.out.println(OtherMax.getAsDouble());
            System.out.println("Is present.");
        } else {
            System.out.println("Is NOT present.");
        }
        System.out.println("\n");
        if(OtherMax.isEmpty()){
            // System.out.println(OtherMin.getAsInt()); //error
            System.out.println("Is empty.");
        } else {
            System.out.println("Is NOT empty.");
        }
        System.out.println("\n");

        OptionalDouble rangeClosedObject = IntStream.rangeClosed(0, 10).average();
        if(rangeClosedObject.isPresent()){
            System.out.println(rangeClosedObject.getAsDouble());
            System.out.println("Is present.");
        } else {
            System.out.println("Is NOT present.");
        }
        System.out.println("\n");
        if(rangeClosedObject.isEmpty()){
            // System.out.println(rangeClosedObject.getAsInt()); //error
            System.out.println("Is empty.");
        } else {
            System.out.println("Is NOT empty.");
        }
        System.out.println("\n");
    }
}
