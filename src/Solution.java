import java.util.Arrays;

class Solution {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};

        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.reverseArr(arr)));

    }
    public int[] reverseArr(int[] arr){
        // TODO:
        if (arr.length == 0) {
            return new int[]{};
        }
        // [3]
        // [3, 2]
        // [3, 2, 1]

        // 3 + [1, 2]
        // 2 + [1]
        // 1 + []
        // -> [3, 2, 1];
        int[] tail = Arrays.copyOfRange(arr, arr.length - 1, arr.length);
        int[] head = Arrays.copyOfRange(arr, 0, arr.length - 1);

        System.out.println(head);
        return reverseArr(head);
    }
}