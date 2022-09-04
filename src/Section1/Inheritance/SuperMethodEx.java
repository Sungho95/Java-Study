package Section1.Inheritance;

public class SuperMethodEx {
    public static void main(String[] args) {
        Dog dog = new Dog();
    }
}

class Animal {
    Animal() {
        System.out.println("Animal 클래스 생성자");
    }
}

class Dog extends Animal {
    Dog() {
        super(); // Animal 생성자 호출
        System.out.println("Dog 클래스 생성자");
    }
}
