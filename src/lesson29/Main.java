package lesson29;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                Random random = new Random();
                for (int i = 0; i < 1_000_000_000; i++) {
                    if (Thread.currentThread().isInterrupted()) {
                        System.out.println("Thread stop");
                        break;
                    }
                    double x = Math.sin(random.nextDouble());
                    System.out.println(i + " : " + x);
                }
            }
        });
        System.out.println("Start");
        thread.start();
        try {
            Thread.sleep(500);
            thread.interrupt();
            thread.join();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Finish");
    }
}
