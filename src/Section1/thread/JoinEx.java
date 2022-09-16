package Section1.thread;

public class JoinEx {
    public static void main(String[] args) {
        SumThread sumThread = new SumThread();

        sumThread.setEnd(100);
        sumThread.start();

        try {
            sumThread.join();
        } catch (Exception e) {}
        System.out.printf("1부터 %d까지 합 : %d", sumThread.getEnd(), sumThread.getSum());
    }
}

class SumThread extends Thread {
    private long sum;
    private int end;

    public long getSum() {
        return sum;
    }

    public int getEnd() {
        return end;
    }

    public void setEnd(int end) {
        this.end = end;
    }

    public void run() {
        for (int i = 0; i <= end; i++) {
            sum += i;
        }
    }
}