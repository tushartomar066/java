package Core.Topic_8_multithreading.Topic_2_methodsInThread;

public class A extends Thread{
     @Override
     public void run(){
         try {
             Thread.sleep(5000);
         } catch (InterruptedException e) {
             throw new RuntimeException(e);
         }
     }


    public static void main(String[] args) throws InterruptedException {
        A t1 = new A();
        t1.start();
        t1.join(); // main thread wait until the thread t1 terminated
        System.out.println("Hello");


    }
}
