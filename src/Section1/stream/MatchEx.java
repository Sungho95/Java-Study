package Section1.stream;

import java.util.Arrays;

public class MatchEx {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10};

        boolean result = Arrays.stream(arr).allMatch(num -> num % 2 == 0);
        System.out.println(result);

        result = Arrays.stream(arr).anyMatch(num -> num % 3 == 0);
        System.out.println(result);

        result = Arrays.stream(arr).noneMatch(num -> num % 7 == 0);
        System.out.println(result);
    }
}
