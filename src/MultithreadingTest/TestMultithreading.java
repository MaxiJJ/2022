package MultithreadingTest;

import java.util.Scanner;

public class TestMultithreading {
    public static void main(String[] args) {
        MyThread mt = new MyThread();
        mt.start();

        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();

        mt.shutdown();
    }
}

class MyThread extends Thread {
    private volatile boolean running = true;

    public void run() {
        while (running) {
            System.out.println("hello");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void shutdown() {
        this.running = false;
    }
}
