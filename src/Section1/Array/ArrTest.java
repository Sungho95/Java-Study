package Section1.Array;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrTest {
    public static void main(String[] args) {
//        String str = "Radagast the Brown";
//        String[] result = str.split(" ");
//        System.out.println(Arrays.toString(result));

//         int[] arr = {1, 2, 3, 4};
//         arr = Arrays.copyOf(arr, arr.length + 1);
//         System.out.println(Arrays.toString(arr));
//        int[] arr = {3, 2, 1};
//        int n = 1;
//        // result = {1, 3, 4}
//
//        if (arr.length <= n) {
//            System.out.println(Arrays.toString(arr));
//        }
//        int[] result = new int[arr.length - n];
//
//        for (int i = 0; i < n; i++) {
//            result[i] = arr[i];
//        }
//        for (int j = n; j < result.length; j++) {
//            result[j] = arr[j+1];
//        }
//        System.out.println(Arrays.toString(result));

//        int arr[] = new int[]{0, 1, 0, 1, 2, 3, 4, 5, 6, 7, 8};
//
//        String head = "010";
//        String result = Arrays.toString(arr);
//        System.out.println(result);
//
//        result = result.replace("[", "");
//        result = result.replace(",", "");
//        result = result.replace(" ", "");
//        result = result.replace("]", "");
//        System.out.println(result);
        int num = 8;
        int[] result = new int[num + 1];

        for (int i = 0; i <= num; i++) {
            if (i <= 1) {
                result[i] = i;
                continue;
            }
            result[i] = result[i-2] + result[i-1];
        }
        System.out.println(Arrays.toString(result));

    }
}
