public class OperatorEx {
    public static void main(String[] args) {
//        int num = 5;
//        // 전위형 증감 연산자
//        System.out.println(++num); // 6
//        System.out.println(num); // 6
//
//        System.out.println(--num); // 5
//        System.out.println(num); // 5
//
//        // 후위형 증감 연산자
//        System.out.println(num++); // 5
//        System.out.println(num); // 6
//
//        System.out.println(num--); // 6
//        System.out.println(num); // 5

//        int num1 = 5;
//        num1 += 3; // num1 = 8
//
//        int num2 = 5;
//        num2 -= 3; // num2 = 2
//
//        int num3 = 5;
//        num3 *= 3; // num3 = 15
//
//        int num4 = 5;
//        num4 /= 3; // num4 = 1
//
//        int num5 = 5;
//        num5 %= 3; // num5 = 2
//
//        System.out.println(num1);
//        System.out.println(num2);
//        System.out.println(num3);
//        System.out.println(num4);
//        System.out.println(num5);

//        System.out.println(3 > 2); // true
//        System.out.println(3 > 4); // false
//
//        System.out.println(2 < 3); // true
//        System.out.println(4 < 3); // false
//
//        System.out.println(3 >= 3); // true
//        System.out.println(3 <= 2); // false

        System.out.println(true && true); // true
        System.out.println(true && false); // false
        System.out.println(false && true); // false
        System.out.println(false && false); // false

        System.out.println(true || true); // true
        System.out.println(true || false); // true
        System.out.println(false || true); // true
        System.out.println(false || false); // false

        System.out.println(!true); // false
        System.out.println(!false); // true
        System.out.println(!false && true); // true
        System.out.println(!false || false); // true

        System.out.printf("%5d%n", 10);
        System.out.printf("%-5d%n", 10);
        System.out.printf("%05d%n", 10);
    }
}
