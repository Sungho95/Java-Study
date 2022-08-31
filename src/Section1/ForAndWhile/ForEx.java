package Section1.ForAndWhile;

public class ForEx {
    public static void main(String[] args) {
        int result = 0;

        for (int num = 1; num <= 10; ++num) {
            System.out.println(num);
            result += num;
        }

        System.out.println(result);
    }
}
