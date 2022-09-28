package section2.regex;

import java.util.regex.Pattern;

public class RegexTest {
    public static void main(String[] args) {
//        String phoneNumber1 = "010-1234-5678";
//        String phoneNumber2 = "010-123-4567";
//        String regExp = "010-\\d{3,4}-\\d{4}";
//
//        // phoneNumber1 정규 표현식 검증
//        System.out.println(Pattern.matches(regExp, phoneNumber1));
//        System.out.println(Pattern.matches(regExp, phoneNumber2));
        String email1 = "abc123@abc123.co.kr";
        String email2 = "It is not an email";
        String regExp = "\\w+@\\w+\\.\\w+(\\.\\w+)?";

        // 정규 표현식 검증
        System.out.println(Pattern.matches(regExp, email1));
        System.out.println(Pattern.matches(regExp, email2));
    }
}
