package Section1.fileInputOutput;

import java.io.File;

public class FileNameChange {
    public static void main(String[] args) {
        File dir = new File("./");
        File[] list = dir.listFiles();

        String addFileName = "hello";

        for (int i = 0; i < list.length; i++) {
            String fileName = list[i].getName();

            if (fileName.endsWith("txt") && !fileName.startsWith("hello")) {
                list[i].renameTo(new File(dir, addFileName + fileName));
            }
        }
    }
}
