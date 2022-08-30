package Section1.String;

public class StringBuilderEx {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("안녕하세요 ").append("홍길동입니다.");
        String str = stringBuilder.toString();

        System.out.println(stringBuilder);
        System.out.println(str);
    }
}
