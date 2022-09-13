package Section1.wrapperClass;

public class WrapperClassEx {
    public static void main(String[] args) {
//        Integer num1 = new Integer(100);
//        Integer num2 = new Integer(100);
//
//        Integer integerNum = 100;
//
//        int num = integerNum + 100;
//        System.out.println(num);
//
//        System.out.println(num1 == num2); // false
//        System.out.println(num1.equals(num2)); // false
//        System.out.println(num1.compareTo(num2)); // 0
//
//        System.out.println(num1.MAX_VALUE); // 2147483647
//        System.out.println(num1.MIN_VALUE); // -2147483648
//        System.out.println(num1.SIZE);      // 32
//        System.out.println(num1.BYTES);    // 4

        int num = 100;

        // 박싱
        Integer integerNum = (Integer) num;
        System.out.println(integerNum);

        // 언박싱
        int sum = (int) integerNum + 100;
        System.out.println(sum);
    }
}
