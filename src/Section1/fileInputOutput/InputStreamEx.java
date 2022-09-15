package Section1.fileInputOutput;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class InputStreamEx {
    public static void main(String[] args) {
        try {
            FileInputStream fileInput = new FileInputStream("Java.txt");
            int i = 0;
            while ((i = fileInput.read()) != -1) {
                System.out.print((char)i);
            }
            fileInput.close();
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
//    public static void main(String args[]) {
//        try {
//            FileInputStream fileInput = new FileInputStream("hello.txt");
//            // BufferedInputStream 객체 생성
//            BufferedInputStream bufferedInput = new BufferedInputStream(fileInput);
//
//            int i = 0;
//            while ((i = bufferedInput.read()) != -1) {
//                System.out.print((char)i);
//            }
//            fileInput.close();
//        }
//        catch (Exception e) {
//            System.out.println(e);
//        }
//    }
}
