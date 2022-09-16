package Section1.thread;

public class ThreadName2 {
    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("thread1 실행");
            }
        });
        thread.start();

        // thread 이름 조회
        System.out.println("이름: " + thread.getName());

        // thread 이름 설정
        thread.setName("New Thread");

        // 스레드 이름 다시 조회
        System.out.println("이름: " + thread.getName());
    }
}
