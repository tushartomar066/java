package Core.Topic_7_OOPS.Lec_6.Instances;

public class electricEngine implements  Engine{
    public void start() {
        System.out.println("i start like a electric car ");
    }

    @Override
    public void stop() {
        System.out.println("i stop like a electric car ");
    }

    @Override
    public void accelerate() {
        System.out.println("i accelerate like a electric car ");
    }
}
