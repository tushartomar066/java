package Core.Topic_8_multithreading.Topic_5_locks;

class a extends Thread {
    bankAccount bc1 = new bankAccount();

    @Override
    public void run() {
        try {
            bc1.withdrawal(3400);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }

}

public class mainFnWithThread {
    public static void main (String[] args) throws InterruptedException {
        a t1 = new a();
        a t2 = new a();
        t1.setName("Thread 1");
        t2.setName("Thread 2");
        t1.start();
        t1.join();
        t2.start();
    }
}
