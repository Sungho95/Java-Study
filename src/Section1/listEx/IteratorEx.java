package Section1.listEx;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorEx {
    public static void main(String[] args) {
        // ArrayList 생성
        List<String> list = new ArrayList<String>();

        // String 타입의 데이터를 ArrayList에 추가
        list.add("Hello");
        list.add("Java");
        list.add("List");
        list.add("Hello");
        list.add("Java");
        list.add("List");

        // Iterator 인스턴스 생성
        Iterator<String> iterator = list.iterator();

        // 읽어올 다음 객체가 있으면 true
        while (iterator.hasNext()) {
            String str = iterator.next();
            if(str.equals("Hello")) {
                iterator.remove();
                continue;
            }
            System.out.println(str);
        }
    }
}
