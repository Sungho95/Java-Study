public class TypeEx {
    public static void main(String[] args) {
        int primitive = 1;
        Object reference = new Object();

        System.out.println(primitive);
        System.out.println(reference);

        long bigNumber = 123456789123L;
        System.out.println(bigNumber);

        long longValue = 123L;
        float floatValue = longValue;

        System.out.println(floatValue); // 123.0 출력

        long longValue2 = 2147483648L;
        int intValue = (int)longValue2;

        System.out.println(intValue); // -2147483648 출력
    }
}
