package Section1.generic;

class GenericClass<T> {
    public static <T> void genericMethod1(T element) {
        // 타입이 결정되지 않은 상태이므로 length() 사용 불가능
        //System.out.println(element.length());
    }

        // 클래스 변수에는 사용 불가능
        // static T element;

        // static 메서드에는 제네릭 사용 가능
    public static <T> void genericMethod2(T element) {

        // Object 클래스의 메서드는 사용 가능
        System.out.println(element.equals(10));
    }

    public static void main(String[] args) {
        // 제네릭 클래스의 타입 지정(String)
        GenericClass<String> generic = new GenericClass<>();

        // 제네릭 메서드의 타입 지정(Integer)
        generic.<Integer>genericMethod1(10);

        // 제네릭 메서드의 경우 타입 생략 가능
        generic.genericMethod2(10);
    }
}