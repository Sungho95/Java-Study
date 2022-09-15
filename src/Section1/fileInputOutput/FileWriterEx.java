package Section1.fileInputOutput;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEx {
    public static void main(String[] args) {
        try {
            String fileName = "hello.txt";
            FileWriter writer = new FileWriter(fileName);

            // 파일에 저장할 내용
            String str = "Hello Java!";

            // 파일에 str 작성하기
            writer.write(str);

            // 파일 닫기
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
