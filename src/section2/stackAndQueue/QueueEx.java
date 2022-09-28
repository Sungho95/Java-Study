package section2.stackAndQueue;
import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {
    public static void main(String[] args) {
        Queue<Integer> queueInt = new LinkedList<>();

        System.out.println(queueInt.element());

        queueInt.add(1);
        queueInt.add(2);
        queueInt.add(3);

        System.out.println(queueInt.element());
        System.out.println(queueInt);

//        // 값 추가 offer()
//        queueInt.offer(1);
//        queueInt.offer(2);
//        queueInt.offer(3);
//        System.out.println(queueInt.offer(4));
//
//        // 값 제거 poll() / remove()
//        queueInt.poll();
//        queueInt.poll();
//        queueInt.remove();
//        queueInt.remove();
//
//        // 값 추가 add()
//        System.out.println(queueInt.add(1));
//        queueInt.add(2);
//        queueInt.add(3);
//
//        // 값 모두 제거
//        queueInt.clear();
//        System.out.println(queueInt.element());
    }
}
