package Core.Topic_7_OOPS.Lec_3;

public class boxweight extends box{
    int weight ;

    boxweight(int l, int b, int h ,int weight){
        super(l ,b ,h); // what is this? actually this is callingh parent class (box) constructor , which is used to initialize the values of parent class
        this.weight = weight;
        System.out.println(super.weight);
    }
    boxweight(boxweight other){
        super(other);
        this.weight = other.weight;
    }

}
