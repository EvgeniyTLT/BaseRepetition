package lesson23;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        WeitAndNotify wn = new WeitAndNotify();
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    wn.produse();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    wn.consume();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class WeitAndNotify {
    private Object lock = new Object();

    public void produse() throws InterruptedException {
        synchronized (lock) {
            System.out.println("Produse thread started...");
            lock.wait();
            System.out.println("Produse thread resume...");
        }
    }

    public void consume() throws InterruptedException {
        Thread.sleep(2000);
        Scanner scanner = new Scanner(System.in);
        synchronized (lock) {
            System.out.println("Waiting for return key pressed");
            scanner.nextLine();
            lock.notify();
            Thread.sleep(5000);
        }

    }
}