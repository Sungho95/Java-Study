import java.lang.reflect.AnnotatedArrayType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
@Deprecated

public class Main {
    public static void main(String[] args) {
        String str = "hello";

        if (str.length() == 0) {
            System.out.println("아무것도 없음");
        }

//        HashMap<Character, Integer> hash = new HashMap<>();
//        // h -> e -> l -> l -> o
//        for (int i = 0; i < str.length(); i++) {
//            char ch = str.charAt(i);
//            if (!hash.containsKey(ch)) {
//                hash.put(ch, 1); // int 래퍼 클래스니까 int로 연산이 되긴하다.
//                System.out.println(hash);
//            } else {
//                hash.put(ch, hash.get(ch) + 1 );
//                System.out.println(hash);
//            }
//        }
    }
}
