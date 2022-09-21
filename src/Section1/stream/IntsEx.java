package Section1.stream;

import java.util.stream.IntStream;

public class IntsEx {
    public static void main(String[] args) {
        IntStream intStream = IntStream.rangeClosed(1, 10);
        intStream.skip(5)
                .forEach(System.out::println);
    }
}

class LimitEx {
    public static void main(String[] args) {
        IntStream intStream = IntStream.rangeClosed(1, 10);
        intStream.limit(5)
                .forEach(System.out::println);
    }
}