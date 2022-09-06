package Section1.abstraction;

public interface InterfaceEx {
    // 인터페이스의 인스턴스 변수 정의
    // 아래 모두 public static final로 정의됨.
    public static final int a = 1;
    final int b = 2;    // public static 생략한 경우
    static int c = 3;   // public과 final을 생략한 경우
    int d = 4;          // 모두 생략한 경우

    // 인터페이스의 메서드 정의
    public abstract int geInt();
    void call(); // public abstract 생략 가능

}