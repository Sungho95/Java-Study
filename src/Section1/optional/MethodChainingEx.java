package Section1.optional;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MethodChainingEx {
    public static void main(String[] args) {
        List<String> list = Arrays.asList(
                "C", "C++", "Java", "Python", "Kotlin"
        );

        Optional<List<String>> listOptional = Optional.of(list);

        int size = listOptional
                .map(List::size)
                .orElse(0);

        System.out.println(size);
    }
}
