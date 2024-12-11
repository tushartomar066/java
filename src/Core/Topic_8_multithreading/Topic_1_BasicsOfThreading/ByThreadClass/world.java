package Core.Topic_8_multithreading.Topic_1_BasicsOfThreading.ByThreadClass;

public class world extends Thread {

    @Override
    public void run() {
        for( int i = 0;i<5 ;i++ ){
            System.out.println(Thread.currentThread().getName() + i);
        }
    }
}

//
//public class world implements Runnable{
//    @Override
//    public void run() {
//        for( ; ; ){
//            System.out.println(Thread.currentThread().getName());
//        }
//    }
//
//
//}