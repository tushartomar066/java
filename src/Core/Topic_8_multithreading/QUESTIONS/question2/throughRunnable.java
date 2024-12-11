package Core.Topic_8_multithreading.QUESTIONS.question2;

public class throughRunnable implements Runnable{

    int count = 0;
    public synchronized void run() {
        for(int i = 0;i<1000;i++){

        }
    }
    public void increment(){
        count++;
    }
    public void getCount(){
        System.out.println(count);
    }
    public static void main(String[] args) {
        throughRunnable t1 = new throughRunnable();

        Thread A = new Thread(t1);
        Thread B = new Thread(t1);
        Thread C = new Thread(t1);
        A.start();
        B.start();
        C.start();

    }
}
