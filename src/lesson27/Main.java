package lesson27;

import java.util.concurrent.Semaphore;

public class Main {
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(3);
        try {
            semaphore.acquire();
            semaphore.acquire();
            semaphore.acquire();
            System.out.println("all permits have been acquire");
            semaphore.acquire();
            System.out.println("off");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        semaphore.release();
        System.out.println(semaphore.availablePermits());
    }
}
