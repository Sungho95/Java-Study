package section2.recursion;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class StringifyImplement {
    public static void main(String[] args) {

    }
}

class stringifyJSON {
    public String stringify(Object data) {

        //입력된 값이 문자열일 경우
        if (data instanceof String) {
            return "\"" + data + "\"";
            // return String.format("\"%s\"", data);
        }

        //입력된 값이 Integer일 경우
        if (data instanceof Integer) {
            return data+""; // +"" == toString();
            // return String.valueOf(data);
            // return Integer.toString((Integer) data);
        }

        //입력된 값이 Boolean일 경우
        if (data instanceof Boolean) {
            return data.toString();
            // return String.valueOf(data);
      /* if ((Boolean) data) return "true";
         else return "false";
      */
        }

        if (data instanceof Object[]) { // Object[] 배열로 다룰수 있게 변환하고, 이 데이터를 String으로 변환 -> 재귀를통해 리턴

            Object[] arr = (Object[]) data;
            for (int i = 0; i < arr.length; i++) {
                arr[i] = stringify(arr[i]);
            }
            return Arrays.toString(arr).replaceAll(" ", "");

//      Object[] newData = (Object[]) data;
//
//      // { "asd", 1234, null, [[], 1, 2, "hello"] }
//      // 더이상 쪼갤 수 없는 경우
//      if (newData.length == 0) return "[]";
//
//      // 쪼갤 수 있는 경우
//      Object head = newData[0];
//      String result = "";
//      for (int i = 1; i < newData.length; i++) {
//        result += "," + stringify(newData[i]);
//      }
//
//      // "[8,[[],3,4]]" strigify([[],3,4]])
//      // "[[],3,4]]"
//      // "[], 3, 4"
//      // "[8, [[], 3, 4]"
//
//      return "[" + stringify(head) + result + "]";
        }

        //입력된 값이 HashMap일 경우
        if (data instanceof HashMap) {
            HashMap<Object, Object> map = (HashMap<Object, Object>) data;
            HashMap<Object, Object> result = new LinkedHashMap<>();

            for (Map.Entry<Object, Object> entry : map.entrySet()) {
                String key = stringify(entry.getKey());
                String value = stringify(entry.getValue());

                result.put(key, value);
            }

            return result.toString().replaceAll("=", ":").replaceAll(" ", "");

//      HashMap<Object, Object> newHashMap = (HashMap<Object, Object>) data;
//
//      if (newHashMap.isEmpty()) return "{}";
//
//      Set<Object> keySet = newHashMap.keySet();
//      Iterator<Object> it = keySet.iterator();
//
//      String result = "";
//      while(it.hasNext()) {
//        Object key = it.next();
//        Object value = newHashMap.get(key);
//
//        if (it.hasNext()){
//          result += stringify(key) + ":" + stringify(value) + ",";
//        } else {
//          result += stringify(key) + ":" + stringify(value);
//        }
//
//
//      }
//      return "{" + result + "}";
        }

        //지정되지 않은 타입의 경우에는 "null"을 리턴합니다.
        return "null";
    }
}
