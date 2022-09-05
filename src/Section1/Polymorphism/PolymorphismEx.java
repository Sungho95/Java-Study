package Section1.Polymorphism;

class Human {
    public void info() {
        System.out.println("나는 사람입니다.");
    }
}

class Female extends Human {
    public void info() {
        System.out.println("나는 여자입니다.");
    }
}

class Male extends Human {
    public void info() {
        System.out.println("나는 남자입니다.");
    }
}

public class PolymorphismEx {
    public static void main(String[] args) {
        Human human = new Human();
        Female female = new Female();
        Human male = new Male();

        human.info();
        female.info();
        male.info();
    }
}