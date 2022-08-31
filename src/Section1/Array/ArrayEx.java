package Section1.Array;

import java.util.Arrays;

public class ArrayEx {
    public static void main(String[] args) {
        int[] student;
        student = new int[30];

        System.out.println(student.length);
        int[][] kcal = {
                { 1982, 2098, 2130 },
                { 2242, 2431, 2198 },
                { 2365, 1997, 1932 },
                { 2278, 2391, 2006 }};

        System.out.println(Arrays.toString(kcal));
        System.out.println();
        System.out.println(Arrays.toString(kcal[0]));

//        int[][] member = new int[5][];
//        System.out.println(Arrays.toString(member));

//        int[] arr = {1, 2, 3, 4, 5};
//        int sum = 0;
//
//        for (int i = 0; i < arr.length; i++) {
//            sum += arr[i];
//        }
//
//        System.out.println(sum);
//
//        int[][] member = {
//                {1, 2},
//                {3, 4, 5},
//                {6, 7, 8, 9},
//                {10, 11, 12},
//                {13, 14}
//        };

//        int[] arr = {1, 2, 3, 4, 5};
//
//        int sum = 0;
//        int i = 0;
//
//        while (i < arr.length) {
//            sum += arr[i];
//            i += 1;
//        }
//
//        System.out.println(sum);

//        int[] arr = {1, 2, 3, 4, 5};
//        int sum = 0;
//
//        for (int i: arr) {
//            sum += i;
//        }
//
//        System.out.println(sum);




    }
}
