package Section1.hashSetEx;

import java.util.TreeSet;

public class TreeSetEx {
    public static void main(String[] args) {
        // TreeSet 생성
        TreeSet<String> treeSet = new TreeSet<>();

        // TreeSet에 요소 추가
        treeSet.add("Hong Gildong");
        treeSet.add("Tree Set");
        treeSet.add("Hello Java");

        // TreeSet 출력
        System.out.println(treeSet);
        System.out.println(treeSet.first());
        System.out.println(treeSet.last());
        System.out.println(treeSet.higher("Hello"));
        System.out.println(treeSet.subSet("Hong", "Tree"));
    }
}
