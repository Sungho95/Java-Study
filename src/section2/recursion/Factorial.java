package section2.recursion;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(forFactorial(4));
        System.out.println(recursionFactorial(4));
    }

    // 반복문
    public static int forFactorial(int num) {
        int result = 1;
        for (int i = 1; i <= num; i++) {
            result *= i;
        }
        return result;
    }

    // 재귀
    public static int recursionFactorial(int num) {
        if (num <= 1) {
            return 1;
        }
        return num * recursionFactorial(num - 1);
    }
}
