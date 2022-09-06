public class test extends test2 {
    public static void main(String[] args) {
        test t = new test();
        test2 t2 = new test();

        System.out.println(t.a);
        System.out.println(t.b);
        System.out.println(t.c);
//        System.out.println(t.d);
        System.out.println(t2.a);
        System.out.println(t2.b);
        System.out.println(t2.c);
//        System.out.println(t2.d);

    }
}

class test2 {
    public int a = 1;
    protected int b = 2;
    int c = 3;
    private int d = 4;
}