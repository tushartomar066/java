package Core.Topic_8_multithreading.Topic_1_BasicsOfThreading.ByRunnalbeInterface;

class temp implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName());
        }
    }
}

public class multipleThreads {
    public static void main(String[] args) {
        temp a1 = new temp();
        Thread t1 = new Thread(a1, "tushar");
        Thread t2 = new Thread(a1, "singh");
        Thread t3 = new Thread(a1, "tomar");
        t1.start();
        t2.start();
        t3.start();
    }


}
