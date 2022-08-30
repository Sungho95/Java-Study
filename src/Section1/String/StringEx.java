package Section1.String;

import java.sql.SQLOutput;

class StringEx {
    public static void main(String[] args) {
//        String str1 = "Hello world!";
//        String str2 = new String("Hello Java!");
//
//        System.out.println(str1); // "Hello world!" 출력
//        System.out.println(str2); // "Hello Java!" 출력

//        String str1 = "Hello World!";
//        String str2 = "Hello World!";
//
//        String str3 = new String("Hello World!");
//        String str4 = new String("Hello World!");
//
//        System.out.println(str1 == "Hello World!");      // true
//        System.out.println(str1 == str2);                // true
//        System.out.println(str1 == str3);                // false
//        System.out.println(str1 == str4);                // false
//        System.out.println(str3 == str4);                // false
//        System.out.println();
//        System.out.println(str1.equals("Hello World!"));  // true
//        System.out.println(str1.equals(str2));            // true
//        System.out.println(str1.equals(str3));            // true
//        System.out.println(str1.equals(str4));            // true
//        System.out.println(str3.equals(str4));            // true

//        String str = new String("Java");

//        System.out.println(str); // Java
//        System.out.println(str.charAt(0)); // J
//        System.out.println(str.charAt(1)); // a
//        System.out.println(str.charAt(2)); // v
//        System.out.println(str.charAt(3)); // a

//        System.out.println(str);
//        System.out.println(str.compareTo("aJav"));
//        System.out.println(str.compareTo("Java"));
//        System.out.println(str.compareTo("java"));
//        System.out.println(str.compareToIgnoreCase("java"));

//        System.out.println(str); // Java
//        System.out.println(str.concat(", Hi"));

        String str = new String("   Hello   ");

//        System.out.println(str); // Hello
//        System.out.println(str.indexOf('H'));       // 0
//        System.out.println(str.indexOf('o'));       // 4
//        System.out.println(str.indexOf('l'));       // 2
//        System.out.println(str.indexOf('a'));       // -1
//        System.out.println(str.indexOf("Hello"));   // 0
//        System.out.println(str.indexOf("llo"));     // 2

        System.out.println(str);                // "   Hello   "
        System.out.println(str.trim());         // "Hello"
        System.out.println(str + '!');          // "   Hello   !"
        System.out.println(str.trim() + '!');   // "Hello!"
    }
}