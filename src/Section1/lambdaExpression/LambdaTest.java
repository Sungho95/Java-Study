package Section1.lambdaExpression;

@FunctionalInterface // 인터페이스가 바르게 정의되었는 지 확인하는 어노테이션
interface FunctionalEx {
    public abstract int sum(int num1, int num2);
}

public class LambdaTest {
    public static void main(String[] args) {
        FunctionalEx functionalEx = (num1, num2) -> num1 + num2;

        System.out.println(functionalEx.sum(10, 15));
    }
}
