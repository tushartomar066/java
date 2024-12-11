package Core.Topic_7_OOPS.Lec_6.Instances;

public class powerEngine implements Engine
{

    public void start() {
        System.out.println("i start like a power car ");
    }

    @Override
    public void stop() {
        System.out.println("i stop like a power car ");
    }

    @Override
    public void accelerate() {
        System.out.println("i accelerate like a power car ");
    }
}
