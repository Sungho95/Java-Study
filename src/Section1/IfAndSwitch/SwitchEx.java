package Section1.IfAndSwitch;

import java.util.Scanner;

public class SwitchEx {
    static Scanner myInput = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("0부터 6까지의 숫자를 입력하시오: ");
        int day = myInput.nextInt();
        switch (day) {
            case 0 :
                System.out.println("일요일");
                break;
            case 1 :
                System.out.println("월요일");
                break;
            case 2 :
                System.out.println("화요일");
                break;
            case 3 :
                System.out.println("수요일");
                break;
            case 4 :
                System.out.println("목요일");
                break;
            case 5 :
                System.out.println("금요일");
                break;
            case 6 :
                System.out.println("토요일");
                break;
            default:
                System.out.println("잘못된 입력");
                break;
        }
    }
}
