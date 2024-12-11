package Core.Topic_8_multithreading.Topic_2_methodsInThread;

public class DeamonThread extends Thread {
    @Override
    public void run() {
//        while (true) {
//            System.out.println("thread executing");
//            try {
//                Thread.sleep(2000);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        }
        for( ; ; ){
            System.out.println(Thread.currentThread().getName());
        }
    }
    /*a low-priority thread that performs background operations such as garbage collection, finalizer, Action Listeners, Signal dispatches, etc.*/

    public static void main(String[] args) {
        DeamonThread t1 = new DeamonThread();

        t1.setDaemon(true);
        t1.start();
        System.out.println("hello main executed");
    }
}
