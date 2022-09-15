package Section1.lambdaExpression;

// 매개변수가 없는 람다식
//@FunctionalInterface
//interface FunInterface {
//    void strPrint();
//}
//
//public class FunInterfaceEx {
//    public static void main(String[] args) {
//        FunInterface test;
//
//        test = () -> {
//            String str = "람다식 사용하기1";
//            System.out.println(str);
//        };
//        test.strPrint();
//
//        // 실행문이 하나일 경우 {} 생략 가능
//        test = () -> System.out.println("람다식 사용하기2");
//        test.strPrint();
//    }
//}

// 매개변수가 있는 람다식
//@FunctionalInterface
//interface FunInterface {
//    public void strPrint(int num);
//}
//
//public class FunInterfaceEx {
//    public static void main(String[] args) {
//        FunInterface test;
//        test = (num) -> {
//            int result = num + 10;
//            System.out.println(result);
//        };
//        test.strPrint(5);
//
//        // 실행문이 하나일 경우 {} 생략 가능
//        test = (num) -> System.out.println(num + 10);
//        test.strPrint(5);
//    }
//}

import static java.lang.Integer.sum;

@FunctionalInterface
interface FunInterface {
    public int sumEx(int num1, int num2);
}

public class FunInterfaceEx {
    public static void main(String[] args) {
        FunInterface test;
        test = (num1, num2) -> {
            int result = num1 + num2;
            return result;
        };
        int result1 = test.sumEx(5, 10);
        System.out.println(result1);

        test = (num1, num2) -> { return num1 + num2; };
        int result2 = test.sumEx(5, 10);
        System.out.println(result2);

        // 실행문이 한 줄인 경우 {}와 return 생략 가능
        test = (num1, num2) -> num1 + num2;
        int result3 = test.sumEx(5, 10);
        System.out.println(result3);

        // 메서드 활용
        test = (num1, num2) -> methodEx(num1, num2);
        int result4 = test.sumEx(5, 10);
        System.out.println(result4);
    }

    public static int methodEx(int a, int b) {
        return a + b;
    }
}

