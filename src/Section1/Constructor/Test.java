package Section1.Constructor;

public class Test {
    public static void main(String[] args) {
        Example example = new Example(5);
    }
}

class Example  {
    public Example() {
        System.out.println("기본 생성자 호출!");
    };

    public Example(int x) {
        this();
        System.out.println("두 번째 생성자 호출!");
    }
}