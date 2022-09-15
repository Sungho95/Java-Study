package Section1.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortedEx {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

        // 오름차순 정렬
        list.stream()
                .sorted()
                .forEach(System.out::print);

        System.out.println();

        // 내림차순 정렬
        list.stream()
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::print);
    }
}
