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

        OptionalInt max = IntStream.range(0, 10).max();
        if(max.isPresent()){
            System.out.println(max.getAsInt());
            System.out.println("Is present.");
        } else {
            System.out.println("Is NOT present.");
        }
        System.out.println("\n");
        if(max.isEmpty()){
            System.out.println(max.getAsInt());
            System.out.println("Is empty.");
        } else {
            System.out.println("Is NOT empty.");
        }
        System.out.println("\n");

        OptionalInt OtherMax = IntStream.of().max();
        if(OtherMax.isPresent()){
            System.out.println(OtherMax.getAsInt());
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
    }
}
