package Section1.IfAndSwitch;

import java.util.Scanner;

public class IfEx {
    static Scanner myInput = new Scanner(System.in);
    public static void main(String[] args) {
        // 사용자로부터 점수 입력 받기
        int score = myInput.nextInt();

        if (score >= 90) {
            System.out.println('A'); // 점수가 90점 이상이면 A
        } else if (score >= 80) {
            System.out.println('B'); // 점수가 90점 미만 80점 이상이면 B
        } else if (score >= 70) {
            System.out.println('C'); // 점수가 80점 미만 70점 이상이면 C
        } else if (score >= 60) {
            System.out.println('D'); // 점수가 70점 미만 60점 이상이면 D
        } else {
            System.out.println('F'); // 점수가 60점 미만이면 F
        }

    }
}
