package Core.Topic_8_multithreading.Topic_4_Synchronisation;

public class mainClass {
    public static void main(String[] args) throws InterruptedException {
        counter counter = new counter();
        // sharing one object to multiple thread
        myThread t1 = new myThread(counter);
        myThread t2 = new myThread(counter);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(counter.getCount());
    }
}
