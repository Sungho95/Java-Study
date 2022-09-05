package Section1.accessModifier2;


import Section1.accessModifier.TestClass;

class AccessModifierEx {
    public static void main(String[] args) {
        TestClass test = new TestClass();
        TestClass2 test2 = new TestClass2();

        test2.printTest();

        test.printTest();

        System.out.println(test.testPublic);
        // System.out.println(test.testProtected);
        // System.out.println(test.testDefault);
        // System.out.println(test.testPrivate);
    }
}

class TestClass2 extends TestClass {
    public void printTest() {
        System.out.println(testPublic);
        System.out.println(testProtected);
        // System.out.println(testDefault);
        // System.out.println(testPrivate);
    }
}