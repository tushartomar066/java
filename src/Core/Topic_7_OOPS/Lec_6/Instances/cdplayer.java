package Core.Topic_7_OOPS.Lec_6.Instances;

public class cdplayer implements media{

    @Override
    public void start() {
        System.out.println("i am starting the music");
    }

    @Override
    public void stop() {
        System.out.println("I am stoping the music");
    }
}
