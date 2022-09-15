package Section1.stream;

import java.util.*;
import java.util.stream.Collectors;

class Member {
    public enum Gender {Male, Female};

    private String name;
    private int age;
    private Gender gender;

    public Member(String name, int age, Gender gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Gender getGender() {
        return gender;
    }
}


public class CollectEx {
    public static void main(String[] args) {
        List<Member> list = Arrays.asList(
                new Member("Kim", 21, Member.Gender.Male),
                new Member("Lee", 22, Member.Gender.Female),
                new Member("Park", 23, Member.Gender.Male),
                new Member("Choi", 24, Member.Gender.Female)
        );

        // 남자 멤버
        Set<Member> maleSet = list.stream()
                .filter(s -> s.getGender() == Member.Gender.Male)
                .collect(Collectors.toCollection(HashSet:: new));

        // 남자 멤버 출력
        maleSet.stream()
                .forEach(n -> System.out.println(n.getName() + " " + n.getAge()));

        // 여자 멤버
        Set<Member> femaleSet = list.stream()
                .filter(s -> s.getGender() == Member.Gender.Female)
                .collect(Collectors.toCollection(HashSet :: new));

        // 여자 멤버 출력
        femaleSet.stream()
                .forEach(n -> System.out.println(n.getName() + " " + n.getAge()));
    }
}