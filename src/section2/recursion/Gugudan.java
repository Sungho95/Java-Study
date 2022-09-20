package section2.recursion;

public class Gugudan {
    public static void main(String[] args) {
        forGugudan(9);
        recursionGugudan(9, 1);
    }
    // 반복문
    public static void forGugudan(int dan) {
        for (int i = 1; i < 10; i++) {
            System.out.println(dan + " * " + i + " = " + dan * i);
        }
    }

    // 재귀
    public static void recursionGugudan(int dan, int cnt) {
        if (cnt > 9) {
            return;
        }
        System.out.println(dan + " * " + cnt + " = " + dan * cnt);
        recursionGugudan(dan, cnt + 1);
    }
}
