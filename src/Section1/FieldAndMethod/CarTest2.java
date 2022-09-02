package Section1.FieldAndMethod;

public class CarTest2 {
    public static void main(String[] args) {
        System.out.println(Car.str1); // 클래스 변수 바로 사용 가능
        // System.out.println(Car.str1); // 인스턴스 변수 바로 사용 불가능

        Car.ClassMethod(); // 클래스 메서드 바로 사용 가능
        // Car.InstanceMethod(); // 인스턴스 메서드 바로 사용 불가능

        Car car1 = new Car();
        Car car2 = new Car();

        car1.str1 = "클래스 변수입니다.";
        System.out.println(car1.str1);
        System.out.println(car2.str1);
        System.out.println(Car.str1);

    }
}

class Car {
    public String str2 = "인스턴스 변수";
    public static String str1 = "클래스 변수";

    public static void ClassMethod() { // 정적 메서드(클래스 메서드)
        // System.out.println(str1); 인스턴스 변수 사용 불가능
        System.out.println(str1); // 클래스 변수 사용 가능
    }

    public void InstanceMethod() { // 인스턴스 메서드
        System.out.println(str1); // 인스턴스 변수 사용 가능
        System.out.println(str2); // 클래스 변수 사용 가능
    }
}