package lesson29;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                Random random = new Random();
                for (int i = 0; i < 1_000_000_000; i++) {
                    Thread.currentThread().isInterrupted();
                    double x = Math.sin(random.nextDouble());
                    System.out.println(i + " : " + x);
                }
            }
        });

        System.out.println("Start");

        thread.start();
        thread.stop();
        try {
            thread.join();
            thread.interrupt();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        thread.stop();
        System.out.println("Finish");
    }

}
