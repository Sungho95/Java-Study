import java.io.*;
import java.util.*;

import java.util.*;

public class Main {
//    public Integer boardGame(int[][] board, String operation) {
//        // TODO:
//        // U = (2, 2) -> (1, 2)
//        // D = (2, 2) -> (3, 2)
//        // L = (2, 2) -> (2, 1)
//        // R = (2, 2) -> (2, 3)
//
//        // U D L R
//        int[] dx = {-1, 1, 0, 0};
//        int[] dy = {0, 0, -1, 1};
//        char[] type = {'U', 'D', 'L', 'R'};
//
//        // 스코어를 담을 변수
//        int score = 0;
//
//        // 현재 위치
//        int x = 0;
//        int y = 0;
//        score += board[x][y];
//
//        // operation.charAt(i)
//        for (int i = 0; i < operation.length(); i++) {
//            int idx = Arrays.asList(type).indexOf(operation.charAt(i));
//            x = x + dx[idx];
//            y = y + dy[idx];
//            if (x >= 0 && y >= 0 && x < board.length && y < board.length) {
//                score += board[x][y];
//            } else {
//                return null;
//            }
//        }
//        return score;
//    }
    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 1};
        ArrayList<Integer> arrList = new ArrayList<>();

//        int[][] board = new int[][]{
//                {0, 0, 0, 0, 0},
//                {0, 0, 1, 0, 0},
//                {0, 0, 0, 0, 0},
//                {0, 0, 0, 1, 0},
//                {0, 0, 0, 0, 0}
//        };
//
//        String operation = "DDRRRUDUDUD";
//
//        // 스코어를 담을 변수
//        int score = 0;
//
//        // 현재 위치
//        int x = 0;
//        int y = 0;
//        score += board[x][y];

    }
}

// public class Main {
//    public static void main(String[] args) throws IOException {
//        // BufferedRead와 BufferedWrite 선언
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
//
//        // n 입력 받기
//        int n = Integer.parseInt(bufferedReader.readLine());
//
//
//        for (int i = 0; i < n; i++) {
//            // 더할 수 입력 받기
//            String str = bufferedReader.readLine();
//
//            // split()을 통해 문자열 구분 후 int형으로 변환
//            int a = Integer.parseInt(str.split(" ")[0]);
//            int b = Integer.parseInt(str.split(" ")[1]);
//
//            // 출력
//            bufferedWriter.write(a+b + "\n");
//        }
//        // 버퍼 비우기
//        bufferedWriter.flush();
//    }
//}

// public class Main {
//    public static void main(String[] args) {
//        Scanner s = new Scanner(System.in);
//        int x = s.nextInt();
//        int n = s.nextInt();
//
//        for (int i = 1; i <= n; i++) {
//            int a = s.nextInt();
//            int b = s.nextInt();
//
//            x = x - (a * b);
//        }
//
//        if (x == 0) {
//            System.out.println("Yes");
//        } else {
//            System.out.println("No");
//        }
//    }
//}

// public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int[] data = {1, 1, 2, 2, 2, 8};
//        int[] result = new int[data.length];
//
//        for (int i = 0; i < data.length; i++) {
//            result[i] = data[i] - scanner.nextInt();
//            System.out.println(result[i]);
//        }
//    }
//}

// public class Main {
//    public static void main(String[] args) {
//        System.out.println("         ,r'\"7");
//        System.out.println("r`-_   ,'  ,/");
//        System.out.println(" \\. \". L_r'");
//        System.out.println("   `~\\/");
//        System.out.println("      |");
//        System.out.println("      |");
//    }
//}


