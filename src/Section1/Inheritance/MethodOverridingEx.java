package Section1.Inheritance;

public class MethodOverridingEx {
    public static void main(String[] args) {
//        Animal animal = new Animal();
//        Dog dog = new Dog();
//        Cat cat = new Cat();
//
//        animal.run();
//        dog.run();
//        cat.run();

//        Animal[] animals = new Animal[] {new Dog(), new Cat(), new Animal()};
//        for (Animal animal : animals) {
//            animal.run();
//        }

    }
}

//class Animal {
//    void run() {
//        System.out.println("동물이 달린다.");
//    }
//}
//
//class Dog extends Animal {
//    void run() {
//        System.out.println("강아지가 달린다.");
//    }
//}


class Cat extends Animal {
    void run() {
        System.out.println("고양이가 달린다.");
    }
}