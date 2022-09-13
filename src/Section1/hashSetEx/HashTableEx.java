package Section1.hashSetEx;

import java.util.*;

public class HashTableEx {
    public static void main(String[] args) {
        // HashTable 생성
        Hashtable<String, Integer> hashTable = new Hashtable<>();

        // Entry 객체 저장
        hashTable.put("부산", 1);
        hashTable.put("인천", 2);
        hashTable.put("대구", 3);
        hashTable.put("대전", 4);
        hashTable.put("광주", 5);
        hashTable.put("울산", 6);

        // 저장된 총 Entry 수 얻기
        int size = hashTable.size();
        System.out.println(size);

        // 객체 찾기
        Object object = hashTable.get("부산");
        System.out.println(object);

        // key를 요소로 가지는 Set 생성
        Set<String> keySet = hashTable.keySet();
        System.out.println(keySet);

        // value 값 읽기
        Iterator<String> keyIterator = keySet.iterator();
        while (keyIterator.hasNext()) {
            String key = keyIterator.next();
            Integer value = hashTable.get(key);
            System.out.println("키 : " + key + " 값 : " + value);
        }

        // 객체 삭제 후 크기 출력
        hashTable.remove("부산");
        System.out.println(hashTable.size());

        // Entry 객체를 요소로 가지는 Set을 생성
        Set<Map.Entry<String, Integer>> entrySet = hashTable.entrySet();

        // entrySet을 순회하면서 value 값 읽기
        Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();

        while (entryIterator.hasNext()) {
            Map.Entry<String, Integer> entry = entryIterator.next();
            String key = entry.getKey(); // Map.Entry 인터페이스의 메서드
            Integer value = entry.getValue(); // Map.Entry 인터페이스의 메서드
            System.out.println("키 : " + key + " 값 : " + value);
        }

        // 전체 객체 삭제
        hashTable.clear();

    }
}
