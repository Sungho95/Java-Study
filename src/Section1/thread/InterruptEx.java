package Section1.thread;

public class InterruptEx {
    public static void main(String[] args) {
        Thread thread = new Thread() {
            public void run() {
                try {
                    while (true) Thread.sleep(10000);
                } catch (Exception e) {}
                System.out.println("정지 상태 해제");
            }
        };
        // 생성된 상태
        System.out.println(thread.getState());

        // 스레드 실행
        thread.start();

        // 실행 상태
        System.out.println(thread.getState());

        // 정지 상태
        while (true) {
            if (thread.getState() == Thread.State.TIMED_WAITING) {
                System.out.println(thread.getState());
                break;
            }
        }

        // 인터럽트 메서드 실행
        thread.interrupt();

        // 실행 상태
        while (true) {
            if (thread.getState() == Thread.State.RUNNABLE) {
                System.out.println(thread.getState());
                break;
            }
        }

        // 정지 상태
        while (true) {
            if (thread.getState() == Thread.State.TERMINATED) {
                System.out.println(thread.getState());
                break;
            }
        }
    }
}