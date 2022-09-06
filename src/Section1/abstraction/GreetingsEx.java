package Section1.abstraction;

interface Country {
    public abstract void greetings();
}

class User {
    public void callCountry(Country country) {
        country.greetings();
    }
}

class Korean3 implements Country {
    public void greetings() {
        System.out.println("대한민국");
        System.out.println("안녕하세요");
    }
}

class American3 implements Country {
    public void greetings() {
        System.out.println("미국");
        System.out.println("Hello");
    }
}

public class GreetingsEx {
    public static void main(String[] args) {
        User user = new User();
        user.callCountry(new Korean3());
        user.callCountry(new American3());
    }
}
//class GreetingsEx {
//    public static void main(String[] args) {
//        Human korean = new Korean();
//        American american = new American();
//
//        korean.greetings();
//        american.greetings();
//    }
//}
//
//abstract class Human {
//    public String contry;
//    public abstract void greetings();
//}
//
//class Korean extends Human {
//    public Korean() {
//        this.contry = "대한민국";
//    }
//
//    public void greetings() {
//        System.out.println("안녕하세요");
//    }
//}
//
//class American extends Human {
//    public American() {
//        this.contry = "미국";
//    }
//
//    public void greetings() {
//        System.out.println("Hello");
//    }
//}