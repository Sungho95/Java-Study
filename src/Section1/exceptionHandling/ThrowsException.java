package Section1.exceptionHandling;

public class ThrowsException {
//    public static void main(String[] args) {
//        try {
//            throwException();
//        } catch (ClassNotFoundException e) {
//            System.out.println(e.getMessage());
//        }
//    }
//
//    static void throwException() throws ClassNotFoundException, NullPointerException {
//        Class.forName("예외 발생");
//    }

    public static void main(String[] args) {
        try {
            Exception intendedException = new Exception("의도적인 예외");
            throw intendedException;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
