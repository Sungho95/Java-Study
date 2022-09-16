package Section1.thread;

public class ThreadSyncEx {
    public static void main(String[] args) {
        Runnable thread = new CreateThread();
        // 2개의 작업 스레드 생성
        Thread thread1 = new Thread(thread);
        Thread thread2 = new Thread(thread);

        thread1.setName("스레드1");
        thread2.setName("스레드2");

        thread1.start();
        thread2.start();
    }
}

class Money {
    // 현재 가지고 있는 금액
    private int myMoney = 10000;

    public int getMyMoney() {
        return myMoney;
    }
    // 메서드 전체를 임계영역으로 설정
    public synchronized boolean withdraw(int money) {
        if (myMoney >= money) {
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(e);
            }
            myMoney -= money;
            return true;
        }
        return false;
    }
}

//    public synchronized boolean withdraw(int money) {
//        // 메서드 전체를 임계영역으로 설정
//        synchronized (this) {
//            if (myMoney >= money) {
//                try {
//                    Thread.sleep(1000);
//                } catch (Exception e) {
//                    System.out.println(e);
//                }
//                myMoney -= money;
//                return true;
//            }
//            return false;
//        }
//    }
//}

//    public boolean withdraw(int money) {
//        // 가지고 있는 금액이 출금할 금액보다 크거나 같을 때만 출금
//        if (myMoney >= money) {
//            // 스레드 동시 접근을 위한 코드
//            try {
//                Thread.sleep(1000);
//            } catch (Exception e) {
//                System.out.println(e);
//            }
//
//            // 출금
//            myMoney -= money;
//
//            return true;
//        }
//        return false;
//    }
//}

class CreateThread implements Runnable {
    Money myMoney = new Money();

    public void run() {
        while (myMoney.getMyMoney() > 0) {
            // 1000 ~ 5000원씩 출금
            int money = (int)(Math.random() * 5 + 1) * 1000;

            // 출금 실행 코드. 실패시 true 반환
            boolean denied = !myMoney.withdraw(money);

            // 출금 과정 출력
            if (denied) {
                System.out.println("출금 거부");
            } else {
                System.out.printf("스레드: %s 출금: %d원  남은금액: %d원\n",
                        Thread.currentThread().getName(), money, myMoney.getMyMoney());
            }
        }
    }
}