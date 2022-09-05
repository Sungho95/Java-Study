package Section1.Polymorphism;

public class InstanceOfEx {
    public static void main(String[] args) {
        Animal animal = new Animal();
        System.out.println(animal instanceof Object); //
        System.out.println(animal instanceof Animal);
        System.out.println(animal instanceof Dog);
        System.out.println(animal instanceof Cat);

        Animal cat = new Cat();
        System.out.println(cat instanceof Object);
        System.out.println(cat instanceof Animal);
        System.out.println(cat instanceof Dog);
        System.out.println(cat instanceof Cat);
    }
}

class Animal {
}

class Dog extends Animal{
}

class Cat extends Animal{
}