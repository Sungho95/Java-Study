package Section1.thread;

public class ThreadName {
    public static void main(String[] args) {
        // Runnable 익명 구현 객체
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("thread1 실행");
            }
        });
        thread1.start();

        // thread1 이름 조회
        System.out.println("이름: " + thread1.getName());

        // Thread 익명 하위 객체
        Thread thread2 = new Thread() {
            public void run() {
                System.out.println("thread2 실행");
            }
        };
        thread2.start();

        // thread2 이름 조회
        System.out.println("이름: " + thread2.getName());
    }
}
