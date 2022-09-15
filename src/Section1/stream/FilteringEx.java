package Section1.stream;

import java.util.Arrays;
import java.util.List;

public class FilteringEx {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("a", "a", "b", "b", "c", "c");

        // 중복 제거
        list.stream()
                .distinct()
                .forEach(System.out::println);

        // "a"인 리스트만 출력
        list.stream()
                .filter(str -> str.equals("a"))
                .forEach(System.out::println);

        // "a"인 리스트를 중복 제거하여 출력
        list.stream()
                .distinct()
                .filter(str -> str.equals("a"))
                .forEach(System.out::println);
    }
}
