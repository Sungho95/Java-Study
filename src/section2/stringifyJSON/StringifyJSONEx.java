package section2.stringifyJSON;

import java.util.HashMap;
import java.util.Map;

public class StringifyJSONEx {
    public static void main(String[] args) {
        Map<String, String> message = new HashMap<>();

        message.put("name", "홍길동");
        message.put("address", "서울");
        message.put("job", "프로그래머");
        message.put("skill", "자바");
        System.out.println(message.toString());

        // 직렬화와 역직렬화를 하기 위해서는 Jackson 라이브러리가 필요함.
//        ObjectMapper mapper = new ObjectMapper();
//        String json = mapper.writeValueAsString(message);
//        System.out.println(json);
//
//        Map<String, String> deserialized = mapper.readValue(json, Map.class);
//        System.out.println(deserialized);
    }
}
