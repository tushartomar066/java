package Core.Topic_8_multithreading.QUESTIONS.question1;

public class classC extends Thread{
    classC(String name){
        super(name);
    }
    public void run(){
        String a = "";
        for(int i = 0;i<5;i++){
            a+='a';
        }
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(Thread.currentThread().getName());
    }
}
