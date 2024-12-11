package Core.Topic_8_multithreading.Topic_4_Synchronisation;

public class counter {
    private int count = 0;

    /*The synchronized(this) ensures that only one thread at a time can execute the block of code inside the synchronized block. This prevents race conditions by allowing only one thread to modify count at a time.*/

    public void increment() {
        synchronized (this) {
            count++;
        }

    }

    public int getCount() {
        return count;
    }
}
