package section2.sortAlgorithm;

import java.util.Arrays;

public class CountSort {
    public static void main(String[] args) {
        int[] arr = {2, 5, 3, 4, 7, 8, 9, 6, 1, 0};
        int[] count = new int[arr.length];
        int[] result = new int[arr.length];

        for (int i = 1; i < arr.length; i++) {
            count[arr[i]]++;
        }

        for(int i = 1; i < count.length; i++) {
            count[i] += count[i-1];
        }

        for(int i = arr.length - 1; i >= 0; i--) {
            int value = arr[i];
            count[value]--;
            result[count[value]] = value;
        }

        System.out.println(Arrays.toString(arr));
    }
}
