package section2.stackAndQueue;


import java.util.Stack;

class StackEx {
    public static void main(String[] args) {
        // Integer형 스택 선언
        Stack<Integer> stackInt = new Stack<>();


        stackInt.push(1);
        stackInt.push(2);
        stackInt.push(3);
        stackInt.push(1);

        System.out.println(stackInt.search(2));
        System.out.println(stackInt.search(1));
        System.out.println(stackInt.search(4));
    }
}
