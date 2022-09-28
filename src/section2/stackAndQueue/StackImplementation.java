package section2.stackAndQueue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StackImplementation {
    public static void main(String[] args) {
        // TODO:
        String[] arr = {"a", "b", "c", "def"};
        List<String> arrList = Arrays.asList(arr);

        int maxIndex = 0;
        int minIndex = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() >= arrList.get(maxIndex).length()) {
                maxIndex = i;
            }
        }
        System.out.println("maxIndex = " + maxIndex);
        arrList.remove(1);
        System.out.println(arrList);

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() <= arrList.get(minIndex).length()) {
                minIndex = i;
            }
        }
        System.out.println("minIndex = " + minIndex);

        String result[] = arrList.toArray(new String[arrList.size()]);
        System.out.println("result = " + Arrays.toString(result));
    }
}
