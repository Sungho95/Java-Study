package Section1.fileInputOutput;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderEx {
    public static void main(String[] args) {
        try {
            String fileName = "Java.txt";
            FileReader file = new FileReader(fileName);

            int data = 0;

            while((data=file.read()) != -1) {
                System.out.print((char)data);
            }
            file.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
//        try {
//            String fileName = "Java.txt";
//            FileReader file = new FileReader(fileName);
//            BufferedReader buffered = new BufferedReader(file);
//
//            int data = 0;
//
//            while((data=buffered.read()) != -1) {
//                System.out.print((char)data);
//            }
//            file.close();
//        }
//        catch (IOException e) {
//            e.printStackTrace();
//        }
    }
}
