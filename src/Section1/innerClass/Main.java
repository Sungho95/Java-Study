package Section1.innerClass;

// 인스턴스 내부 클래스
//class OuterClass {
//    private String str1 = "외부 클래스 인스턴스 변수입니다.";
//    private static String str2 = "외부 클래스 정적 변수입니다.";
//
//    private InnerClass innerClass;
//
//    public OuterClass() {
//        innerClass = new InnerClass();
//    }
//
//    class InnerClass {
//        String innerStr1 = "내부 클래스 인스턴스 변수입니다.";
//
//        void Test() {
//            System.out.println(str1);
//            System.out.println(str2);
//            System.out.println(innerStr1);
//        }
//    }
//
//    public void testClass() {
//        innerClass.Test();
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        OuterClass outer = new OuterClass();
//
//        outer.testClass();
//    }
//}

//class OuterClass {
//    private String str1 = "외부 클래스 인스턴스 변수입니다.";
//    private static String str2 = "외부 클래스 정적 변수입니다.";
//
//    void getPrintInstance() {
//        System.out.println("인스턴스 메서드");
//    }
//
//    static void getPrintStatic() {
//        System.out.println("정적 메서드");
//    }
//
//    static class StaticInnerClass {
//        void test() {
//            // 인스턴스 변수 및 인스턴스 메서드는 사용 불가
//            // System.out.println(str1);
//            // getPrintInstance();
//
//            System.out.println(str2);
//            getPrintStatic();
//        }
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        OuterClass.StaticInnerClass innerClass = new OuterClass.StaticInnerClass();
//        innerClass.test();
//    }
//}

class OuterClass {
    String str1 = "외부 클래스 인스턴스 변수";

    void test() {
        String str2 = "지역 변수";

        // 지역 내부 클래스
        class LocalInnerClass {
            void getPrint() {
                System.out.println(str1);
                System.out.println(str2);
            }
        }
        LocalInnerClass localInnerClass = new LocalInnerClass();
        localInnerClass.getPrint();
    }
}

public class Main{
    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        outer.test();
    }
}