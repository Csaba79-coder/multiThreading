package csaba79coder;

public class MultiThreadThingExtendsThread extends Thread {

    // JAVA does not allow multiple inheritance! so if the class already extends ... use interface implementation!

    private int threadNumber;

    public MultiThreadThingExtendsThread() {

    }
    public MultiThreadThingExtendsThread(int threadNumber) {
        this.threadNumber = threadNumber;
    }


    @Override
    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println(i + " thread number (extends) " + threadNumber);

            /*if (threadNumber == 3) {
                throw new RuntimeException();
            }*/

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
