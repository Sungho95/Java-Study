package section2.recursion;

/* 하노이탑
 * A, B, C 3개의 막대가 있고, n개의 원판이 있다.
 * 막대 A에 있는 모든 원판을 C로 옮겨야 한다.
 * [조건]
 * 1. 한 번에 한 개의 원판만이 옮길 수 있다.
 * 2. 큰 원판은 작은 원판 위에 있을 수 없다.
 * n : 원 판의 개수, from : 시작지점, temp : 옮겨야할 위치, to : 목적지점
 * */

import java.util.Scanner;

public class Hanoi {
    public static void hanoi(int n, int from, int temp, int to) {
        if (n == 1) {
            System.out.println(from + " " + to);
            return;
        }
        hanoi(n - 1, from, to, temp);
        System.out.println(from + " " + to);
        hanoi(n - 1, temp, from, to);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Hanoi hanoiTest = new Hanoi();

        System.out.println(Math.pow(n, 2));
        hanoiTest.hanoi(n, 1, 2, 3);
    }
}
