import java.util.StringTokenizer;

public class StringTokenizerEx {
    public static void main(String[] args) {
        String str = "Hello my name is Hong-Gildong, I'm studying Java.";

        // StringTokenizer 인스턴스 생성
//        StringTokenizer tokenizer = new StringTokenizer(str);

        StringTokenizer tokenizer = new StringTokenizer(str, ",");

        System.out.println("남은 토큰 수:" + tokenizer.countTokens());
        System.out.println(tokenizer.nextToken());
        System.out.println(tokenizer.nextToken());
        System.out.println("남은 토큰 수:" + tokenizer.countTokens());

//        // 기존 문자열 출력
//        System.out.println(str);
//        // 토큰 메서드를 활용하지 않으면 제대로 출력이 되지 않음
//        System.out.println(tokenizer);
//
//        // countTokens() 메서드를 활용하여 남은 토큰 개수 확인 : 8
//        System.out.println("남은 토큰 수:" + tokenizer.countTokens());
//
//        // 반복문과 nextToken() 메서드를 활용하여 토큰들을 출력
//        while (tokenizer.hasMoreTokens()) {
//            System.out.println(tokenizer.nextToken());
//        }
//
//        // 다시 countTokens()를 확인하여 남은 토큰 개수 확인 : 0 (모두 사용)
//        System.out.println("남은 토큰 수:" + tokenizer.countTokens());
    }
}