package be.intecbrussel.streams;

import java.util.stream.Stream;

public class PersonApp {

    public static void main(String[] args) {
        Person p1 = new Person("Richard", "Night", "Male", 44, 75
                                , 175);
        Person p2 = new Person("Meredith", "Stout", "Female", 34, 65
                , 165);
        Person p3 = new Person("Dexter", "DeShawn", "Male", 28, 85
                , 185);

        Person[] personArray = new Person[]{p1, p2, p3};

        double gemiddeledeLeeftijd = Stream.of(personArray).mapToInt(e -> e.getLeeftijd())
                              .average().getAsDouble();

        System.out.println(gemiddeledeLeeftijd);

        Stream.of(personArray).forEach(e -> {
            String s = "Person name: " + e.getVoornaam() + " is " + e.getLeeftijd() + " jaar oud.";
            System.out.println(s);
        });
    }
}
