package Core.Topic_8_multithreading.Topic_1_BasicsOfThreading.ByThreadClass;

class a extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName());
        }
    }
}

class b extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName());
        }
    }
}

class c extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName());
        }
    }
}

public class multiplethreads {
    public static void main(String[] args) throws InterruptedException {
        a a1 = new a();
        b b1 = new b();
        c c1 = new c();
        a1.setName("tushar");
        b1.setName("singh");
        c1.setName("tomar");
        a1.start();
        a1.join();
        b1.start();
        b1.join();
        c1.start();
        c1.join();

    }

}
