package Section1.abstraction;

public interface Contry {
    void country();
}
interface Greetings {
    void greetings();
}

class Korean2 implements Contry, Greetings {
    public void country() {
        System.out.println("대한민국");
    }

    public void greetings() {
        System.out.println("안녕하세요");
    }
}

class American2 implements Contry, Greetings {
    public void country() {
        System.out.println("미국");
    }

    public void greetings() {
        System.out.println("Hello");
    }
}

class GreetingsEx2 {
    public static void main(String[] args) {
        Korean2 korean = new Korean2();
        American2 american = new American2();

        korean.country();
        korean.greetings();

        american.country();
        american.greetings();
    }
}