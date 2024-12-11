package Core.Topic_8_multithreading.QUESTIONS.question1;

public class MAINCLASS extends Thread{

    public static void main(String[] args) {
        classA t1 = new classA("Thread -> a");
        classB t2 = new classB("Thread -> b");
        classC t3 = new classC("Thread -> c");
        t2.setPriority(MAX_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
        System.out.println(Thread.currentThread().getName());

    }
}
