package Section1.Polymorphism;

public class MainTest {
    public static void main(String[] args) {
        Child1 child1 = new Child1();

        // 업 캐스팅 () 생략 가능
        Parents parents = (Parents) child1;

        // 다운 캐스팅 () 생략 불가능
        Child1 child11 = (Child1) parents;

        // Child1과 Child2는 상속 관계가 아니므로 형변환 불가능
        // Child2 child2 = (Child2) child1;

        parents.print();
        // parents.info();
        child1.info();
        child1.print();

    }
}

class Parents {
    void print() {
        System.out.println("Hello");
    }
}

class Child1 extends Parents {
    void info() {
        System.out.println("child1");
    }
}

class Child2 extends Parents {
    void info() {
        System.out.println("child2");
    }
}