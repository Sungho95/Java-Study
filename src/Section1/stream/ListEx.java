package Section1.stream;

import java.util.List;

//public class ListEx {
//    public static void main(String[] args) {
//        List<Integer> lst = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//        int result = 0;
//
//        for (int i : lst) {
//            if (i % 2 == 0) {
//                result += i;
//            }
//        }
//
//        System.out.println(result);
//    }
//}

public class ListEx {
    public static void main(String[] args) {
        List<Integer> lst = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        int result =
                lst.stream()
                        .filter(i -> (i % 2 == 0))
                        .mapToInt(i -> i)
                        .sum();

        System.out.println(result);
    }
}