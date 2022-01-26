package MultithreadingTest;

public class TestSynchronized {
    private int counter;

    public static void main(String[] args) throws InterruptedException {
        TestSynchronized ts = new TestSynchronized();
        ts.doWork();
    }

    public synchronized void increment() {
        counter++;
    }

    public void doWork() throws InterruptedException {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    increment();
                }
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    increment();
                }
            }
        });

        thread.start();
        thread2.start();

        thread.join();
        thread2.join();

        System.out.println(counter);
    }
}
