package Section1.listEx;

import java.util.LinkedList;
import java.util.List;

public class LinkedListEx {
    public static void main(String[] args) {
        // LinkedList 생성
        List<String> list = new LinkedList<String>();

        // String 타입의 데이터를 LinkedList에 추가
        list.add("Hello");
        list.add("Java");
        list.add("List");

        // 저장된 객체 수 얻기
        int size = list.size();

        // 0번 인덱스의 객체 저장 및 출력
        String hello = list.get(0);
        System.out.println(hello);

        // 저장된 총 객체 수 만큼 조회
        for(int i = 0; i < size; i++) {
            String str = list.get(i);
            System.out.println(str);
        }

        // 0번 인덱스에 저장된 객체 삭제
        list.remove(0);

        // for-each문으로도 사용 가능
        for (String str : list) {
            System.out.println(str);
        }
    }
}
