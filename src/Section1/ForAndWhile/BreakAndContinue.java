package Section1.ForAndWhile;

public class BreakAndContinue {
    public static void main(String[] args) {
        int result = 0;
        int i = 1;

        while (true) {
            result += i;
            if (i == 10) {
                break;
            }
            i += 1;
        }

        System.out.println(result);
//        for (int i = 1; i <= 10; i++) {
//            if (i % 2 == 0) {
//                continue;
//            }
//            result += i;
//        }
//        System.out.println(result);
    }
}
