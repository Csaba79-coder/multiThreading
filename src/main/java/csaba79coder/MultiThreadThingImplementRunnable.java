package csaba79coder;

public class MultiThreadThingImplementRunnable implements Runnable {

    // it gives more flexibility!

    private int threadNumber;

    public MultiThreadThingImplementRunnable(int threadNumber) {
        this.threadNumber = threadNumber;
    }
    @Override
    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println(i + " thread number (runnable) " + threadNumber);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
