package Core.Topic_8_multithreading.Topic_5_locks;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class bankAccount {
    private final Lock lock = new ReentrantLock();
    private int balance = 100;

    public void withdrawal(int amount) throws InterruptedException {
        System.out.println(Thread.currentThread().getName() +" attempting to widthdraw "+amount);
        try {
            if (lock.tryLock(1000, TimeUnit.MILLISECONDS)) {
                if (amount <= balance) {
                    try {
                        System.out.println(Thread.currentThread().getName() + " preceding with the widthdraw" + " amount ");

                        Thread.sleep(3000);
                        balance -= amount;
                        System.out.println(Thread.currentThread().getName() + " widthdrawl completed " + " amount");
                    } catch (Exception e) {
                        Thread.currentThread().interrupt();

                    } finally {
                        lock.unlock();
                    }
                } else {
                    System.out.println(Thread.currentThread().getName() + " insufficient balance ");
                }

            } else {
                System.out.println("server busy "+ Thread.currentThread().getName());
            }
        } catch (InterruptedException e) {
            // yeh clean up krne k liye likha hai , manually restore ki hai thread ki state
            Thread.currentThread().interrupt();
        }
        if (Thread.currentThread().isInterrupted()) {
            System.out.println("yha koi clean up code ya maintainance code chal ske");
        }

    }
}
