package Section1.fileInputOutput;

import java.io.File;
import java.io.IOException;

public class FileEx {
    public static void main(String args[]) throws IOException {
        File file = new File("../hello.txt");

        System.out.println(file.getPath());
        System.out.println(file.getParent());
        System.out.println(file.getAbsolutePath());
        System.out.println(file.getCanonicalPath());
        System.out.println(file.canWrite());
    }
}
