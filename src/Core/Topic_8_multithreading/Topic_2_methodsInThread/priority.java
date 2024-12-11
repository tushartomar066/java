package Core.Topic_8_multithreading.Topic_2_methodsInThread;

public class priority extends Thread {
    priority(String name) {
        super(name);
    }

    @Override
    public void run() {
       for(int i = 0;i<5;i++){
           String a = "";
           for (int j = 0; j < 100000; j++) {
               a += "a";
           }
           System.out.println("name : " + Thread.currentThread().getName() + ", priority" + " : " + Thread.currentThread().getPriority());

           try {
               Thread.sleep(2000);
           } catch (InterruptedException ex) {
               throw new RuntimeException(ex);
           }

       }



    }

    public static void main(String[] args) {
        priority t1 = new priority("low");
        priority t2 = new priority("medium");
        priority t3 = new priority("high");
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
        t3.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
    }

}
