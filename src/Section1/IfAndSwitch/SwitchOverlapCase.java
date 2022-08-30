package Section1.IfAndSwitch;

import java.util.Scanner;

public class SwitchOverlapCase {
    static Scanner userInput = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("포지션을 입력하시오 : ");
        String position = userInput.nextLine();

        switch(position) {
            case "Senior" :
                System.out.println("500만원");
                break;
            case "Junior" :
            case "Manager" :
                System.out.println("350만원");
                break;
            default :
                System.out.println("200만원");
                break;
        }
    }
}
