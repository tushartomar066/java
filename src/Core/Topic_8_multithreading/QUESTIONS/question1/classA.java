package Core.Topic_8_multithreading.QUESTIONS.question1;

public class classA extends Thread{
    classA(String name){
        super(name);
    }
    public void run(){
        String a = "";
        for(int i = 0;i<5;i++){
            a+='a';
        }
        System.out.println(Thread.currentThread().getName());
    }
}
