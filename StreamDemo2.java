package be.intecbrussel.streams;

import java.util.Random;
import java.util.stream.IntStream;

public class StreamDemo2 {

    public static void main(String[] args) {

        IntStream.rangeClosed(1, 50)
                 .filter(e -> e % 2 == 0)
                 .filter(e -> e % 3 == 0)
                 .filter(e -> e > 20)
                 .limit(2)
                 .map(e -> e * 5)
                 .mapToDouble(e -> e / 1.5)  //DoubleStream
                 .mapToInt(e -> (int) e / 5) //Intstream
                 .forEach(e -> System.out.println(e));

        System.out.println("\n");

        IntStream.generate(() -> new Random().nextInt(100))
                 .limit(20)
                 .sorted()
                 .forEach(e -> System.out.println(e));
    }
}
