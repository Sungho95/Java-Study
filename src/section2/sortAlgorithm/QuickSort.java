package section2.sortAlgorithm;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {2, 5, 3, 4, 7, 8, 9, 6, 1, 0};

        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    private static void quickSort(int[] arr, int start, int end) {
        int part = partition(arr, start, end);

        if (start < part - 1) {
            quickSort(arr, start, part - 1);
        }

        if (end > part) {
            quickSort(arr, part, end);
        }
    }

    private static int partition(int[] arr, int start, int end) {
        int pivot = arr[(start + end) / 2];

        while (start <= end) {
            while (arr[start] < pivot) {
                start += 1;
            }

            while (arr[end] > pivot) {
                end -= 1;
            }

            if (start <= end) {
                swap(arr, start, end);
                start += 1;
                end -= 1;
            }
        }
        return start;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
