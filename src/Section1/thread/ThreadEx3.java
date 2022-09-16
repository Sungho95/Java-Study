package Section1.thread;

public class ThreadEx3 {
    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()); // Thread-0
            }
        });

        thread.start();
        System.out.println(Thread.currentThread().getName()); // main
    }
}
