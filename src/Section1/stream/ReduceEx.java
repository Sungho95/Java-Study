package Section1.stream;

import java.util.Arrays;

public class ReduceEx {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        int sum1 = Arrays.stream(arr)
                .map(num -> num * 2)
                .reduce((a, b) -> a + b)
                .getAsInt();
        System.out.println(sum1);

        int sum2 = Arrays.stream(arr)
                .reduce(3, (a, b) -> a + b);
        System.out.println(sum2);
    }
}
