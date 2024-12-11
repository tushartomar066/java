package Core.Topic_8_multithreading.Topic_3_LifeCycleOfThread;

public class test extends Thread {
    @Override
    public void run() {
        System.out.println("Running");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println(e);

        }
    }



       // we can also use the wait function  , which does not require the time as parameter
    public static void main(String[] args) throws InterruptedException {
    test t1 = new test();
        System.out.println(t1.getState());
        t1.start();
        System.out.println(t1.getState());
        Thread.sleep(2000);
        System.out.println(t1.getState());
        t1.join();
        System.out.println(t1.getState());
    }
}
