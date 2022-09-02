package Section1.Constructor;

public class ConstructorEx2 {
    public static void main(String[] args) {
        Animal dog = new Animal("dog", "멍멍");
        Animal cat = new Animal("cat", "야옹");

        System.out.println("동물 " + dog.getAnimal() + "의 울음소리 " + dog.getCry());
        System.out.println("동물 " + cat.getAnimal() + "의 울음소리 " + cat.getCry());
    }
}

class Animal {
    String animalName;
    String cry;

    Animal(String animal, String cry){
        this.animalName = animal;
        this.cry = cry;
    }
    String getAnimal() {
        return animalName;
    }
    String getCry() {
        return cry;
    }
}