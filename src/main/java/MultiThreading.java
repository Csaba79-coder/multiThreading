import csaba79coder.MultiThreadThingExtendsThread;
import csaba79coder.MultiThreadThingImplementRunnable;

public class MultiThreading {

    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            MultiThreadThingExtendsThread threadForLoop = new MultiThreadThingExtendsThread();
            threadForLoop.start();
        }

        MultiThreadThingExtendsThread thread = new MultiThreadThingExtendsThread();
        MultiThreadThingExtendsThread thread2 = new MultiThreadThingExtendsThread();

        // thread.run(); -> this case does not use thread!!!
        // thread2.run(); -> first finish the first loop, then starts the second!
        thread.start();
        thread2.start();

        for (int i = 0; i < 5; i++) {
            MultiThreadThingExtendsThread multiThreadThingExtendsThread = new MultiThreadThingExtendsThread(i);
            multiThreadThingExtendsThread.start();
        }
        // throw new RuntimeException();

        for (int i = 0; i < 3; i++) {
            MultiThreadThingImplementRunnable runnable = new MultiThreadThingImplementRunnable(i);
            Thread threadRunnable = new Thread(runnable);
            threadRunnable.start();
            /*try {
                threadRunnable.join(); // stop the whole program execution when thread was ready!
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }*/
            boolean threadIsAlive = threadRunnable.isAlive(); // returns a boolean
            System.out.println(threadIsAlive);
        }
    }
}
