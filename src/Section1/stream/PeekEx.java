package Section1.stream;

import java.util.Arrays;
import java.util.List;

public class PeekEx {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

        // 오름차순 정렬
        int result = list.stream()
                .peek(num -> System.out.println(num))
                .filter(num -> num % 2 == 0)
                .mapToInt(num -> num)
                .peek(num -> System.out.println(num))
                .sum();
        System.out.println(result);
    }
}