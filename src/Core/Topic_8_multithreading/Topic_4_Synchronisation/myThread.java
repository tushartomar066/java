package Core.Topic_8_multithreading.Topic_4_Synchronisation;

public class myThread extends Thread {
    private counter counter;

    myThread(counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for(int i = 0;i<1000;i++){
            counter.increment();
        }
    }
}
