package Section1.stream;

import java.util.stream.IntStream;

public class RangeEx {
    public static void main(String[] args) {
        IntStream intStream1 = IntStream.range(1, 3);
        IntStream intStream2 = IntStream.rangeClosed(1, 3);

        intStream1.forEach(System.out::println);
        intStream2.forEach(System.out::println);
    }
}
