package Section1.stream;


import java.util.Arrays;
import java.util.List;

public class ForEachEx {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

        list.stream()
                .filter(num -> num % 2 == 0)
                .forEach(num -> System.out.println(num));
    }
}