package Core.Topic_8_multithreading.Topic_2_methodsInThread;

public class interupptttt extends Thread {
    @Override
    public void run() {
        try {
            Thread.sleep(2000);

        } catch (InterruptedException e) {
            System.out.println("interuppt");
        }

    }
    /* if any thread is in sleeping or waiting state (i.e. sleep() or wait() is invoked), calling the interrupt() method on the thread, breaks out the sleeping or waiting state throwing InterruptedException. If the thread is not in the sleeping or waiting state, calling the interrupt() method performs normal behavior and doesn’t interrupt the thread */

    public static void main(String[] args) {
        interupptttt t1 = new interupptttt();
        t1.start();
        t1.interrupt();
    }
}
