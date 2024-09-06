package java09;

import java.util.stream.Stream;

public class Main2 {
    public static void main(String[] args) {
        Stream.iterate(0, i->i<30, i -> i + 1)
                .forEach(System.out::println);
        // 30미만 까지만 만듦
    }
}
