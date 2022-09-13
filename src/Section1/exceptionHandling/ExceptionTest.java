package Section1.exceptionHandling;

public class ExceptionTest {

    static void printStr(String str) {
        String upperStr = str.toUpperCase();
        System.out.println(upperStr);
    }

    public static void main(String[] args) {
//        try {
//            printStr("Hello");
//            printStr(null);
//        } catch (NullPointerException e) {
//            System.out.println("예외 발생");
//        } finally {
//            System.out.println("finally 실행");
//        }
        try {
            printStr(null);
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
            System.out.println(e.toString());
        } finally {
            System.out.println("finally 실행");
        }
    }
}