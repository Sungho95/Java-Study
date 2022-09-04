package Section1.Inheritance;

class Person {
    String name;
    int age;

    void learn() {
        System.out.println("공부하기");
    }

    void walk() {
        System.out.println("걷기");
    }

    void eat() {
        System.out.println("식사하기");
    }
}

class Programmer extends Person {

    void coding() {
        System.out.println("코딩하기");
    }
}

public class PersonEx {
    public static void main(String[] args) {
        Person p = new Person();
        p.name = "홍길동";
        p.age = 20;

        System.out.println("이름: " + p.name);
        System.out.println("나이: " + p.age);
        p.eat();
        p.learn();
        p.walk();

        Programmer programmer = new Programmer();
        programmer.name = "머스크";
        programmer.age = 25;
        System.out.println("이름: " + programmer.name);
        System.out.println("나이: " + programmer.age);
        programmer.eat();
        programmer.learn();
        programmer.walk();
        programmer.coding();

    }
}