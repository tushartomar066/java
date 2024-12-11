package Core.Topic_8_multithreading.Topic_1_BasicsOfThreading.ByThreadClass;

public class nest {
    public static void main(String[] args) {
        world earth = new world();
         /* yeh functin main ko khtm nhi hone deta jb tk thread ka kaam n ho jaye */
        earth.run();

        /* this is for runnable interface */
        earth.start();

        /* After starting a thread we are not allowed to restart the same thread once again otherwise we will get a runtime exception called IllegalThreadStateException.*/

//       earth.start();
        /*------------------------------------------------------------------------------------*/




        for (int i = 0;i<5 ;i++ ) {
            System.out.println(Thread.currentThread().getName()+ i);
        }
    }
}
