package be.intecbrussel.streams;

public class StreamDemo {
    public static void main(String[] args) {
        String[] strArray = "This is an array of string that is getting long".split(" ");

        for (String s: strArray) {
            System.out.println(s);
        }
    }
}
