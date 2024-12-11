package Core.Topic_7_OOPS.Lec_6.Instances;

public class nicecar {
    private Engine engine;
    private media player ;
    nicecar(){
        engine = new powerEngine();
        player = new cdplayer();
    }
    nicecar(Engine temp){
        this.engine = temp;
    }
    public void startEngine(){
        engine.start();
    }
    public void stopEngine(){
        engine.stop();
    }
    public void startMedia(){
        player.start();
    }
    public void stopMedia(){
        player.stop();
    }
    public void changer(){
        this.engine = new electricEngine();
    }


}
