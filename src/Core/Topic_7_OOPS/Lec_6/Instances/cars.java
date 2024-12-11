package Core.Topic_7_OOPS.Lec_6.Instances;

public class cars implements brake, Engine , media{

    @Override
    public void start() {
        System.out.println("i start like a normal car ");
    }

    @Override
    public void stop() {
        System.out.println("i stop like a normal car ");
    }

    @Override
    public void accelerate() {
        System.out.println("i accelerate like a normal car ");
    }

    @Override
    public void brake() {
        System.out.println("i brake like a normal car ");
    }
}
