package Core.Topic_8_multithreading.Topic_1_BasicsOfThreading.ByRunnalbeInterface;

class x implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}

public class main {
    public static void main(String[] args) {
        /* passing runnable object to the constructor of thread class*/
        x x1 = new x();
        Thread t2 = new Thread(x1, "tushar");

        t2.start();
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName());
        }
    }
}
