package Core.Topic_7_OOPS.Lec_6.Instances;

public class main {
    public static void main(String[] args) {
//        Engine zen = new cars();
//        zen.start();
//        zen.stop();
//        zen.accelerate();
//        media carmedia = new cars();
//        carmedia.start();
        nicecar nc = new nicecar();
        nc.startEngine();
        nc.startMedia();
        nc.changer();
        nc.startEngine();
    }

}
