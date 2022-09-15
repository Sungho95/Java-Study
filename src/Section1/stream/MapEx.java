package Section1.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MapEx {
    public static void main(String[] args) {
//        List<String> list = Arrays.asList("hello", "java", "world");
//
//        list.stream()
//                .map(s -> s.toUpperCase())
//                .forEach(System.out::println);

        Stream<String[]> stringArraysStream = Stream.of(
                new String[]{"hello", "java", "world"},
                new String[]{"hong", "gildong"});

        stringArraysStream.flatMap(Arrays::stream).forEach(System.out::println);

        Stream<String[]> stringArraysStream2 = Stream.of(
                new String[]{"hello", "java", "world"},
                new String[]{"hong", "gildong"});
        stringArraysStream2.map(Arrays::stream).forEach(System.out::println);
    }
}
