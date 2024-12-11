package Core.Topic_8_multithreading.Topic_5_locks;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class reentrantExample {
    Lock lock = new ReentrantLock();
    // in reentrant lock variable count the locks make pair such that for every lock there is one unlock
    public void outerloop() {
        lock.lock();
        System.out.println("outer Loop");
        innerloop();
        lock.unlock();
    }

    private void innerloop() {
        lock.lock();
        System.out.println("inner loop");
        lock.unlock();
    }

    public static void main(String[] args) {
        reentrantExample E1 = new reentrantExample();
        E1.outerloop();
    }

}
