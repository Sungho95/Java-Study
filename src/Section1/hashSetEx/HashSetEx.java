package Section1.hashSetEx;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetEx {
    public static void main(String[] args) {
        // HashSet 생성
        HashSet<String> hashSet = new HashSet<>();

        // HashSet에 객체 추가
        hashSet.add("Hello");
        hashSet.add("Java");
        hashSet.add("World");
        hashSet.add("hello");
        hashSet.add("java");
        hashSet.add("world");
        hashSet.add("Hello");
        hashSet.add("Java");
        hashSet.add("World");

        // iterator 생성
        Iterator i = hashSet.iterator();

        // iterator i를 통해 HashSet을 순회하며 각 요소들을 출력
        while(i.hasNext()) {
            System.out.println(i.next());
        }
    }
}
