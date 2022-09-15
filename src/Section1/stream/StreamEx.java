package Section1.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamEx {
    private String name;
    private int age;

    public StreamEx(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

class StreamLambdaEx {
    public static void main(String[] args) {
        List<StreamEx> list = Arrays.asList(
                new StreamEx("홍길동", 20),
                new StreamEx("임꺽정", 30)
        );

        Stream<StreamEx> stream = list.stream();
        stream.forEach(i -> {
            String name = i.getName();
            int age = i.getAge();
            System.out.println(name + " " + age);
        });
    }
}