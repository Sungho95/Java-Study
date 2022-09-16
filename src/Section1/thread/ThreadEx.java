package Section1.thread;

public class ThreadEx {
    public static void main(String[] args) {
        // Thread 클래스를 상속 받은 클래스를 인스턴스화 한다.
        Thread thread = new MakeThread();

        // start() 메서드를 통해 스레드를 실행시킨다.
        thread.start();

        // 메인 스레드가 작업할 반복문
        for (int i = 0; i <= 100; i++) {
            System.out.println("Main");
        }
    }
}

// 1. Thread 클래스를 상속 받는 하위 클래스를 생성한다.
class MakeThread extends Thread {
    // 2. run() 메서드를 오버라이딩 하여 생성된 스레드가 수행할 코드를 작성한다.
    public void run() {
        for (int i = 0; i <= 100; i++) {
            System.out.println("ThreadTask");
        }
    }
}

//public class ThreadEx {
//    public static void main(String[] args) {
//        System.out.println(Thread.currentThread().getName());
//        Runnable task = new MakeThread();
//        Thread thread = new Thread(task);
//        thread.start();
//
//        System.out.println(Thread.currentThread());
//        for (int i = 0; i <= 100; i++) {
//            System.out.print("Main");
//        }
//
//    }
//}
//
//class MakeThread implements Runnable {
//    public void run() {
//        for (int i = 0; i <= 100; i++) {
//            System.out.print(i);
//        }
//    }
//}
