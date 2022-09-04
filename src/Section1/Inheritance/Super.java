package Section1.Inheritance;

public class Super {
    public static void main(String[] args) {
        Child me1 = new Child();
        Child me2 = new Child();

        System.out.println(me1.equals(me2));
        System.out.println();
        me1.PrintMe();
    }
}

class Parents {
    String me = "Parents";
}

class Child extends Parents {
    String me = "Child";

    void PrintMe() {
        System.out.println(super.me); // Parents
        System.out.println(this.me); // Child
    }
}