package Section1.Constructor;

public class ConstructorEx {
    public static void main(String[] args) {
        Constructor constructor1 = new Constructor();
        Constructor constructor2 = new Constructor(5);
        Constructor constructor3 = new Constructor("Java");
        Constructor constructor4 = new Constructor(2.0, 4.5);

    }
}

class Constructor {
    Constructor() {
        System.out.println("생성자1");
    }
    Constructor(int a) {
        System.out.println("생성자2");
    }
    Constructor(String str) {
        System.out.println("생성자3");
    }
    Constructor(double a, double b) {
        System.out.println("생성자4");
    }
}
