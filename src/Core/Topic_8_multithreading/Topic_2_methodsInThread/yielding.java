package Core.Topic_8_multithreading.Topic_2_methodsInThread;

public class yielding extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 4; i++) {
            Thread.yield();
            System.out.println(Thread.currentThread().getName());
        }
    }

    /* a static method of Thread class, and it can stop the currently executing thread and will give a chance to other waiting threads of the same priority*/

    public static void main(String[] args) {

        yielding t1 = new yielding();
        yielding t2 = new yielding();
        t1.setName("pappu");
        t2.setName("handsome");
        t1.start();
        t2.start();

    }
}
