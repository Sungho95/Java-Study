package Section1.thread;

public class ThreadEx2 {
    public static void main(String[] args) {
        // Thread의 익명 하위 객체 생성
        Thread thread2 = new Thread() {
            // 생성된 스레드가 수행할 run() 메서드
            public void run() {
                for (int i = 0; i <= 100; i++) {
                    System.out.println("ThreadTask");
                }
            }
        };
        thread2.start();

        // 메인 스레드가 작업할 반복문
        for (int i = 0; i <= 100; i++) {
            System.out.println("MainThread");
        }


//        // Runnable 익명 구현 객체 생성
//        Thread thread1 = new Thread(new Runnable() {
//            @Override
//            // 생성된 스레드가 수행할 run() 메서드
//            public void run() {
//                for (int i =0; i <= 100; i++) {
//                    System.out.println("ThreadTask");
//                }
//            }
//        });
//        thread1.start();
//
//        // 메인 스레드가 작업할 반복문
//        for (int i = 0; i <= 100; i++) {
//            System.out.println("MainThread");
//        }
    }
}