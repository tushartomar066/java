package Core.Topic_8_multithreading.Topic_5_locks;

class b implements Runnable {
    bankAccount bk2 = new bankAccount();

    @Override
    public void run() {
        try {
            bk2.withdrawal(34);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}

public class mainFnWithRunnable {
    public static void main(String[] args) {
        b b1 = new b();

        Thread t1 = new Thread(b1, "Thread 1 -> ");
        Thread t2 = new Thread(b1, "Thread 2 -> ");
        t1.start();
        t2.start();

        /*
        <---------- this is by making the anonymous class ------->

        bankAccount bankaccount1 = new bankAccount();
        Runnable run = new Runnable() {
            @Override
            public void run() {
                try {
                    bankaccount1.withdrawal(50);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };
        */

    }
}
