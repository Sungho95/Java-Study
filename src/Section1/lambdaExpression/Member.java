package Section1.lambdaExpression;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Member {
    private String name;
    private String id;

    public Member() {
        System.out.println("Member() 생성자");
    }

    public Member(String id) {
        System.out.println("Member(String id) 생성자");
        this.id = id;
    }

    public Member(String name, String id) {
        System.out.println("Member(String name, String id) 생성자");
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }
}

class ConstructorReferenceEx {
    public static void main(String[] args) {
        Function<String, Member> function1 = Member::new;
        Member member1 = function1.apply("id");

        BiFunction<String, String, Member> function2 = Member::new;
        Member member2 = function2.apply("id", "name");
    }
}