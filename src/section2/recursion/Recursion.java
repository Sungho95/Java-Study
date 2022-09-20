package section2.recursion;

import java.util.Arrays;

public class Recursion {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        System.out.println(arrSum(arr));
    }
    public static int arrSum(int[] arr) {
        if (arr.length == 0) {
            return 0;
        }

        int[] tail = Arrays.copyOfRange(arr, 1, arr.length);
        return arr[0] + arrSum(tail);
    }
}

//    public static void main(String[] args) {
//        int[] arr = {1, 2, 3, 4, 5};
//
//        System.out.println(arrSum(arr));
//    }
//
//    public static int arrSum(int[] arr) {
//        int sum = 0;
//        for (int i = 0; i < arr.length; i++) {
//            sum += arr[i];
//        }
//
//        return sum;
//    }
//}

//    public static void main(String[] args) {
//        Recursion recursion = new Recursion();
//
//        recursion.recursion(0);
//    }
//
//    public void recursion(int num) {
//        num++;
//        System.out.println("num = " + num);
//        recursion(num);
//    }
//}
