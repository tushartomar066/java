package Core.Topic_7_OOPS.Lec_3;

public class box {
    private int l; // now this can be only be available in this file only where it is declared , classes other than this class won't be able to access this variable but in the box_weight class it is initialized because the super calling the box constructor not the box_weight constructor
    int b;
    int h;
    int weight;

    box() {
        this.l = -1;
        this.b = -1;
        this.h = -1;

    }
    public int getl(){
        return l;
    }
    box(int side){
        this.l = side;
        this.b = side;
        this.h = side;
    }

    box(int l, int b, int h) {
        this.l = l;
        this.b = b;
        this.h = h;
    }
    box( box com_box){
        this.l = com_box.l;
        this.b = com_box.b;
        this.h = com_box.h;

    }
}

