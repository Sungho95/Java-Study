package Section1.exceptionHandling;

import java.io.BufferedReader;
import java.io.FileReader;

public class ErrorTest {

//    public static void main(String[] args) {
//        int[] array = {2,4,6};
//        System.out.println(array[3]);
//    }

//    public static void main(String[] args) {
//        BufferedReader notExist = new BufferedReader(new FileReader("없는 파일"));
//        notExist.readLine();
//        notExist.close();
//    }

//    public static void main(String[] args) {
//        for (int i = 0; i < 5; i++) {
//            System.out.println(i)
//        }
//    }

    public static void main(String[] args) {
        System.out.println(10 / 0);
    }
}