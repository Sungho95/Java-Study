package Section1.optional;

import java.util.Optional;

public class OptionalEx {
    public static void main(String[] args) {
//        Optional<String> opt1 = Optional.ofNullable(null);
//        Optional<String> opt2 = Optional.ofNullable("123");
//
//        System.out.println(opt1.isPresent());
//        System.out.println(opt2.isPresent());
//
//        Optional<String> opt3 = Optional.empty();
//        System.out.println(opt3);

        Optional<String> opt = Optional.of("Hello Java World");
        System.out.println(opt);
        System.out.println(opt.get());

        String nullStr = null;
        String str = Optional.ofNullable(nullStr).orElse("Default");
        System.out.println(str);
    }
}
