package Section1.ForAndWhile;

public class DoWhileEx {
    public static void main(String[] args) {
        int i = 1;
        int result = 0;
        do {
            result += i;
            i += 1;
        } while (i <= 10);

        System.out.println(result);
    }
}
