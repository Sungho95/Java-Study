package Section1.accessModifier;


public class TestClass {
    public int testPublic = 1;
    protected int testProtected = 2;
    int testDefault = 3;
    private int testPrivate = 4;

    public void printTest() {
        System.out.println(testPublic);
        System.out.println(testProtected);
        System.out.println(testDefault);
        System.out.println(testPrivate);
    }
}