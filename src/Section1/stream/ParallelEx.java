package Section1.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

//public class ParallelEx {
//    public static void main(String[] args) {
////        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
////        Stream<Integer> stream = list.stream();
////
////        stream.forEach(i -> {
////            System.out.println(i);
////        });
//
//        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//        Stream<Integer> stream = list.parallelStream();
//
//        stream.parallel().forEach(i -> {
//            System.out.println(i);
//        });
//    }
//}

public class ParallelEx {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Stream<Integer> stream = list.parallelStream();

        stream.forEach(i -> {
            System.out.println(i);
        });
    }
}